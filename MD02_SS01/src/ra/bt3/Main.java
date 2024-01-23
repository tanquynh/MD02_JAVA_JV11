package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập vào 1 số: ");
        int number = new Scanner(System.in).nextInt();
//    Nếu số nhập vào < 0 hoặc > 999 thì hiện thông báo
        if (number < 0 || number > 999) {
            System.out.println("Chương trình chỉ có thể đọc số trong khoảng từ 0 đến 999.");
        } else if (number <= 9) {
            System.out.println(readOneDigitNumber(number));
        } else if (number <= 99) {
            System.out.println(readTwoDigitsNumber(number));
        } else {
            System.out.println(readThreeDigitsNumber(number));
        }
    }

    //    Static method để đọc số từ 0 đến 9
    public static String readOneDigitNumber(int number) {
        switch (number) {
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return null;
        }
    }
    //    Static method để đọc số từ 10 đến 99
    public static String readTwoDigitsNumber(int number) {
//    Nếu số nhập vào là 10 thì đọc là 10
        if (number == 10) {
            return "mười";
//    Nếu số nhập vào từ 11 đến 19 thì đọc là "Mười" + " số"
        } else if (number <= 19) {
//    Nếu số nhập vào chia hết cho 5 thì đọc là "Mười" + " lăm"
            if (number % 5 == 0) {
                return "mười lăm";
            } else {
                return "mười " + readOneDigitNumber(number % 10);
            }
        } else {
//    Nếu số nhập vào chia hết cho 10 thì đọc là "Số" + " mươi"
            if (number % 10 == 0) {
                return readOneDigitNumber(number / 10) + " mươi";
            } else {
//    Nếu số nhập vào chia cho 10 dư 1 thì đọc là " mươi" + " mốt"
                if (number % 10 == 1) {
                    return readOneDigitNumber(number / 10) + " mươi mốt";
//    Nếu số nhập vào chia hết cho 5 thì đọc là " mươi" + " lăm"
                } else if (number % 10 == 5) {
                    return readOneDigitNumber(number / 10) + " mươi lăm";
                } else {
                    return readOneDigitNumber(number / 10) + " mươi " + readOneDigitNumber(number % 10);
                }
            }
        }
    }

    public static String readThreeDigitsNumber(int number) {
//        Từ 100 đến 999
//        Số chia hết cho 100 đọc là "Số" + " trăm"
//        Số chia cho 100 dư nằm trong khoảng từ 1 đến 9 đọc là "Số" + " trăm linh" + " số"
//        Số khác đọc là "Số" + " trăm" + " số trong khoảng từ 10 đến 99"
        if (number % 100 == 0) {
            return readOneDigitNumber(number / 100) + " trăm";
        } else if (number % 100 > 0 && number % 100 <= 9) {
            return readOneDigitNumber(number / 100) + " trăm linh " + readOneDigitNumber(number % 100);
        } else {
            return readOneDigitNumber(number / 100) + " trăm " + readTwoDigitsNumber(number - (number / 100) * 100);
        }
    }

}
