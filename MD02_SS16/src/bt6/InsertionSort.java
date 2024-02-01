package bt6;

public class InsertionSort {
        public static void insertionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < arr.length; i++) {
                int valuePosition = arr[i];
                int holePosition = i ;

                while (holePosition > 0 && arr[holePosition -1] > valuePosition) {
                    arr[holePosition ] = arr[holePosition-1];
                    holePosition = holePosition-1;
                }
                arr[holePosition] = valuePosition;

                System.out.print("Step " + i + ": ");
                printArray(arr);
            }
        }

        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {9, 5, 1, 4, 3};
            System.out.print("Original array: ");
            printArray(arr);
            insertionSort(arr);
            System.out.print("Sorted array: ");
            printArray(arr);
        }
}
