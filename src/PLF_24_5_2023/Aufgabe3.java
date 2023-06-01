package PLF_24_5_2023;  // Define the package that this Java class belongs to.

import java.util.ArrayList;  // Import the ArrayList class from the java.util package.
import java.util.Random;  // Import the Random class from the java.util package.

public class Aufgabe3 {  // Define a public class named Aufgabe3.
    public static void main(String[] args) {  // Define the main method that the JVM calls to start the program.
        generateData(8,20);  // Call the generateData method with 8 and 20 as arguments.
    }

    static void generateData(int n, int max){  // Define a method to generate random data.
        Random rand = new Random();  // Create a new Random object.
        ArrayList<Integer> list = new ArrayList<>();  // Create a new ArrayList to hold Integer objects.
        for (int i = 0; i < n; i++) {  // Loop n times.
            list.add(rand.nextInt(0,max));  // Generate a random integer between 0 (inclusive) and max (exclusive), and add it to the list.
        }
        System.out.println("Die generierte Liste: " + list);  // Print the generated list.
        testNumbers(list);  // Call the testNumbers method with the list as an argument.
    }

    static boolean isOdd(int n) {  // Define a method to test whether an integer is odd.
        return n%2 != 0;  // Return true if n is odd, false otherwise.
    }

    static void testNumbers(ArrayList<Integer> list) {  // Define a method to count the number of odd numbers on the left and right halves of the list.
        int unevenCountLeft = 0;  // Initialize a counter for the number of odd numbers on the left half.
        int unevenCountRight = 0;  // Initialize a counter for the number of odd numbers on the right half.
        for (int i = 0; i < list.size()/2; i++) {  // Loop over the left half of the list.
            if (isOdd(list.get(i))) {  // If the current number is odd.
                unevenCountLeft++;  // Increment the left counter.
            }
        }

        for (int i = list.size()/2; i < list.size(); i++) {  // Loop over the right half of the list.
            if (isOdd(list.get(i))) {  // If the current number is odd.
                unevenCountRight++;  // Increment the right counter.
            }
        }
        System.out.println("Anzahl der ungeraden Zahlen links:  " + unevenCountLeft);  // Print the number of odd numbers on the left half.
        System.out.println("Anzahl der ungeraden Zahlen rechts: " + unevenCountRight);  // Print the number of odd numbers on the right half.

        if (unevenCountLeft == unevenCountRight) {  // If the number of odd numbers on the left and right halves are equal.
            System.out.println("true");  // Print "true".
        } else {  // Otherwise.
            System.out.println("false");  // Print "false".
        }
    }
}
