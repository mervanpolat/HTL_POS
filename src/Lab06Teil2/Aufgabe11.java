package Lab06Teil2;
import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input from the console
        Scanner input = new Scanner(System.in);
        String userInput;
        int number;

        // Start an infinite loop. We will manually break out of this loop when we get valid input from the user.
        while (true) {
            // Prompt the user to enter a number between -3 and 7
            System.out.print("Zahl zwischen -3 und 7 eingeben: ");
            // Read the next input from the user as a string
            userInput = input.next();

            // Check if the user input is a valid integer using the is_valid_int helper function
            if (!is_valid_int(userInput)) {
                // If it's not a valid integer, print an error message and then continue to the next loop iteration
                System.out.println("Ungültiges Zeichen/Zahl!");
            } else {
                // If it is a valid integer, parse it to an int
                number = Integer.parseInt(userInput);

                // Check if the number is in the range [-3, 7]
                if (number < -3 || number > 7) {
                    // If it's not in the range, print an error message and then continue to the next loop iteration
                    System.out.println("Zahl " + number + " liegt nicht im erforderlichen Bereich [-3, 7]!");
                } else {
                    // If it is in the range, break out of the loop because we now have valid input
                    break;
                }
            }
        }
        // Print a message to indicate that the input was accepted, along with the number that was entered
        System.out.println("Eingabe akzeptiert: " + number);
    }

    // Helper function to check if a string represents a valid integer
    static boolean is_valid_int(String text) {
        // If the string length is greater than 9, it's not a valid integer
        if (text.length() > 9) {
            return false;
        }
        // Check each character in the string
        // Iteriere jede Buchstabe in meinem text
        for (char ch : text.toCharArray()) {
            // If the character is not a digit, '+' or '-', it's not a valid integer
           if (ch != '+' && ch != '-' && (ch < '0' || ch > '9')) {
                return false;
           }
        }
        // If we've made it this far, the string is a valid integer
        return true;
    }
}

