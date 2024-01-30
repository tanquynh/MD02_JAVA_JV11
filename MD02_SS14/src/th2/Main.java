package th2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(8);
        System.out.println("Danh sach cac so chan");
        listNumbers.stream().filter(number ->number%2 == 0).forEach(System.out::println);
    }
}
