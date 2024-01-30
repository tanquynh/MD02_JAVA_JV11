package bt1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Bước 1: Tạo một mảng số nguyên. (100 phần tử ngẫu nhiên từ 1-1000)
//        Bước 2: Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.
       // Cách 1
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*1000 +1);
        }
        // in mang ktra
        System.out.println("Mang so nguyen");
        Arrays.stream(arr).forEach(System.out::println );
        // Sử dụng stream API để tìm số lớn nhất
        int max = Arrays.stream(arr).max().orElse(0);
        System.out.println("-----------------------");
        System.out.println(max);

        //Cách 2
        Random random = new Random();
        Supplier<Integer> supplier = () ->random.nextInt(1000);
        List<Integer> listInteger = Stream.generate(supplier).distinct().limit(100).collect(Collectors.toList());
        System.out.println(listInteger);
        // tìm số lớn nhất
        int max1 = listInteger.stream().max(Integer::compareTo).orElse(0);
        System.out.println("------------------------");
        System.out.println(max1);
    }
}
