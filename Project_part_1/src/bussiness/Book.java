package bussiness;

import java.util.Scanner;

public class Book {
    private static int nextId = 0;
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus = true;

    public Book() {
        this.bookId = nextId;
        nextId++;
    }

    public Book(String bookName, String author, String descriptions, double importPrice, double exportPrice, boolean bookStatus) {
        this.bookId = nextId;
        nextId++;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void inputData(Scanner sc, Book[] arrBook, int currentIndex) {
        boolean isExit = true;

        this.bookId = currentIndex;

        System.out.println("Nhập vào tên sách:");
        do {
            this.bookName = sc.nextLine();
            if (!this.bookName.trim().isEmpty()) {
                break;
            } else {
                System.err.println("Tên sách không được để trống!!!");
            }
        } while (isExit);

        System.out.println("Nhập vào tên tác giả:");
        do {
            this.author = sc.nextLine();
            if (!this.author.trim().isEmpty()) {
                break;
            } else {
                System.err.println("Tên tác giả không được để trống!!!");
            }
        } while (isExit);

        System.out.println("Nhập vào mô tả sách:");
        do {
            this.descriptions = sc.nextLine();
            if (!this.descriptions.trim().isEmpty()) {
                if (this.descriptions.trim().length() > 10) {
                    break;
                } else {
                    System.err.println("Phần mô tả sách không được ngắn hơn 10 ký tự!!!");
                }
            } else {
                System.err.println("Phần mô tả sách không được để trống!!!");
            }
        } while (isExit);

        System.out.println("Nhập vào giá nhập:");
        do {
            this.importPrice = Double.parseDouble(sc.nextLine());
            if (this.importPrice > 0) {
                break;
            } else {
                System.err.println("Giá nhập phải lớn hơn 0!!!");
            }
        } while (isExit);

        System.out.println("Nhập vào giá xuất:");
        do {
            this.exportPrice = Double.parseDouble(sc.nextLine());
            if (this.exportPrice > this.importPrice * 1.2) {
                break;
            } else {
                System.err.println("Giá xuất phải lớn hơn 1.2 lần giá nhập!!!");
            }
        } while (isExit);
        // Cập nhật trạng thái sách
        System.out.println("Nhập vào trạng thái (nhập 'true' hoặc 'false'):");
        do {
            String inputBookStatus = sc.nextLine();
            if (inputBookStatus.trim().equals("true") || inputBookStatus.trim().equals("false")) {
                this.bookStatus = Boolean.parseBoolean(inputBookStatus.trim());
                break;
            } else {
                System.err.println("Vui lòng nhập 'true' hoặc 'false'");
            }
        } while (isExit);
        // Tính toán tiền lãi
        this.interest = (float) (this.exportPrice - this.importPrice);
    }

    public void displayData() {
        System.out.printf("Mã sách: %-5d  Tên sách: %-15s  Tác giả: %-15s\n", this.bookId, this.bookName, this.author);
        System.out.printf("Mô tả: %-50s\n", this.descriptions);
        System.out.printf("Giá nhập: %-10.2f Giá xuất: %-10.2f Tình trạng: %b\n", this.importPrice, this.exportPrice, this.bookStatus);
    }
}
