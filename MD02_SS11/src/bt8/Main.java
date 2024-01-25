package bt8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        List<Integer> lists = new ArrayList<>();
        lists.addAll(integerList);
        System.out.println(integerList);
        System.out.println(lists);
    }
}
