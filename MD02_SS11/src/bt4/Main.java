package bt4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String para = "Rekkei Academy để nông dân biết code";
        List<String> listString = new ArrayList<>();
        String[] arrayWord = para.split("\\s+") ;
        for (String s : arrayWord) {
            if(s.length() >=3) {
                listString.add(s);
            }
        }
        System.out.println("Chuoi co do dai lon hon 3 : " + listString);
    }
}
