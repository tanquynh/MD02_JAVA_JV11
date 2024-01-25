package bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        lists.add(5);
        lists.add(4);
        lists.add(7);
        lists.add(6);
        lists.add(3);
        System.out.println(lists);
        for (int i = lists.size()-1; i >0 ; i--) {
            newList.add(lists.get(i));
        }
        System.out.println("reverse : "  + newList);

    }
}
