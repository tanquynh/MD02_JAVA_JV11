package bt.bt11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bt11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        System.out.print("Nhập ngày (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        try {
            Date parsedDate = dateFormat.parse(inputDate);
            System.out.println("Ngày hợp lệ: " + dateFormat.format(parsedDate));
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ, mời nhập lại theo định dạng dd/MM/yyyy.");
        }

        scanner.close();
    }

}
