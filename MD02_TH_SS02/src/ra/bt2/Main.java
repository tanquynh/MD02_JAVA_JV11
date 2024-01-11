package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Hiển thị các loại hình
        Scanner sc = new Scanner(System.in);
        int menuSelection;
        System.out.println("Nhập số để lựa chọn loại hình muốn in từ menu dưới dây: ");
        System.out.println("1. Hình chữ nhật\n2. Tam giác vuông, góc vuông ở phía dưới, bên trái\n3. Tam giác vuông, góc vuông ở phía trên, bên trái\n4. Tam giác cân\n5. Thoát");
        menuSelection = sc.nextInt();
        if (menuSelection == 1) {
            System.out.println("Bạn đã lựa chọn vẽ hình chữ nhật");
            System.out.print("Vui lòng vào chiều rộng: ");
            int width = sc.nextInt();
            System.out.print("Vui lòng vào chiều cao: ");
            int height = sc.nextInt();
            drawRectangle(width, height);
        } else if (menuSelection == 2) {
            System.out.println("Bạn đã lựa chọn vẽ hình tam giác vuông với góc vuông ở phía dưới, bên trái");
            System.out.print("Vui lòng vào chiều dài cạnh góc vuông: ");
            int width = sc.nextInt();
            drawBottomLeftRightTriangle(width);
        } else if (menuSelection == 3) {
            System.out.println("Bạn đã lựa chọn vẽ hình tam giác vuông với góc vuông ở phía trên, bên trái");
            System.out.print("Vui lòng vào chiều dài cạnh góc vuông: ");
            int width = sc.nextInt();
            drawTopLeftRightTriangle(width);
        } else if (menuSelection == 4) {
            System.out.println("Bạn đã lựa chọn vẽ hình tam giác cân");
            System.out.print("Vui lòng vào chiều cao của tam giác: ");
            int height = sc.nextInt();
            drawIsoslecesTriangle(height);
        } else if (menuSelection == 5) {
            System.exit(0);
        }
    }

    public static void drawRectangle(int width, int height) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawBottomLeftRightTriangle(int width) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawTopLeftRightTriangle(int width) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= width; i++) {
            for (int j = width - i + 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawIsoslecesTriangle(int height) {
//        vẽ hình tam giác có chiều cao là height
//        chiều dài cạnh đáy là 2*height -1
//        => trong ma trận vuông height x height, vẽ * tại các vị trí như sau:
//        dòng 1: index = (1, height)
//        dòng 2: index = (2, height-1) ; (2, height); (2, height+1)
//        dòng 3: index = (3, height-2); (3, height-1); (3, height); (3, height+1); (3, height+2)
//        dòng i: index = (i, height-i+1);...(i, height);...; (i, height+i-1)
//        i lớn nhất là height
        for (int i = 1; i <= height; i++) {
            for ( int j = 1; j <= height; j++){
                if (j >= height - i + 1 &&j <= height + i - 1){
                    System.out.print("* ");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
