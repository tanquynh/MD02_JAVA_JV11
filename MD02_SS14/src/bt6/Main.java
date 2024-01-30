package bt6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tuan");
        list.add("Manh");
        list.add("Hai");
        list.add("hung");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
