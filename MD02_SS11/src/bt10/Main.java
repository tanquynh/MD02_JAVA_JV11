package bt10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(7);
        integerList.add(5);
        integerList.add(1);
        integerList.add(5);
        AtomicInteger sum = new AtomicInteger();
//        for (Integer i : integerList) {
//            sum = sum + i;
//        }
        integerList.forEach((number) -> {
            sum.addAndGet(number);
        });
        System.out.println("Tong : " + sum);
    }
}
