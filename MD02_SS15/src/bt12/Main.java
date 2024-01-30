package bt12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.5, 3.3, 5.6, 7.5, 8.4, 8.5, 8.6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        double input = Double.parseDouble(sc.nextLine());
        if(binarySearch(arr,input)) {
            System.out.println("Co trong mang");
        } else {
            System.out.println("khong co trong mang");
        }
    }
    private static boolean binarySearch(double[] arr, double input) {
        int low = 0;
        int high = arr.length -1;
        while (high >= low) {
            int mid = low + (high - low)/2;
            if(arr[mid] > input) {
                high = mid + 1;
            } if(arr[mid] <input) {
                low = mid -1;
            } if(arr[mid] == input) {
                return true;
            }
        }
        return false;
    }
}
