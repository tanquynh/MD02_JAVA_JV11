package ra.th3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        khai báo các biến để lưu độ lớn chiều rộng và chiều cao
//        khai báo gộp
        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();
//        khai báo biến để lưu kết quả diện tích
//        nếu không cần dùng về sau thì có thể bỏ qua bước này và hiển thị ngay kết quả cũng được
        float area = width * height;
        System.out.println("Area is: " + area);


    }
}