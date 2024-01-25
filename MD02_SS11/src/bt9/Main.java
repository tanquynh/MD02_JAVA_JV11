package bt9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(7);
        integerList.add(5);
        integerList.add(1);
        integerList.add(5);
        System.out.println(integerList);
        // Dung hashset sap xep luon
        HashSet<Integer> hashSetListNumber = new HashSet<>();
        hashSetListNumber.addAll(integerList);
        System.out.println("HashSet :" +hashSetListNumber);
        //Dung contains trong ja
       List<Integer> listNumber = removeDuplicates(integerList);
        System.out.println(listNumber);
    }

    private static List<Integer> removeDuplicates(List<Integer> integerList) {
        List<Integer> disNumber = new ArrayList<>();
        for (Integer i : integerList) {
            if(!disNumber.contains(i)) {
                disNumber.add(i);
            }
        }
        return disNumber;
    }
}
