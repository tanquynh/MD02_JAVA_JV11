package bt2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,5,2,4,5,6,7,8,4,2,3,4,5,12,13};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer i : arr) {
            if(hashMap.containsKey(i)) {
                hashMap.put(i,hashMap.get(i) +1);
            } else {
                hashMap.put(i,1);
            }
        }
        HashMap<Integer,Integer> hashMap1 = new HashMap<>();
        Set<Integer> set = hashMap.keySet();
        for (Integer i : set) {
            if(hashMap.get(i) == 1) {

            }
        }

        List<Integer> keysRemove = new ArrayList<>();
        for (Integer i : set) {
            if(hashMap.get(i) != 1) {
                keysRemove.add(i);
            }
        }
        for (Integer i : keysRemove) {
            hashMap.remove(i);
        }
        System.out.println(hashMap);
        System.out.println(hashMap1);
    }
}
