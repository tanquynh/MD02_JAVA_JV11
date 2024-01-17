package ra.bt;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
//        tạo lớp validation kiểm tra sự chính xác của các dữ liệu sau:
//        email: gmail.com
//        số điện thoại: việt nam
//        mật khẩu: bảo mật cao
//        kiểm tra ngày/tháng/năm theo định dạng: dd/MM/YYYY
//        validate chuỗi nhập vào có phải là số không
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào các thông tin theo yêu cầu để kiểm tra định dạng:");
        System.out.print("Vui lòng nhập vào một địa chỉ gmail: ");
        String email = sc.nextLine();
        System.out.print("Vui lòng nhập vào một số điện thoại Việt Nam: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Vui lòng nhập vào mật khẩu dài ít nhất 10 ký tự, trong đó có chứa ít nhất 1 ký tự in hoa, 1 ký tự in thường, 1 ký tự đặc biệt và 1 ký tự số: ");
        String password = sc.nextLine();
        System.out.print("Vui lòng nhập vào thông tin ngày/tháng/năm theo đúng định dạng dd/MM/YYYY: ");
        String date = sc.nextLine();
        System.out.print("Vui lòng nhập vào một số: ");
        String number = sc.nextLine();
        if (Validation.validateEmail(email)) {
            System.out.println("Địa chỉ email bạn nhập vào đúng yêu cầu.");
        } else {
            System.out.println("Địa chỉ email bạn nhập vào không đúng yêu cầu.");
        }
        if (Validation.validatePhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại bạn nhập vào đúng yêu cầu.");
        } else {
            System.out.println("Số điện thoại bạn nhập vào không đúng yêu cầu.");
        }
        if (Validation.validatePassword(password)) {
            System.out.println("Mật khẩu bạn nhập vào đúng yêu cầu.");
        } else {
            System.out.println("Mật khẩu bạn nhập vào không đúng yêu cầu.");
        }
        if (Validation.validateDateFormat(date)) {
            System.out.println("Thông tin ngày tháng bạn nhập vào đúng yêu cầu.");
        } else {
            System.out.println("Thông tin ngày tháng bạn nhập vào không đúng yêu cầu.");
        }
        if (Validation.isNumberInput(number)) {
            System.out.println("Bạn đã nhập đúng số theo yêu cầu");
        } else {
            System.out.println("Những gì bạn vừa nhập vào không phải là số.");
        }

    }
}
