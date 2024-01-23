package ra.bt3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int[] arr = new int [100000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random()*1000000);

        }
        System.out.println(" arr  trước"+ Arrays.toString(arr));
        stopwatch.getStartTime();
        sort(arr);
        stopwatch.stop();
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" arr sau sort"+ Arrays.toString(arr));




        System.out.println("Thời gian thực thi (miliseconds): " + stopwatch.getElapsedTime());
    }


    public  static  void  sort ( int [] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}