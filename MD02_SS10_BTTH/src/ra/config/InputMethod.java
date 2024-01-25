package ra.config;

import java.util.Scanner;

public class InputMethod {
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static String getInput() {
        return scanner().nextLine();
    }

    public static String getString() {
        while (true) {
            String result = getInput();
            if (result.trim().isEmpty()) {
                System.err.println("Dữ liệu nhập vào không được để trống");
                continue;
            }
            return result;
        }
    }

    public static int getInteger() {
        while (true) {
            try {
                return Integer.parseInt(scanner().nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Dữ liệu nhập vào phải là 1 số");
            }
        }
    }
    public static byte getByte() {
        while (true) {
            try {
                return (byte)Integer.parseInt(scanner().nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Dữ liệu nhập vào phải là 1 số");
            }
        }
    }
}
