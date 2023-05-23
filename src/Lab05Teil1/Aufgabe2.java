package Lab05Teil1; // A package is a group of related classes.

import java.util.ArrayList; // Importing the ArrayList class from the Java Util Library.
import java.util.Scanner; // Importing the Scanner class from the Java Util Library.

public class Aufgabe2 { // Defining a public class called "Aufgabe2".
    public static void main(String[] args) { // Defining the main method.
        /*
        Aufgabe 2: Filtern einer Liste
        Erstellen Sie wieder eine Liste von Integer Zahlen mit mindestens 5 Elementen. Verwenden Sie jetzt eine for-
        Schleife, um alle ungeraden Listenelemente in einer Zeile (!) auszugeben.

        Schreiben Sie dann Ihr Programm so um, dass Sie die ungeraden Elemente in eine zweite Liste einfügen und am
        Ende diese zweite Liste ausgeben.
        Original list: [1, 2, 3, 4, 5]
        Odd numbers: 1 3 5
        */
        Scanner input = new Scanner(System.in); // Creating a new Scanner object called "input" for user input.

        ArrayList<Integer>liste = new ArrayList<Integer>(5); // Creating a new ArrayList object called "liste" to store integers.

        ArrayList<Integer>ungerade = new ArrayList<Integer>(); // Creating a new ArrayList object called "ungerade" to store odd integers.

        ArrayList<Integer>gerade = new ArrayList<Integer>(); // Creating a new ArrayList object called "gerade" to store even integers.

        for (int i = 0; i < 5; i++) { // A for loop that iterates from 0 to 4 (5 times).
            System.out.println("Zahl eingeben: "); // Prints the message "Zahl eingeben: " to the console.
            liste.add(input.nextInt()); // Adds the integer entered by the user to the ArrayList "liste".
        }

        for (int i = 0; i < liste.size(); i++) { // A for loop that iterates over the elements in the ArrayList "liste".
            int num = liste.get(i); // Gets the integer at index "i" of the ArrayList "liste".

            if (num % 2 == 0) { // If the integer is even.
                gerade.add(num); // Adds the integer to the ArrayList "gerade".
            } else { // If the integer is odd.
                ungerade.add(num); // Adds the integer to the ArrayList "ungerade".
            }
        }

        System.out.println("Liste: " + liste); // Prints the ArrayList "liste" to the console.

        System.out.println("Liste der ungeraden Zahlen: " + ungerade); // Prints the ArrayList "ungerade" to the console.

        System.out.println("Liste der geraden Zahlen: " + gerade); // Prints the ArrayList "gerade" to the console.
    }
}
