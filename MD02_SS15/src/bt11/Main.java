package bt11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.5, 3.3, 5.6, 7.5, 3.5, 6.7, 3.2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        double input = Double.parseDouble(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == input) {
                System.out.println("Vi tri : " + i);
                return;
            }
        }
        System.out.println("Khong tim thay");
    }
}
