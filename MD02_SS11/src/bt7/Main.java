package bt7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(2);
        integerList.add(5);
        integerList.add(9);
        integerList.add(6);
        integerList.add(7);
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % 2 != 0) {
                lists.add(integerList.get(i));
            }
        }
        System.out.println("Mang so le " + lists);
    }
}
