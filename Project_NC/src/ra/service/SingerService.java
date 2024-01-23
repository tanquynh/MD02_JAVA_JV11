package ra.service;

import ra.model.Singer;
import ra.model.Song;
import ra.validate.SingerValidate;

import java.util.Scanner;

public class SingerService {
    private static int nextId = 1;
    public static Singer[] singers = new Singer[0];
    public static Singer findById(int id) {
        for (Singer singer : singers) {
            if(singer.getSingerId() == id) {
                return singer;
            }
        }
        return null;
    }
    public static int findIndexByid(int id) {
        for (int i = 0; i < singers.length ; i++) {
            if(singers[i].getSingerId() == id) {
                return i;
            }
        }
        return -1;
    }
    public  static void displaySinger() {
        if(singers.length == 0) {
            System.err.println("Danh sach ca si trong");
        } else {
            System.out.println("-----------------Danh sach ca si -----------------");
            for (Singer singer : singers) {
                singer.displayData();
            }
        }

    }

    public static void addSinger() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong ca si them moi");
        int n = Integer.parseInt(sc.nextLine());
        Singer[] singers1 = new Singer[singers.length + n];
        for (int i = 0; i < singers.length; i++) {
            singers1[i] = singers[i];
        }
        for (int i = 0; i < n ; i++) {
            System.out.println("Them ca si thu " + (i+1));
            Singer singer = new Singer();
            singer.setSingerId(nextId++);
            singer.inputData();
            singers1[singers.length+i] = singer;
        }
        singers =singers1;
        System.out.println("Da them "+ n+ " ca si");
    }


    public static void editSinger() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap id ca si can thay doi thong tin");
        int id = Integer.parseInt(sc.nextLine());
        Singer singer = SingerService.findById(id);
        boolean isExit = true;
        if(singer != null) {
            System.out.println("Nhập vào tên ca si mới (Enter để bỏ qua):");
            do {
                String newSingerName = sc.nextLine();
                if (newSingerName.trim().isEmpty()) {
                    break;
                } else {
                    singers[id].setSingerName(newSingerName);
                }
            } while (isExit);
            System.out.println("Nhập vào tuoi ca si mới (Enter để bỏ qua):");
            do {
                int newAge = Integer.parseInt(sc.nextLine());
                if (newAge == 0 ) {
                    break;
                } else {
                    if(SingerValidate.validateInt(newAge)) {
                        singers[id].setAge(newAge);
                        break;
                    }
                    else {
                        System.err.println("Tuoi phai lon hon 0");
                    }

                }
            } while (isExit);
            System.out.println("Nhập vào quoc tich mới (Enter để bỏ qua):");
            do {
                String newNatitionlity = sc.nextLine();
                if (newNatitionlity.trim().isEmpty()) {
                    break;
                } else {
                    singers[id].setNationlity(newNatitionlity);
                }
            } while (isExit);
            System.out.println("Nhập vào gioi tinh moi mới [Nam/Nu] (Enter để bỏ qua):");
            do {
                String name = sc.nextLine();
                if (name.trim().isEmpty()) {
                    break;
                } else  if(name.equalsIgnoreCase("nam")) {
                   singers[id].setGender(true)  ;
                    break;
                } else if(name.equalsIgnoreCase("nu")) {
                    singers[id].setGender(false)  ;
                    break;
                } else {
                    System.err.println("Gioi tinh nhap [nam/nu]");
                }
            } while (isExit);
            System.out.println("Nhập vào the loai mới (Enter để bỏ qua):");
            do {
                String newGenre = sc.nextLine();
                if (newGenre.trim().isEmpty()) {
                    break;
                } else {
                    singers[id].setGenre(newGenre);
                }
            } while (isExit);
        }
    }

    public static void deleteSinger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ca si can xoa");
      while (true) {
          int id = Integer.parseInt(sc.nextLine());
          int index = findIndexByid(id);
          if (index != -1) {
              Song song =SongService.findSongBySingerId(id);
                if(song ==null) {
                    Singer[] singers1 = new Singer[singers.length -1];
                    for (int i = 0; i < index; i++) {
                        singers1[i] = singers[i];
                    }
                    for (int i = index; i < singers.length ; i++) {
                        singers1[i]=singers[i+1];
                    }
                    singers =singers1;
                    break;
                } else {
                    System.err.println("Ca si co bai hat khong xoa duoc");
                }

          } else {
              System.err.println("Id khong phu hop moi chon lai");
          }
      }
    }
}
