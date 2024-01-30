package bt5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Mang truoc khi loc");
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
        System.out.println();
        System.out.println("Mang sau khi loc");
        Arrays.stream(arr).filter(result ->(result> number)).forEach(System.out::println);
    }

}
