package bt6;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Integer[] intArr = getArr();
        Arrays.stream(intArr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số:");
        int input = Integer.parseInt(sc.nextLine());
        int index = binarySearch(intArr, input);
        if (index != -1) {
            System.out.println("Vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy số trong mảng.");
        }
    }

    private static int binarySearch(Integer[] intArr, int input) {
        int low = 0;
        int high = intArr.length - 1;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (intArr[mid] > input) {
                high = mid - 1;
            } else if (intArr[mid] < input) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    public static  Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
