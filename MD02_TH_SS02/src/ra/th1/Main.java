package ra.th1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// THỰC HÀNH
//        Giải phương trình bậc nhất
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
//        Nhận thông tin đầu vào từ người dùng
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
//        Giải phương trình
//        Nếu a khác 0 thì phương trình có nghiệm duy nhất: x = (c - b)/a
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Equation pass with x = " + x);
        }
        else if (b == c) {
//        Nếu a = 0 thì xét b = c là đúng hay sai
//        Nếu đúng thì phương trình có vô số nghiệm
            System.out.println("The solution is all x!");
        } else{
//        Nếu sai thì phương trình vô nghiệm
            System.out.println("No solution!");
        }
    }
}
