package bt3;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tu muon nhap");
        int numberOfWords = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập so lợng từ : " + numberOfWords);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Nhâp từ thứ " + (i + 1) + ": ");
            String word = sc.nextLine();
            stack.push(word);
        }
        System.out.print("Chuoi dảo ngược : ");
        while (!stack.isEmpty()) {
            System.out.print( stack.pop()  );
        }
    }
}
