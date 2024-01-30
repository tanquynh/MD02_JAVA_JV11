package bt1;

import java.util.Arrays;

public class Main {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] list = getArr();
        Arrays.stream(list).forEach(e -> System.out.print(e + " "));
        System.out.println();
        int min = linearSearch(list);
        System.out.println(" Min : " + min);


    }

    private static int linearSearch(int[] list) {
        int min = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }


}
