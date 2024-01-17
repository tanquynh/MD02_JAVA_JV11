package ra.bt10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello World!";
        String toggledString = toggleCase(inputString);
        System.out.println("Chuyen doi chu hoa thanh chu thuong va nguoc lai: " + toggledString);
    }
    public static String toggleCase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }

        return new String(charArray);
    }


}
