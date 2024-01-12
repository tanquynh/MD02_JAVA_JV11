package ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6};
        System.out.print("Nhập vào phần tử muốn thêm vào trong mảng: ");
        int userInput = sc.nextInt();
        addNumber(arr, userInput);
        System.out.print("Nhập vào phần tử muốn xóa trong mảng: ");
        int deleteNumber = sc.nextInt();
        deleteItem(arr, deleteNumber);
    }

    public static void addNumber(int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = number;
        System.out.println("Mảng sau khi thêm phần tử " + number + " là: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    public static void deleteItem(int[] arr, int userInput) {
        int[] newArray = new int[arr.length - 1];
        int indexDel = indexOf(userInput, arr);
        if (indexDel != -1) {
            System.out.println("Mảng ban đầu là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] != userInput) {
                    newArray[j++] = arr[i];
                }
            }
            System.out.println("Mảng sau khi xóa phần tử " + userInput + " là: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Không tìm thấy phần tử trong mảng.");
        }
    }

    public static int indexOf(int element, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}