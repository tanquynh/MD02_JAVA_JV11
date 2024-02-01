package bt5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Test {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        Integer[] arr1 = arr.clone();
        Integer[] arr2 = arr.clone();
        bubbleSort(arr,Comparator.comparingInt(value ->  value));
        System.out.println(Arrays.toString(arr));
        selectionSort(arr1,Comparator.comparingInt(e->e));
        System.out.println(Arrays.toString(arr1));
        insertSort(arr2,Comparator.comparingInt(e->e));
        System.out.println(Arrays.toString(arr2));
    }
    public static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {

        if(arr.length == 0) {
            System.err.println("Mang rong");
        } else {
            boolean nextPass = true;
            for (int i = 1; i < arr.length && nextPass; i++) {
                nextPass = false;
                for (int j = 0; j < arr.length-i; j++) {
                    if(comparator.compare(arr[j],arr[j+1] ) <0) {
                        T temp = arr[j];
                        arr[j] =arr[j+1];
                        arr[j+1] = temp;
                        nextPass = true;
                    }
                }
            }
        }
    }

    public static  <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        if(arr.length == 0) {
            System.err.println("Mang rong");
        } else {
            for (int i = 0; i < arr.length; i++) {
                int maxIndex = i;
                for (int j = i+1; j < arr.length; j++) {
                    if(comparator.compare(arr[maxIndex],arr[j] ) <0) {
                        T temp = arr[maxIndex];
                        arr[maxIndex] = arr[j];
                        arr[j] =temp;
                    }
                }


            }
        }
    }

    public static <T> void insertSort(T[] arr, Comparator<T> comparator) {
        if(arr.length == 0) {
            System.err.println("Mang rong");
        } else {
            for (int i = 0; i < arr.length; i++) {
                int holePosition = i;
                T valueInset = arr[i];
                while (holePosition > 0 && comparator.compare(arr[holePosition-1],valueInset) <0) {
                    arr[holePosition] = arr[holePosition-1];
                    holePosition = holePosition-1;
                }
                arr[holePosition] = valueInset;
            }
        }
    }
}
