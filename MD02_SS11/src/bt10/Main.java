package bt10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(7);
        integerList.add(5);
        integerList.add(1);
        integerList.add(5);
        int sum =0;
        for (Integer i : integerList) {
            sum = sum + i;
        }
        System.out.println("Tong : " + sum);
    }
}
