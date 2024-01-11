package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Tạo menu chức năng
        Scanner sc = new Scanner(System.in);
        int menuSelection, number;
        System.out.println("Nhập số để lựa chọn thao tác muốn thực hiện từ menu dưới dây: ");
        System.out.println("1. Kiểm tra tính chẵn lẻ của một số\n2. Kiểm tra số nguyên tố\n3. Kiểm tra xem một số có chia hết cho 3 hay không\n4. Thoát");
        menuSelection = sc.nextInt();
        switch (menuSelection) {
            case 1:
                System.out.print("Nhập số muốn kiểm tra tính chẵn lẻ: ");
                number = sc.nextInt();
                if (checkOddEven(number)){
                    System.out.println(number + " là số chẵn");
                } else {
                    System.out.println(number + " là số lẻ");
                }
                break;
            case 2:
                System.out.print("Nhập số muốn kiểm tra tính nguyên tố: ");
                number = sc.nextInt();
                if (checkPrimeNumber(number)){
                    System.out.println(number + " là số nguyên tố");
                } else {
                    System.out.println(number + " không phải là số nguyên tố");
                }
                break;
            case 3:
                System.out.print("Nhập số muốn kiểm tra xem có chia hết cho 3 hay không: ");
                number = sc.nextInt();
                if (number % 3 == 0){
                    System.out.println(number + " là số chia hết cho 3");
                } else {
                    System.out.println(number + " không chia hết cho 3");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng chạy lại chương trình và lựa chọn trong khoảng từ 1 đến 4.");
                break;
        }
    }
    public static boolean checkOddEven(int number){
        return number %2 == 0;
    };
    public static boolean checkPrimeNumber(int number){
        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else {
            boolean flag = true;
            for(int i = 2; i <= Math.floor(Math.sqrt(number)); i++){
//                chỉ cần có một số là chia hết thì đảo cờ sang false và phá vòng lặp
                if((number % i) == 0){
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }
}
