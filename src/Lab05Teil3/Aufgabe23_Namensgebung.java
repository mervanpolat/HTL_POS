package Lab05Teil3;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe23_Namensgebung {
    public static void main(String[] args) {
        // Aufgabe 23: Namensgebung
        // Schreiben Sie ein Programm, das – aus einer Liste von Buchstaben (als Strings) und einer Zählvariable (als int) –
        // Strings nach dem Schema “<Buchstabe><Zahl>” erstellt.
        // Beispiel:
        // Liste: ["p", "q"]
        // Zahl: 5
        // Ausgabe: ["p1", "q1", "p2", "q2", "p3", "q3", "p4", "q4", "p5", "q5"]

        ArrayList<String> list = new ArrayList<>(); // creates an ArrayList of Strings called "list"
        list.add("p"); // adds the String "p" to the ArrayList
        list.add("q"); // adds the String "q" to the ArrayList

        int counter = 5; // initializes an integer variable called "counter" with the value 5

        for (int i = 1; i <= 5; i++) { // a loop that iterates 5 times, with the variable "i" starting at 1 and incrementing by 1 each time
            for(String letter : list) { // a loop that iterates over each String in the "list" ArrayList, assigning each one to the variable "letter"
                System.out.print(letter + i + ", "); // prints the concatenation of "letter", "i", and a space character to the console
                //Prints p1, q1, p2, q2, p3, q3, p4, q4, p5, q5,
            }
        }
    }
}
