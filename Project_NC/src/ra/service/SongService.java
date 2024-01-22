package ra.service;

import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class SongService {
    public static Song[] songs = new Song[0];
    public static Song findbyId(String songId) {
        for (Song song : songs) {
            if(song.getSongId().equals(songId)) {
                return song;
            }
        }
        return null;
    }
    public static Song findSongBySingerId(int id) {
        for (Song song : songs) {
            if(song.getSinger().getSingerId() == id) {
                return song;
            }
        }
        return null;
    }
    public static int findIndexByid(String id) {
        for (int i = 0; i < songs.length ; i++) {
            if(songs[i].getSinger().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static void addSong() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong ca si them moi");
        int n = Integer.parseInt(sc.nextLine());
        Song[] songs1 = new Song[songs.length + n];
        for (int i = 0; i < songs.length; i++) {
            songs1[i] = songs[i];
        }
        for (int i = 0; i < n ; i++) {
            System.out.println("Them ca si thu " + (i+1));
            Song song = new Song();
            song.inputData();
            songs1[songs.length+i] = song;
        }
        songs =songs1;
        System.out.println("Da them "+ n+ " bai hat");
    }

    public static void displaySong() {
        if(songs.length == 0) {
            System.err.println("Danh sach bai hat trong");
        } else {
            System.out.println("-----------------Danh sach bai hat -----------------");
            for (Song song : songs) {
                song.displayData();
            }
        }
    }

    public static void editSong() {

    }

    public static void deleteSong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id bai hat can xoa");
        while (true) {
            String id = sc.nextLine();
            int index = findIndexByid(id);
            if (index != -1) {
                    Song[] songs1 = new Song[songs.length -1];
                    for (int i = 0; i < index; i++) {
                        songs1[i] = songs[i];
                    }
                    for (int i = index; i < songs.length ; i++) {
                        songs1[i]=songs[i+1];
                    }
                    songs =songs1;
                    break;

            } else {
                System.err.println("Id khong phu hop moi chon lai");
            }
        }
    }
}
