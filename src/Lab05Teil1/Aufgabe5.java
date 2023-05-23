// Import the necessary classes for reading input and using ArrayLists.
package Lab05Teil1;
import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        //Aufgabe 5: Gerade und ungerade Summen
        //Schreiben Sie ein Programm, bei dem Sie beliebig viele ganze Zahlen als Strings eingeben können. Wenn Sie nichts
        //mehr eingeben (Eingabe ist ein leerer String), gibt das Programm die Summe aller geraden Zahlen und die Summe
        //aller ungeraden Zahlen aus. Sie brauchen hier keine zusätzliche Fehlerbehandlung vorzunehmen, z.B. wenn jemand
        //'hallo' eingibt.
        //Gib eine ganze Zahl ein (oder Leerstring zum Beenden): 1
        //Nächste Zahl: 2
        //Nächste Zahl: 3
        //Nächste Zahl: 4
        //Nächste Zahl: 5
        //Nächste Zahl: 6
        //Nächste Zahl: 7
        //Nächste Zahl: 8
        //Nächste Zahl: 9
        //Nächste Zahl: 0
        //Nächste Zahl:
        //Even sum: 20
        //Odd sum: 25

        // Create a Scanner object for reading user input.
        Scanner input = new Scanner(System.in);

        // Create an ArrayList object with initial capacity of 5.
        ArrayList<String> list = new ArrayList<String>(5);

        // Prompt the user to enter a number and read it as a string until 5 inputs are collected or an empty string is entered.
        System.out.println("Enter a number (or empty string to stop the program)");
        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: ");
            list.add(input.nextLine()); // Add each input to the ArrayList.
            if ((list.get(i).equals("")) || list.get(i).equals(" ")) { // Check if the input is an empty string.
                break; // If so, exit the loop.
            }
        }

        // Initialize variables to hold the sums of even and odd numbers.
        int sumEven = 0;
        int sumOdd = 0;

        // Iterate through the ArrayList and calculate the sum of even and odd numbers.
        for (int i = 0; i < 5; i++) {
            if ((list.get(i).equals("")) || list.get(i).equals(" ")) { // Check if the input is an empty string.
                break; // If so, exit the loop.
            }
            int element = Integer.parseInt(list.get(i)); // Convert the input string to an integer.
            if (element % 2 == 0) { // Check if the number is even.
                sumEven += element; // Add the even number to the sum of even numbers.
            } else {
                sumOdd += element; // Add the odd number to the sum of odd numbers.
            }
        }

        // Print the ArrayList and the sums of even and odd numbers.
        System.out.println(list);
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}
