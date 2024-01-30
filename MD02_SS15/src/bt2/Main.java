package bt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1,3,3,5,6,8,9,18,12,3,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int input = Integer.parseInt(sc.nextLine());
       List<Integer> listIndex = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            if(list1[i] == input) {
                listIndex.add(i);
            }
        }
        if(listIndex != null) {
            System.out.println("Danh sach vi tri tim duoc");
            listIndex.forEach(e -> System.out.print(e+" ") );
        } else {
            System.out.println("Khong co vi tri ");
        }

    }
}
