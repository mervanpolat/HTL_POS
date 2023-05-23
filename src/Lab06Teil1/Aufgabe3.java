package Lab06Teil1;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Aufgabe3: Countdown
        // Schreiben Sie eine Funktion countdown, die als Parameter eine Zahl nimmt und den Countdown bis 1 herunterzählt
        // und am Ende "LOS" ausgibt.

        // Calls the countdown function with an initial value of 5 as an argument
        countdown(5);
    }

    // Defines a static method called "countdown" that takes an integer as a parameter (number)
    static void countdown(int number) {
        // The do-while loop continues until a valid input number is provided (greater than or equal to 3)
        do {
            // Creates a new Scanner object named "input" to read user input
            Scanner input = new Scanner(System.in);

            // Prompts the user to enter a number greater than or equal to 3
            System.out.print("Bitte geben Sie eine Zahl ein die >= 3 ist: ");

            // Reads the user's input and assigns it to the "number" variable
            number = input.nextInt();

            // Creates a variable named "counter" and assigns the value of "number" to it
            int counter = number;

            // Checks if the entered number is greater than or equal to 3
            if (number >= 3) {
                // If the condition is met, executes a for loop
                for (int i = 1; i <= counter; i++) {
                    // Prints the current value of "number"
                    System.out.println(number);

                    // Decreases the value of "number" by 1
                    number--;
                }
                // After the for loop, prints "LOS!"
                System.out.println("LOS!");
            } else {
                // If the entered number is less than 3, the user is asked to enter a valid number
                System.out.println("Bitte eine Zahl eingeben die >= 3 ist!");
            }
            // The loop continues until the entered number is greater than or equal to 3
        } while (!(number >= 3));
    }
}
