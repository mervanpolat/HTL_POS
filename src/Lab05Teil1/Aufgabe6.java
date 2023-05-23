package Lab05Teil1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        // Aufgabe 6: Keine Duplikate
        // Eine Liste (ArrayList<>) kann – im Gegensatz zu einem Set (HashSet<>) – auch doppelte Werte (Duplikate)
        // beinhalten. In dieser Aufgabe sollen Sie alle Duplikate aus einer Liste löschen (und dabei kein Set verwenden).
        // Lösen Sie die Aufgabe, indem Sie eine zweite Liste zu Hilfe nehmen. Verwenden Sie eine Liste von (fixen) Zahlen oder Strings.

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create an ArrayList object for the original list of words
        ArrayList<String> originalList = new ArrayList<String>(5);

        // Use a loop to allow the user to enter words for the original list
        for (int i = 0; i < 5; i++) {
            System.out.println("Wort eingeben: ");
            originalList.add(input.nextLine());
        }

        // Use nested loops to compare each element of the original list with the rest
        // and remove any duplicates
        for (int i = 0; i < originalList.size() - 1; i++) {
            for (int j = originalList.size() - 1; j > 0; j--) {
                if (i == j) {
                    break;
                } else {
                    if (originalList.get(i).equals(originalList.get(j))) {
                        originalList.remove(i);
                    }
                }
            }
        }

        // Sort the final list in alphabetical order
        Collections.sort(originalList);

        // Print the final list without duplicates
        System.out.println(originalList);
    }
}
