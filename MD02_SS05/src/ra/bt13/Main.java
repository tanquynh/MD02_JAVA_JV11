package ra.bt13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap email can ktra :");
        String email = sc.nextLine();
        if(ischeckEmail(email)) {
            System.out.println("Chuoi hop le");
        } else {
            System.out.println("Chuoi khong hop le");
        }
    }

    private static boolean ischeckEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}