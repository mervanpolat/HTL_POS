package Lab05Teil3;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe25_VollVergleichListen {
    public static void main(String[] args) {
        // Aufgabe 25: Vollständiger Vergleich von Listen
        // Schreiben Sie ein Programm, das zwei Listen auf Gleichheit überprüft. Das Programm soll also überprüfen, ob an
        // jeder Position in beiden Listen der gleiche Wert steht. Geben Sie das Ergebnis des Vergleichs auf der Konsole aus.
        // Die Listen können Sie im Programm anlegen – sie müssen nicht vom Benutzer eingegeben werden können.
        // Beispiel 1:
        // Liste 1: [1, 2, 3, 4, 5]
        // Liste 2: [1, 2, 3, 4, 4]
        // Ausgabe: Die Listen sind nicht gleich.
        // Beispiel 2:
        // Liste 1: [1, 2, 3, 4, 5]
        // Liste 2: [1, 2, 3]
        // Ausgabe: Die Listen sind nicht gleich.
        // Beispiel 3:
        // Liste 1: [3, 4, 4, 5]
        // Liste 2: [3, 4, 4, 5]
        // Ausgabe: Die Listen sind gleich.

        // Create two ArrayLists of Integer type
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Add values to the first ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Add values to the second ArrayList
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);

        // Check if the two ArrayLists have the same size
        if (list.size() == list2.size()) {
            // Set a boolean variable 'equal' to true
            boolean equal = true;
            // Iterate over both ArrayLists to check if they have the same values in the same positions
            for (int i = 0; i < list.size(); i++) {
                if (!(list.get(i).equals(list2.get(i)))) {
                    // If a value at a certain position is not equal, set 'equal' to false and break out of the loop
                    equal = false;
                    break;
                }
            }
            // Check the value of 'equal' to determine if the two ArrayLists are equal
            if (equal) {
                System.out.println("Die Listen sind gleich");
            } else {
                System.out.println("Die Listen sind nicht gleich!");
            }
            //Prints Die Listen sind nicht gleich!
        }
    }
}
