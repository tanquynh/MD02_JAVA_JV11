package bt13;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4,"Manh");
        treeMap.put(1,"Tuan");
        treeMap.put(5,"Hai");
        treeMap.put(3,"hung");
        treeMap.put(2,"Linh");
        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        if (firstEntry != null) {
            int key = firstEntry.getKey();
            String value = firstEntry.getValue();
            System.out.println("Phần tử nhỏ nhất có key = " + key + ", value = " + value);
        } else {
            System.out.println("TreeMap rỗng");
        }
    }
}
