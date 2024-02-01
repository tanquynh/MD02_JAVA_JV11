import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        Integer[] arr = {9, 5, 1, 4, 3};
        System.out.print("Original array: ");
        printArray(arr);

        arr = mergeSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }



    public static <T extends Comparable<T>> T[] mergeSort(T[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        T[] l1 = Arrays.copyOfRange(arr, 0, mid);
        T[] l2 = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort each half
        l1 = mergeSort(l1);
        l2 = mergeSort(l2);

        // Merge the sorted halves
        return merge(l1, l2);
    }

    private static <T extends Comparable<T>> T[] merge(T[] a, T[] b) {
        int i = 0, j = 0, k = 0;
        T[] c = Arrays.copyOf(a, a.length + b.length);

        // Merge elements from arrays a and b into c
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) > 0) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
            }
        }

        // Add remaining elements from a (if any)
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Add remaining elements from b (if any)
        while (j < b.length) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void printArray(Object[] arr) {
        for (Object value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


}