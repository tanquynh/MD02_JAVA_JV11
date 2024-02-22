package bt.bt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt1 {
        public static void main(String[] args) {
            int firstNumber = 0, secondNumber = 0;

            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            do {
                try {
                    System.out.print("Enter the first number: ");
                    firstNumber = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    secondNumber = scanner.nextInt();

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: You must enter an integer. Please try again.\n");
                    scanner.nextLine();
                }
            } while (!validInput);

            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the two numbers is: " + sum);

            scanner.close();
        }
}
