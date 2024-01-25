package ra.repository;

import ra.model.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static ra.constan.Constan.FilePath.COMMON_PATH;

public class FileRepo <T extends Entity, ID extends Number>{
    private File fileName;

    public FileRepo() {
    }

    public FileRepo(String filePath) {
        File dataDir = new File(COMMON_PATH);
        if (!dataDir.exists()) {
            dataDir.mkdir();
        }
        this.fileName = new File(COMMON_PATH + filePath);
        if (!fileName.exists()) {
            try {
                fileName.createNewFile();
            } catch (IOException e) {
                System.err.println("Có lỗi khi tạo thư mục");
            }
        }
    }
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(this.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           list = (List<T>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
        return list;
    }
    public void saveToFile(List<T> t) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.close();
        } catch (IOException e) {
            System.err.println("Co lỗi khi lưu file");
        }
    }
    public void save(T t) {
        List<T> list = findAll();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(t.getId())) {
                index = i;
                break;
            }
        }
        if(index != -1) {
           list.set(index,t);
        } else {
            list.add(t);
        }
        saveToFile(list);
    }

    public T findById(ID id) {
        List<T> list = findAll();
       for (T t : list) {
           if(t.getId().equals(id)) {
               return t;
           }
       }
           return null;
    }
    public int findIndexById(ID id) {
        List<T> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public int autoId() {
        List<T> list = findAll();
        int maxId = list.isEmpty() ? 0 : list.get(list.size() - 1).getId().intValue();
        return maxId + 1;
    }

}
