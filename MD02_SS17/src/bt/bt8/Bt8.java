package bt.bt8;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int num= sc.nextInt();
        if (num<2){
            try {
                throw new Exception("Số đã nhập không phải số nguyên tố!");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } else {
            boolean check=true;
            for (int i=2;i<Math.sqrt(num);i++){
                if (num%i==0){
                    check=false;
                    break;
                }
            }
            if (!check){
                System.out.println("Số đã nhập không phải số nguyên tố!");
            } else {
                System.out.println("Số đã nhập là số nguyên tố!");
            }
        }
    }
}
