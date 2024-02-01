package th2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = Integer.parseInt(sc.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing ...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[i] + "with" + list[i + 1]);
                    int step = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = step;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not need");
                break;
            }
            System.out.println("List after the "+i+ " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.println(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
