package bt7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri truoc");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia tri sau");
        int y = Integer.parseInt(sc.nextLine());
        List<Integer> list = IntStream.range(x, y).boxed().collect(Collectors.toList());
        list.forEach(e -> System.out.print(e + " "));
    }
}
