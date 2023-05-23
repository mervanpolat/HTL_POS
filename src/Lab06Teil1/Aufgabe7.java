package Lab06Teil1;

import java.util.ArrayList;

public class Aufgabe7 {
    public static void main(String[] args) {
        // Aufgabe7: Aggregats funktionen einer Menge von Zahlen
        // Schreiben Sie eine Funktion agg, die eine Liste von Zahlen als Parameter bekommt und das Minimum,
        // das Maximum und die Summe der Zahlen berechnet. Nachdem wir hier mehrere Werte als Ergebnis zurückliefern müssen,
        // verwenden wir eine Liste oder ein Array.
        // Beispiel: Zahlen: 3,1,2,5,3,1,6,0,9,4

        // Creates an ArrayList called "list" to store Integer values
        ArrayList<Integer> list = new ArrayList<>();

        // Adds numbers from 0 to 11 to the "list" ArrayList
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }

        // Calls the "agg" function with the "list" ArrayList as an argument
        agg(list);
        // Prints
        // Das Minimum der Liste [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] ist 0
        // Das Maximum der Liste [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] ist 11
        // Die Summe der Liste [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] ist 66
    }

    // Defines a static method called "agg" that takes an ArrayList of Integers as a parameter
    // This function calculates the minimum, maximum, and sum of the elements in the ArrayList
    static void agg(ArrayList<Integer> list) {
        // Initializes variables to store the maximum, minimum, and sum of the elements in the ArrayList
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        // Loops through the ArrayList
        for (int i = 0; i < list.size(); i++) {
            // Retrieves the current element from the ArrayList
            int maxElement = list.get(i);
            int minElement = list.get(i);

            // Updates the maximum and minimum variables if the current element is greater than max or less than min
            if (maxElement >= max) max = maxElement;
            if (minElement <= min) min = minElement;

            // Adds the current element to the sum
            sum = sum + list.get(i);
        }

        // Prints the minimum, maximum, and sum of the elements in the ArrayList
        System.out.println("Das Minimum der Liste " + list + " ist " + min);
        System.out.println("Das Maximum der Liste " + list + " ist " + max);
        System.out.println("Die Summe der Liste " + list + " ist " + sum);
    }
}
