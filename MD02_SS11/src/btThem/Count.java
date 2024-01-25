package btThem;

import java.util.LinkedList;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String paragrap = "Theo phân loại của Tổ chức Y tế thế giới biến thể JN.1 là biến thể phụ nhánh BA.2.86 của chủng Omicron, thuộc nhóm biến thể cần quan tâm, không có bằng chứng độc lực tăng lên dù số mắc có dấu hiệu tăng. Chúng ta không chủ quan nhưng cũng không nên quá hoang mang, lo lắng";
        System.out.println("Nhập từ cần đém");
        String word = new Scanner(System.in).nextLine();

        int soLanXuatHien = countNumber(paragrap, word);
        System.out.println("Số lần xuất hiện của từ '" + word + "': " + soLanXuatHien);
    }
    public static int countNumber(String paragrap, String word) {
        LinkedList<String> para = new LinkedList<>();
        Scanner scanner = new Scanner(paragrap);
        String[] wordArray = paragrap.split("\\s+");
        for (String word1 : wordArray) {
            para.add(word1.toLowerCase());
        }
//        while (scanner.hasNext()) {
//            para.add(scanner.next());
//        }
//
//        scanner.close();

        int soLanXuatHien = 0;
        for (String tu : para) {
            if (tu.equalsIgnoreCase(word)) { // So sánh từ không phân biệt chữ hoa/chữ thường
                soLanXuatHien++;
            }
        }

        return soLanXuatHien;
    }
    
   
}
