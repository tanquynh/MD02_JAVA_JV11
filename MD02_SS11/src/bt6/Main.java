package bt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử của danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        bubbleSort(numbers);

        System.out.println("Danh sách đã sắp xếp theo thứ tự tăng dần:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void bubbleSort(List<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Hoán đổi hai phần tử
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
}
