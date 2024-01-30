package bt15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        String st = sc.nextLine();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) > st.charAt(i + 1)) {
                current.append(st.charAt(i));
            } else {
                treeMap.put(current.length(), current.toString());
                current = new StringBuilder(String.valueOf(st.charAt(i)));
            }
        }

//        // Xử lý trường hợp cuối cùng của chuỗi
//        current.append(st.charAt(st.length() - 1));
//        treeMap.put(current.length(), current.toString());

        System.out.println("Chuoi : " + treeMap.get(treeMap.lastKey()) + " Chieu dai : " + treeMap.lastKey());
    }
}
