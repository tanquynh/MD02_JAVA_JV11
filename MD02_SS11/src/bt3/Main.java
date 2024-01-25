package bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(8);
        integers.add(1);
        integers.add(3);
        // Sap xep tang dan
        Collections.sort(integers);
        System.out.println(integers);
        // Dao nguoc chuoi
        integers.sort((a, b) -> b - a);
        System.out.println(integers);
     }
}
