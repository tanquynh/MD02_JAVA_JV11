package bt14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap min");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap max");
        int max = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min && arr[i]<max) {
                list.add(arr[i]);
            }
        }
        if(!list.isEmpty()) {
            System.out.println("Danh sach so");
            System.out.println(list);
        } else {
            System.out.println("Khong co");
        }
    }
    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }

}
