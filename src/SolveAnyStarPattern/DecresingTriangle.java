package SolveAnyStarPattern;// Import necessary Java libraries
import java.util.Random;
import java.util.Scanner;

// Define a class called DecresingTriangle
public class DecresingTriangle {
    public static void main(String[] args) {

        // Create a new Random object called rand
        Random rand = new Random();

        // Create a new Scanner object called input to read user input
        Scanner input = new Scanner(System.in);

        // Declare a char variable called ch to store user input
        char ch;

        // Generate a random integer between 0 and 15 (inclusive) and store it in the variable max
        int max = rand.nextInt(15+1);

        // Generate a random integer between 0 and 5 (inclusive) and store it in the variable min
        int min = rand.nextInt(5);

        // Use a do-while loop to repeatedly print decreasing triangle patterns
        do {
            // Generate a random integer between min and max (inclusive) and store it in the variable i
            for (int i = rand.nextInt(min+max); i >= 0; i--) {
                // Use a nested loop to print i asterisks on each line
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                // Move to the next line after printing the asterisks on each line
                System.out.println();
            }

            // Ask the user if they want to print another pattern
            System.out.println("Neues Muster? [y/n]");
            ch = input.nextLine().charAt(0);

            // Repeat the loop if the user inputs 'y'
        } while (ch=='y');

        // Print a message indicating that the program has ended
        System.out.println("Programm beendet!");
        //y
        //* * * *
        //* * *
        //* *
        //*
        //Neues Muster? [y/n]
    }
}
