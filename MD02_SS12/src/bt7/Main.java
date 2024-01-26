package bt7;


import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "Mỗi từ lấy ra từ chuỗi, chuyển toàn bộ thành chữ hoa hoặc chữ thường. Coi mỗi từ được lấy ra từ chuỗi là 1 key.\n" +
                "Kiểm tra xem trong map có key này hay chưa. Nếu có đẩy key này vào map và tăng value (số lượng từ) lên 1 Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.\n";
        String[] words = str.split("\\s+");
        TreeMap<String,Integer> treeMapWord = new TreeMap<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if(treeMapWord.containsKey(lowerWord)) {
                int count = treeMapWord.get(lowerWord);
                treeMapWord.put(lowerWord, count +1);
            } else {
                treeMapWord.put(lowerWord,1);
            }
        }
        for(Map.Entry<String, Integer> entry : treeMapWord.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + " " + count + " lan");
        }


    }
}
