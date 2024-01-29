package bt9;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        treeMap.put(4,10);
        treeMap.put(6,12);
        treeMap.put(3,9);
        treeMap.put(1,8);
        treeMap.put(2,5);
        boolean num = treeMap.containsValue(9);
        if(num) {
            System.out.println("Ton tai");
        } else {
            System.out.println("khong ton tai");
        }

    }
}
