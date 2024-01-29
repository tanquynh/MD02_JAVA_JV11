package bt12;

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
        System.out.println(treeMap);
        Set<Integer> keySet = treeMap.keySet();
        for (Integer i : keySet) {
            treeMap1.put(treeMap.get(i),0);

        }
        treeMap1.remove(treeMap1.lastKey());
        System.out.println("So lon thu 2 " + treeMap1.lastKey());


    }
}
