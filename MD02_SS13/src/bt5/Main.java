package bt5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("orange", 8);
        hashMap.put("grape", 3);
        hashMap.put("pineapple", 1);
        List<Map.Entry<String,Integer>> entry = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entry, (a, b) -> a.getValue().compareTo(b.getValue()));
        System.out.println("Các phần tử sau khi sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<String, Integer> e : entry) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }
    }
}
