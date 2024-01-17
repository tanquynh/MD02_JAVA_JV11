import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//            String st1 = "Welcome to Java";
//            String st2 = "Programming is fun";
//            String st3 = "Welcome to Java";
//            // s1 = s2 : false
//        System.out.println("st1 = st2 : " + (st1 == st2));
//        // s2 == s3 : true
//        System.out.println("st1 = st3 : " + (st1 == st3));
//        // st1.equals(st2) : false;
//        System.out.println("st1.equals(st2) :" + (st1.equals(st2)));
//        // st1.equals(st3) : true;
//        System.out.println("st1.equals(st3) : " + (st1.equals(st3)));
//        // st1.compareTo(st2) : 7
//        System.out.println("st1.compareTo(st2) : " + st1.compareTo(st2) );
//        // st2.compareTo(st2) : 0
//        System.out.println("st2.compareTo(st2) : " + st2.compareTo(st2) );
//        // st2.compareTo(st3) : -7
//        System.out.println("st2.compareTo(st3) : " + st2.compareTo(st3) );
//        // st1.charAt(0) : W
//        System.out.println("st1.charAt(0) : " + st1.charAt(0) );
//
//
//
//
//        // StringBuider vaa StringBuffer
//        String st4 = "hello";
//        StringBuilder stringBuilder = new StringBuilder(st4);
//        // Noi chuoi
//        StringBuilder stringBuilder1 =  stringBuilder.append(" word");
//        System.out.println(stringBuilder1);
//        // Noi chuoi tai vi tri index
//        stringBuilder.append("reikkei academy",7,14);
//        System.out.println(stringBuilder1);
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