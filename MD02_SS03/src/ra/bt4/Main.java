package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BÀI TẬP
//        Tìm phần tử lớn nhất trong mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước ma trận muốn tạo:");
        System.out.print("Vui lòng nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("Vui lòng nhập số cột: ");
        int col = sc.nextInt();
        int[][] arr = createTwoDimensionArray(row, col);
        System.out.println("Bạn vừa tạo một ma trận 2 chiều với kích thước "+row+"x"+col+" như sau:");
        printArray(arr);
        maxValueOf(arr);
    }

    public static void maxValueOf(int[][] arr) {
        int max = arr[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        System.out.println("Tọa độ của phần tử này là: (" + row + "," + col + ")");
    }

    public static int[][] createTwoDimensionArray(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("Vui lòng nhập giá trị cho vị trí ("+i+","+j+"): ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    public static void printArray(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
