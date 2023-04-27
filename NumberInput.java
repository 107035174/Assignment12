package Assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter a score (0-100): ");
                score = sc.nextInt();

                if (score < 0 || score > 100) {
                    throw new UnsupportedOperationException();
                }

                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value.");
                sc.nextLine(); // clear input buffer
            } catch (UnsupportedOperationException e) {
                System.out.println("Score must be in the range of 0-100.");
            }
        }

        System.out.println("Score entered: " + score);
    }
}
