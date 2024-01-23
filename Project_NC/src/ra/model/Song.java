package ra.model;

import ra.service.SingerService;
import ra.service.SongService;
import ra.validate.SongValidate;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String description;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String description, Singer singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.description = description;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }
    public void inputData(){

    }
    public void displayData() {
        Scanner sc = new Scanner(System.in);
        if(SingerService.singers.length == 0) {
            System.err.println("Danh sach ca si trong, moi nhap thong tin ca si truoc");
            return;
        }
        while (true) {
            System.out.println("Nhap song id");
            this.songId = sc.nextLine();
            if(SongValidate.validateSongid(songId)) {
                if(SongService.findbyId(songId) == null) {
                    break;
                } else {
                    System.err.println("Id bai hat trung, moi nhap id moi");
                }
            } else {
                System.err.println("Song id khong dung dinh dang, moi nhap lai");
            }
        }
        while (true) {
            System.out.println("Nhap ten bai hat");
            this.songName = sc.nextLine();
            if(!songName.isEmpty()) {
                break;
            }else {
                System.err.println("Ten bai hat khong duoc de trong");
            }
        }
        while (true) {
            System.out.println("Nhap mo ta bai hat");
            this.description = sc.nextLine();
            if(!description.isEmpty()) {
                break;
            }else {
                System.err.println("Mo ta bai hat khong duoc de trong");
            }
        }
       while (true) {
           System.out.println("Nhap ten ca si");
           System.out.println("--------------Danh sach ca si---------------");
         for (Singer singer : SingerService.singers) {
             System.out.println(singer);
         }
               System.out.println("Nhap id ca si");
               int id = Integer.parseInt(sc.nextLine());
               Singer singer = SingerService.findById(id);
               if(singer != null) {
                   this.singer =singer;
                   break;
               } else {
                   System.err.println("id ca si khong dung, moi nhap lai");
               }

       }
        while (true) {
            System.out.println("Nhap nguoi sang tac");
            this.songName = sc.nextLine();
            if(!songName.isEmpty()) {
                break;
            }else {
                System.err.println("Nguoi sang tac khong duoc de trong");
            }
        }
        createdDate = new Date();
        while (true) {
            System.out.println("Nhap trang thai [active/inactive]");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("active")) {
                this.songStatus = true;
                break;
            } else if(name.equalsIgnoreCase("inactive")) {
                this.songStatus = false;
                break;
            } else {
                System.err.println("Nhap trang thai [active/inactive]");
            }

        }
    }
}
