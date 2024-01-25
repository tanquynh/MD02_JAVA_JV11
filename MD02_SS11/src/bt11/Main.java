package bt11;

import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println(Collections.min(integerList));
    }
}
