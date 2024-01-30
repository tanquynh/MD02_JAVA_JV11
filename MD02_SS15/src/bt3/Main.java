package bt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = getArr();
        System.out.println("Mang 2 chieu");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri can tim");
        int input = Integer.parseInt(sc.nextLine());
        boolean check = search(matrix, row, col, input);
        if(check) {
            for (int i = 0; i < row.size(); i++) {
                System.out.println("row :" + row.get(i) + "Col " + col.get(i));
            }
        } else {
            System.out.println("Khong ton tai");
        }
    }

    private static boolean search(int[][] matrix, List<Integer> row, List<Integer> col, int input) {
        boolean check = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == input) {
                    row.add(i);
                    col.add(j);
                    check = true;
                }
            }
        }

        return check;
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

}
