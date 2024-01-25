package bt5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str ="Rekkei Academy để nông dân ha hi ho biết code";
        String[] words = str.split("\\s+");
        List<String> list = new ArrayList<>(Arrays.asList(words));
        List<String> stringList = new ArrayList<>();
        list.sort((a,b) -> a.length() - b.length());
        int wordLength = list.get(0).length();
        for (String s : list) {
            if(s.length() > wordLength) {
                break;
            }
            stringList.add(s);
        }
        System.out.println(list);
        System.out.println("Phan tu co length nho nhat :" + stringList);
    }
}
