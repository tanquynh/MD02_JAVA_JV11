package ra.bt1;

import java.util.Scanner;

public class Main {
    //    BÀI TẬP
//    Xóa một phần tử được nhập vào từ bàn phím ra khỏi mảng, nếu phần tử ó xuất hiện trong mảng
//    + Step 1: Tìm phần tử => Có / Không
//    + Step 2: Xóa phần tử/Hiển thị thông báo
//    Bài này không dùng hàm có sẵn nên sẽ làm như sau:
//    Tìm phần tử => Không => Hiển thị thông báo
//    Có => Tìm vị trí của phần tử đó bằng method indexOf()
//    Chạy vòng lặp từ index đến hết, ghi đè phần tử phía sau lên phần tử phía trước
//    Phần tử cuối cùng gán cho giá trị 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Nhập vào phần tử muốn xóa: ");
        int userInput = sc.nextInt();
        int indexDel = indexOf(userInput, arr);
        if (indexDel != -1) {
            System.out.println("Mảng ban đầu là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = indexDel; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("Mảng sau khi xóa phần tử " + userInput + " là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng.");
        }
    }

    //    Hàm xác định vị trí index của phần từ đầu tiên tìm được từ trái qua
    public static int indexOf(int element, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }

        }
        return -1;
    }
}
