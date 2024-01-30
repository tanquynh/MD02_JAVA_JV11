package th2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String input = sc.nextLine();
        int[] frequentChar = new  int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int)input.charAt(i);
            frequentChar[ascii] +=1;
        }
        int max = 0;
        char charater = (char) 255;
        for (int i = 0; i < 255; i++) {
            if(frequentChar[i] > max) {
                max = frequentChar[i];
                charater = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + charater + "' with a frequency of " + max + " times");
    }
}
