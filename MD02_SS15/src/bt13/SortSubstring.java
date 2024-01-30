package bt13;

import java.util.Arrays;
import java.util.Scanner;

public class SortSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = sc.nextLine();
        String sortedSubstring = findSortedSubstring(input);
        System.out.println("Chuỗi kí tự con được sắp xếp: " + sortedSubstring);
    }

    private static String findSortedSubstring(String input) {

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

