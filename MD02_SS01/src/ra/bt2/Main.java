package ra.bt2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        [Bài tập] Ứng dụng chuyển đổi tiền tệ
//        Tỷ giá cho trước
//        Nhập tiền USD vào
//        Hiển thị giá trị tiền VNĐ tương ứng
        Scanner input = new Scanner(System.in);
//        Import NumberFormat để format số liệu, mục tiêu trong bài này là format ra dạng tiền tệ phù hợp thôi.
        Locale vnLocale = new Locale("vi", "VN");
        double rate = 23000;
        System.out.println("CHƯƠNG TRÌNH QUY ĐỔI USD SANG VNĐ");
        System.out.println("Tỷ giá hiện tại là " + rate + " VNĐ/USD");
        System.out.print("Nhập vào giá trị USD muốn quy đổi: ");
        double usd = input.nextDouble();
        System.out.println("Giá trị VNĐ đương là: " + NumberFormat.getCurrencyInstance(vnLocale).format(usd * rate));
    }
}