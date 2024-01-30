package bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hom nay");
        stringList.add("An chao");
        stringList.add("Hoa dep");
        stringList.add("Tuan");
        stringList.add("Manh");
        stringList.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------");
        stringList.stream().sorted((a,b) -> (b.compareTo(a))).forEach(System.out::println);
    }
}
