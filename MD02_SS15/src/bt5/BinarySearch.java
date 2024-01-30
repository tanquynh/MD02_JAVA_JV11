package bt5;

import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra");
        int input = Integer.parseInt(sc.nextLine());
        int index = binarySearch(arr, input);
        if (index != -1) {
            System.out.println("So can tim ow vi tri : " + index);
        } else {
            System.out.println("So can tim khong ton tai");
        }
    }

    private static int binarySearch(int[] arr, int input) {
        int low = 0;
        int hight = arr.length - 1;
        while (hight >= low) {
            int mid = low + (hight - low) / 2;
            if (arr[mid] > input) {
                hight = mid - 1;
            }
            if (arr[mid] < input) {
                low = mid + 1;
            }
            if (arr[mid] == input) {
                return mid;
            }
        }
        return -1;
    }
}
