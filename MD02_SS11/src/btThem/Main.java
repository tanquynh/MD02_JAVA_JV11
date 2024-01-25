package btThem;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String paragrap = "Theo phân loại của Tổ chức Y tế thế giới biến thể JN.1 là biến thể phụ nhánh BA.2.86 của chủng Omicron, thuộc nhóm biến thể cần quan tâm, không có bằng chứng độc lực tăng lên dù số mắc có dấu hiệu tăng. Chúng ta không chủ quan nhưng cũng không nên quá hoang mang, lo lắng";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu can ktra");
        String checkString = sc.nextLine();
        int count = countNumber(paragrap,checkString);
        System.out.println(count);
    }

    private static int countNumber(String paragrap, String checkString) {
        List<String> para = new ArrayList<>();
        String[] wordArray = paragrap.split("//s+");
        for (String word : wordArray) {
            para.add(word.toLowerCase());
        }
        int count1 = 0;
        for (String word : para) {
            if(word.equalsIgnoreCase(checkString)) {
                count1++;
            }

        }
        return count1;
    }


}
