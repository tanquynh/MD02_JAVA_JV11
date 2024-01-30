package bt7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] str = {"Tuan", "linh", "Manh", "Hai", "linh", "linh", "Binh"};

        List<Integer> index = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input = sc.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(input)) {
                index.add(i);
            }
        }
        if(!index.isEmpty()) {
            System.out.println("Vi tri : ");
            index.stream().forEach(e-> System.out.print(e + " "));
        } else {
            System.out.println("Khong ton tai");
        }
    }
}
