package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationlity;
    private boolean gender;
    private String genre;

    public Singer() {
    }

    public Singer(int singerId, String singerName, int age, String nationlity, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationlity = nationlity;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationlity() {
        return nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ten ca si");
            this.singerName = sc.nextLine();
            if(!singerName.isEmpty()) {
                break;
            }else {
                System.err.println("Ten ca si khong duoc de trong");
            }
        }
        while (true) {
            System.out.println("Nhap ten tuoi ca si");
            this.age = Integer.parseInt(sc.nextLine());
            if(age > 0) {
                break;
            }else {
                System.err.println("Tuoi ca si phai lon hon 0");
            }
        }
        while (true) {
            System.out.println("Nhap quoc tich");
            this.nationlity = sc.nextLine();
            if(!nationlity.isEmpty()) {
                break;
            }else {
                System.err.println("Quoc tich khong duoc de trong");
            }
        }
        while (true) {
            System.out.println("Nhap gioi tinh [Nam/Nu]");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("nam")) {
                this.gender = true;
                break;
            } else if(name.equalsIgnoreCase("nu")) {
                this.gender = false;
                break;
            } else {
                System.err.println("Gioi tinh nhap [nam/nu]");
            }

        }
        while (true) {
            System.out.println("Nhap the loai");
            this.genre = sc.nextLine();
            if(!genre.isEmpty()) {
                break;
            }else {
                System.err.println("The loai khong duoc de trong");
            }
        }


    }
    public void displayData(){
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | Age : %-3s | Genre : %-10s | Sex : %-5s | National : %-15s \n",
                singerId, singerName, age, genre, gender?"Nam":"Nữ", nationlity);
    }
    public String toString(){
        return String.format("ID : %-3s | Name : %-10s\n",
                singerId, singerName);
    }
}
