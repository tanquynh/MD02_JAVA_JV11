package th3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("at 10 p.a");
        stringList.add("banana");
        stringList.add("app");
        stringList.add("Vodka");
        stringList.stream().filter(string -> (string.length() ==3 && string.startsWith("a"))).forEach(System.out::println);

    }
}
