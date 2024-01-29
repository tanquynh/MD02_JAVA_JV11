package bt7;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        TreeMap<Integer,Integer> treeMap1 = new TreeMap<>();
        treeMap.put(4,10);
        treeMap.put(6,12);
        treeMap.put(3,9);
        treeMap.put(1,8);
        treeMap.put(2,5);
        treeMap1.putAll(treeMap);
        System.out.println(treeMap);
        System.out.println(treeMap1);

    }
}
