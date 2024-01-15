package ra.th1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Khai báo các biến
        int size; // biến lưu kích thước mảng
        int[] array; // khai báo mảng rỗng
        Scanner sc = new Scanner(System.in);
//        Nhận kích thước mảng từ người dùng, kích thước mảng không được quá 20
//        chừng nào size còn chưa <= 20 thì còn chạy vòng lặp
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if ( size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while ( size > 20);
//        Khởi tạo mảng với kích cỡ thu được
        array = new int[size];
//        chạy vòng lặp để gán giá trị cho từng phần tử trong mảng
        int i = 0;
        while (i < size){
            System.out.print("Enter element #" + (i+1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
//        In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
//        Đảo ngược thứ tự các phần tử trong mảng
        for(int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
//        In ra mảng đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Reversed array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

    }
}
