package bt6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bt6 {
    public static void main(String[] args) {
        String link = "D:\\MD02_JAVA\\MD02_SS18\\src\\bt6\\doc.txt";
        String fileContent = readFile(link);
        Map<String, Integer> wordFrequencyMap = calculateFrequency(fileContent);
        findMostUsed(wordFrequencyMap);

    }

    private static String readFile(String fileLink) {
        StringBuilder noiDung = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileLink))) {
            String line;
            while ((line = br.readLine()) != null) {
                noiDung.append(line).append(" ");
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file văn bản: " + e.getMessage());
        }
        return noiDung.toString();
    }

    private static Map<String, Integer> calculateFrequency(String content) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = content.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency;
    }

    private static void findMostUsed(Map<String, Integer> wordFrequency) {
        String mostUsed = null;
        int frequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > frequency) {
                mostUsed = entry.getKey();
                frequency = entry.getValue();
            }
        }

        System.out.println("Từ được sử dụng nhiều nhất: " + mostUsed);
        System.out.println("Tần suất xuất hiện: " + frequency);    }


}
