package ra.bt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        cho phép người dùng nhập vào một chuỗi
//        tìm kiếm ra chuỗi con có độ dài lớn nhất
//        mà sắp xếp các ký tự tăng dần
//        input: abcdbzjy;
//        output: abcd
//        [tự nghĩ]
//        hướng giải quyết
//        chia input thành mảng các char[]
//        khai báo 1 chuỗi để lưu kết quả
//        dùng vòng lặp duyệt mảng từ trái qua phải
//        [...]
//        [chữa]
//        b1: duyệt qua lần lượt từng ký tự của chuỗi và tìm ra tất cả các chuỗi tăng dần
        System.out.print("Nhập vào chuỗi muốn tìm chuỗi tăng dần: ");
        StringBuilder input = new StringBuilder(new Scanner(System.in).nextLine());
        String arr = "";
        for (int i = 0; i < input.length(); i++) {
            StringBuilder subString = new StringBuilder();
            subString.append(input.charAt(i));
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j - 1) <= input.charAt(j)) {
                    subString.append(input.charAt(j));
                } else {
                    i = j;
                    break;
                }
            }
            if(subString.length() > 1){
                if (arr.isEmpty()) {
                    arr += subString;
                } else {
                    arr += "," + subString;
                }
            }
        }
//        chuyển đổi thành mảng
        String[] arraySubString = arr.split(",");
        System.out.println(Arrays.toString(arraySubString));
//        b2: tìm trong danh sách các chuỗi đó, xem chuỗi nào có độ dài lớn nhất
        int idMax = 0;
        for (int i = 0; i < arraySubString.length; i++) {
            if(arraySubString[i].length() > arraySubString[idMax].length()){
                idMax = i;
            }
        }
        System.out.println("Chuỗi con dài nhất là: " +  arraySubString[idMax]);
    }
}
