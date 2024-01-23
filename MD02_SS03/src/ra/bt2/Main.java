package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Nhập vào phần tử muốn thêm vào trong mảng: ");
        int userInput = sc.nextInt();
        System.out.println("Nhập vào vị trí muốn thêm vào trong mảng (từ 0 => 9): ");
        int index;
        do {
            index = sc.nextInt();
            if (index < 0 || index > 9) {
                System.out.print("Vị trí đã nhập nằm ngoài phạm vi cho phép thêm vào. Vui lòng nhập lại: ");
            }
        } while (index < 0 || index > 9);
        System.out.println("Mảng ban đầu là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = arr.length-1; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = userInput;
        System.out.println("Mảng sau khi thêm phần tử " + userInput + " là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
