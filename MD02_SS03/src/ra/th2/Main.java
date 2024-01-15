package ra.th2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].toLowerCase().equals(inputName.toLowerCase())){
                System.out.println("Position of " + inputName + " in the students list is: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Not found " +  inputName + " in the list.");
        }
    }
}
