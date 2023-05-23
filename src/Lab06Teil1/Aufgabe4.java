package Lab06Teil1;

import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe4 {
    public static void main(String[] args) {
        // Aufgabe4: Maximum vpn n Zahlen
        // Erstellen Sie eine Funktion find_max, die das Maximum einer Menge von Integer Zahlen ermittelt.
        // Die Funktion bekommt eine Liste als Parameter übergeben und liefert das Maximum als Return wert zurück.
        // Ist die Liste leer oder existiert sie nicht, so soll -1 als Maximum zurückgegeben werden
        // Testen Sie die Funktion, indem Sie sie mit verschiedenen Testdaten aufrufen (insbesondere auch leeren Listen und null!).

        // Creates an ArrayList of Integers named "list"
        ArrayList<Integer> list = new ArrayList<>();

        // Adds integers from 1 to 5 to the "list" ArrayList
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        // Calls the findMax function with the "list" ArrayList as an argument
        findMax(list);
    }

    // Defines a static method called "findMax" that takes an ArrayList of Integers as a parameter (list)
    // This function finds the maximum value in the provided ArrayList
    static int findMax(ArrayList<Integer> list){
        // Checks if the list is empty or null, and returns -1 in those cases
        if (list.size() == 0) return -1;

        // Initializes a variable "max" with the minimum possible integer value
        int max = Integer.MIN_VALUE;

        // Iterates through each element in the "list" ArrayList using a for-each loop
        for (int element : list) {
            // Compares the current "element" with the current "max" value
            // If "element" is greater than or equal to "max", assigns "element" to "max"
            if (element >= max) max = element;
        }

        // Prints the largest element found in the "list" ArrayList
        System.out.println("Das größte Element in der Liste " + list + " ist " + max);

        // Returns the maximum value found in the list
        return max;
    }
}
