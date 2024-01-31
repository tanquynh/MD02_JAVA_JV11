package bthop.repository;

import bthop.model.Entity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static bthop.constant.Constant.FilePath.COMMON_PATH;

public class FileRepo<T extends Entity, ID> {
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
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            return new ArrayList<>();
        }
        return list;
    }

    public void saveToFile(List<T> t) {
        try {
            FileOutputStream fos = new FileOutputStream(this.fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
