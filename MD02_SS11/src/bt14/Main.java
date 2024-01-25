package bt14;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int element = random.nextInt(101);
                row.add(element);
            }
            matrix.add(row);
        }
       for (ArrayList<Integer> row : matrix){
           for (int element : row) {
               System.out.print(element + " ");
           }
           System.out.println();
       }
    }
}
