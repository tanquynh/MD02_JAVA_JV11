package bt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        bubbleSortByT( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void insertionSort(int[] arr) {
        int holePosition;
        int valueToInsert;
        for (int i = 0; i < arr.length; i++) {
            valueToInsert = arr[i];
            holePosition = i;
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition = holePosition - 1;

            }
            arr[holePosition] = valueToInsert;
        }
    }
    public static <T extends Comparable<T>> void insertSort(T[] arr) {
        int holePosition;
        T valueToInsert;
        for (int i = 0; i < arr.length; i++) {
            valueToInsert = arr[i];
            holePosition = i;
           while (holePosition > 0 && arr[holePosition -1].compareTo(valueToInsert) > 0) {
               arr[holePosition] = arr[holePosition -1] ;
               holePosition = holePosition -1;
           }
           arr[holePosition] = valueToInsert;
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static <T extends Comparable<T>> void  selectionSortByT(T[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[j+1]) < 0) {
                    minIndex = j;
                }
            }
            if(minIndex !=i) {
                T temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void bubbleSort(int[] arr) {
        boolean nextPass = true;
        for (int i = 1; i < arr.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                int swap = 0;
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    nextPass = true;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSortByT(T[] arr) {
            boolean nextPass = true;
        for (int i = 1; i < arr.length && nextPass; i++) {
            nextPass = false;
            for (int j = 0; j < arr.length -i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    T swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    nextPass = true;
                }
            }
        }
    }
}
