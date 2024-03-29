package bussiness;

import java.util.Scanner;

public class BookManagement {
    // Tạo mảng sách ban đầu sẽ chứa được 100 phần tử
    public static Book[] arrBook = new Book[100];
    // Tạp biến currentIndex để biết được số sách đã nhập vào
    public static int currentIndex = 0;

    public static void main(String[] args) {

        Book book = new Book();

        Scanner sc = new Scanner(System.in);
        int choice, numberOfBook, bookId, deleteIndex, changeIndex;
        String searchTerm;

        // MENU
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("Nhập 1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("Nhập 2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("Nhập 3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("Nhập 4. Xóa sách theo mã sách");
            System.out.println("Nhập 5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("Nhập 6. Thay đổi thông tin theo mã sách");
            System.out.println("Nhập 7. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // Nhập số sách (n) cần nhập thông tin từ bàn phím và thực hiện nhập thông tin cho  n cuốn sách đó ,
                    // yêu cầu validate dữ liệu.(danh sách tối đa là 100 phần tử)

                    System.out.println("Vui lòng nhập vào số lượng sách muốn thêm mới:");
                    numberOfBook = Integer.parseInt(sc.nextLine());
                    if (numberOfBook < arrBook.length - currentIndex) {
                        for (int i = 0; i < numberOfBook; i++) {
                            addBook(sc, currentIndex);
                            currentIndex++;
                        }
                    } else {
                        System.err.println("Số vị trí còn trống không đủ để thêm mới, vui lòng nhập lại.");
                    }
                    break;
                case 2:
                    // Hiển thị tất cả sách đang lưu trữ
                    for (int i = 0; i < currentIndex; i++) {
                        arrBook[i].displayData();
                    }
                    break;
                case 3:
                    // Sử dụng thuật toán sắp xếp để sắp xếp sách đang lưu trữ theo lợi nhuận tăng

                    for (int i = 0; i < currentIndex - 1; i++) {
                        for (int j = i + 1; j < currentIndex; j++) {
                            if (arrBook[i].getInterest() > arrBook[j].getInterest()) {
                                Book temp = arrBook[i];
                                arrBook[i] = arrBook[j];
                                arrBook[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < currentIndex; i++) {
                        arrBook[i].displayData();
                        System.out.println("Lợi nhuận: " + arrBook[i].getInterest());
                    }
                    break;
                case 4:
                    // Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách
                    System.out.println("Vui lòng nhập vào mã sách muốn xóa:");
                    bookId = Integer.parseInt(sc.nextLine());
                    deleteIndex = getBookIndexById(bookId, arrBook, currentIndex);
                    if (deleteIndex != -1) {
                        deleteBookByIndex(deleteIndex, arrBook, currentIndex);
                        currentIndex--;
                    } else {
                        System.err.println("Mã sách không tồn tại!!!");
                    }
                    break;
                case 5:
                    // Nhập chuỗi tìm kiếm từ bàn phím, thực hiện tìm và in ra những sách có tên hoặc
                    //mô tả phù hợp.
                    System.out.println("Vui lòng nhập vào tên sách hoặc mô tả sách muốn tìm kiếm:");
                    searchTerm = sc.nextLine();
                    searchBookByBookNameOrDescriptions(searchTerm, arrBook, currentIndex);
                    break;
                case 6:
                    // Nhập vào mã sản phẩm, thay đổi các thông tin sách ,validate dữ liệu như thêm mới.

                    System.out.println("Vui lòng nhập vào mã sách muốn thay đổi thông tin:");
                    bookId = Integer.parseInt(sc.nextLine());
                    changeIndex = getBookIndexById(bookId, arrBook, currentIndex);
                    changeBookDataByIndex(sc, changeIndex, arrBook, currentIndex);
                    break;
                case 7:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập vào lựa chọn là số nguyên từ 1-7");
            }
        } while (true);
    }

    public static void addBook(Scanner sc, int currentIndex) {
        arrBook[currentIndex] = new Book();
        arrBook[currentIndex].inputData(sc, arrBook, currentIndex);
    }

    public static int getBookIndexById(int bookId, Book[] arrBook, int currentIndex) {
        int bookIndex = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (arrBook[i].getBookId() == bookId) {
                bookIndex = i;
            }
        }
        return bookIndex;
    }

    public static void deleteBookByIndex(int deleteIndex, Book[] arrBook, int currentIndex) {
        for (int i = deleteIndex; i < currentIndex - 1; i++) {
            arrBook[i] = arrBook[i + 1];
        }
        arrBook[currentIndex - 1] = null;
    }

    public static void searchBookByBookNameOrDescriptions(String searchTerm, Book[] arrBook, int currentIndex) {
        System.out.println();
        int searchResultsCount = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (arrBook[i].getBookName().toLowerCase().contains(searchTerm.trim().toLowerCase()) || arrBook[i].getDescriptions().toLowerCase().contains(searchTerm.trim().toLowerCase())) {
                arrBook[i].displayData();
                searchResultsCount++;
            }
        }
        if (searchResultsCount == 0) {
            System.err.println("Không tìm thấy sách phù hợp!!!");
        }
    }

    public static void changeBookDataByIndex(Scanner sc, int changeIndex, Book[] arrBook, int currentIndex) {
        boolean isExit = true;
        System.out.println("Nhập vào tên sách mới (Enter để bỏ qua):");
        do {
            String newBookName = sc.nextLine();
            if (newBookName.trim().isEmpty()) {
                break;
            } else {
                arrBook[changeIndex].setBookName(newBookName);
            }
        } while (isExit);
        System.out.println("Nhập vào tên tác giả mới (Enter để bỏ qua):");
        do {
            String newAuthor = sc.nextLine();
            if (newAuthor.trim().isEmpty()) {
                break;
            } else {
                arrBook[changeIndex].setAuthor(newAuthor);
            }
        } while (isExit);
        System.out.println("Nhập vào mô tả sách mới (Enter để bỏ qua):");
        do {
            String newDescription = sc.nextLine();
            if (newDescription.trim().isEmpty()) {
                break;
            } else {
                if (newDescription.trim().length() <= 10) {
                    System.err.println("Phần mô tả sách không được ngắn hơn 10 ký tự");
                } else {
                    arrBook[changeIndex].setDescriptions(newDescription);
                    break;
                }
            }
        } while (isExit);
        System.out.println("Nhập vào giá nhập mới (Enter để bỏ qua):");
        do {
            String newImportPrice = sc.nextLine();
            if (newImportPrice.trim().isEmpty()) {
                break;
            } else {
                if (Double.parseDouble(newImportPrice) > 0) {
                    arrBook[changeIndex].setImportPrice(Double.parseDouble(newImportPrice));
                    break;
                } else {
                    System.err.println("Giá nhập phải lớn hơn 0");
                }
            }
        } while (isExit);
        System.out.println("Nhập vào giá xuất mới (Enter để bỏ qua):");
        do {
            String newExportPrice = sc.nextLine();
            if (newExportPrice.trim().isEmpty()) {
                break;
            } else {
                if (Double.parseDouble(newExportPrice) > 1.2 * arrBook[changeIndex].getImportPrice()) {
                    arrBook[changeIndex].setExportPrice(Double.parseDouble(newExportPrice));
                    break;
                } else {
                    System.err.println("Giá xuất phải lớn hơn 1.2 lần giá nhập!!!");
                }
            }
        } while (isExit);
        System.out.println("Nhập vào trạng thái mới (Enter để bỏ qua):");
        do {
            String newBookStatus = sc.nextLine();
            if (newBookStatus.trim().isEmpty()) {
                break;
            } else {
                if (newBookStatus.trim().equals("true") || newBookStatus.trim().equals("false")) {
                    arrBook[changeIndex].setBookStatus(Boolean.parseBoolean(newBookStatus));
                    break;
                } else {
                    System.err.println("Vui lòng nhập vào 'true' hoặc 'false'");
                }
            }
        } while (isExit);
    }
}
