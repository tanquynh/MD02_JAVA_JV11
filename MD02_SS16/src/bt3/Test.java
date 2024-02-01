package bt3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        String[] arr1 = arr.clone();
        String[] arr2 = arr.clone();
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    private static <T extends Comparable<T>> void insertSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int holePosition = i;
            T valueInsertSort = arr[i];
            while (holePosition > 0 && arr[holePosition-1].compareTo(valueInsertSort) >0) {
                arr[holePosition ] = arr[holePosition -1];
                holePosition = holePosition -1;
            }
            arr[holePosition] = valueInsertSort;
        }
    }
    private static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    private static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        if (arr.length == 0) {
            System.err.println("Mang rong");
        }
        {
            boolean nextPass = true;
            for (int i = 1; i < arr.length && nextPass; i++) {
                nextPass = false;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        nextPass = true;
                    }
                }
            }

        }
    }
}
