package bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,4,5,6,8,5,4,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int input = Integer.parseInt(sc.nextLine());
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == input) {
                index.add(i);
            }
        }
        if(!index.isEmpty()) {
            System.out.println("Vi tri : ");
            index.forEach(e -> System.out.print(e + " "));
        } else  {
            System.out.println("Khong ton tai");
        }
    }
}
