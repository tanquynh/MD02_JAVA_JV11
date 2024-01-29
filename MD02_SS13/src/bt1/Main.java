package bt1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi");
        String input = new Scanner(System.in).nextLine();
        String[] inputData = input.split("\\s+");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String str : inputData) {
            if(hashMap.containsKey(str)) {
                hashMap.put(str,hashMap.get(str) +1);
            }
            else {
                hashMap.put(str,1);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
        Set<String> setArr = hashMap.keySet();
        for (String s : setArr) {
            System.out.println(s + " - " + hashMap.get(s));
        }
        Iterator<String> itr = hashMap.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(hashMap.get(itr.next()));
        }
    }

}
