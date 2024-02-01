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
        current.append(st.charAt(0));
        for (int i = 0; i < st.length()-1 ; i++) {
            if (st.charAt(i+1)>st.charAt(i)) {
                current.append(st.charAt(i+1));
                if(i + 1 ==st.length()-1) {
                    treeMap.put(current.length(), current.toString());
                }
            } else {
                treeMap.put(current.length(), current.toString());
                current = new StringBuilder(String.valueOf(st.charAt(i+1)));
            }
        }
        System.out.println("Chuoi : " + treeMap.get(treeMap.lastKey()) + " Chieu dai : " + treeMap.lastKey());
    }
}
