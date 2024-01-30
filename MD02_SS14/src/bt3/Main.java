package bt3;

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
        System.out.println(listNumber.stream().reduce(0, Integer::sum));
    }
}
