package bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(3);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(6);
        listNumber.stream().filter(number -> number %2 == 0).forEach(System.out::println);
    }
}
