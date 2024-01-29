package bt11;

import java.util.Set;
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
        Set<Integer> setkey = treeMap.keySet();
        for (Integer i : setkey) {
            treeMap1.put(treeMap.get(i),0);
        }
        System.out.println(treeMap1);
    }
}
