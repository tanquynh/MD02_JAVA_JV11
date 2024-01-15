package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập kích thước ma trận muốn tạo:");
        int size = sc.nextInt();
        int[][] arr = createSquareMaxtrix(size);
        System.out.println("Bạn vừa tạo một ma trận 2 chiều với kích thước " + size + "x" + size + " như sau:");
        printArray(arr);
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông là là: " + calculateMainDiagonal(arr));
    }

    public static int[][] createSquareMaxtrix(int size) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Vui lòng nhập giá trị cho vị trí (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int calculateMainDiagonal(int[][] arr) {
        int sumMainDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sumMainDiagonal += arr[i][j];
                }
            }
        }
        return sumMainDiagonal;
    }
}
