package bt10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số min:");
        int min = sc.nextInt();
        System.out.println("Nhập số max:");
        int max = sc.nextInt();

        // Bước 3: Tìm vị trí của số lớn hơn gần nhất với min và nhỏ hơn gần nhất với max
        int minIndex = binarySearchClosest(arr, min, true);
        int maxIndex = binarySearchClosest(arr, max, false);

        // Bước 4: In ra số lượng số tìm thấy và chi tiết số đó
        int foundCount = maxIndex - minIndex + 1;

        System.out.println("Số lượng số tìm thấy: " + foundCount);
        System.out.println("Chi tiết các số:");
        for (int i = minIndex; i <= maxIndex; i++) {
            System.out.println(arr[i]);
        }
    }
    private static int binarySearchClosest(Integer[] arr, int key, boolean findGreater) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] > key) {
                if (findGreater) {
                    result = mid;
                }
                low = mid + 1;
            } else {
                if (!findGreater) {
                    result = mid;
                }
                high = mid - 1;
            }
        }

        return result;
    }

    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
