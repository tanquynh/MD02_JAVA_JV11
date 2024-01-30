package bt8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
        if(list.stream().anyMatch(number -> number % 2 == 0)){
            System.out.println("Co so chan");
        }else {
            System.out.println("Khong co so chan");
        }
    }
}
