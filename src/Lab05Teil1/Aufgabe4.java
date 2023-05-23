package Lab05Teil1;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        //Aufgabe 4: Eingabe einer Liste
        //Verwenden Sie eine Schleife, um den Benutzern die elementweise Eingabe einer Liste zu ermöglichen. Dabei sollen
        //nur Ganzzahlen eingegeben werden können. Sobald der Benutzer eine negative Zahl eingibt, endet die
        //Listeneingabe. Speichern Sie alle eingegebenen Werte in einer Liste und geben Sie diese am Ende aus – natürlich
        //ohne die negative Zahl, die die Eingabe beendet hat.

        // Create a new ArrayList of integers with initial capacity of 5
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        // Create a new Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Loop 5 times to read user input, and add each number to the list
        // If the user inputs a negative number, break out of the loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Nur positive ganze Zahlen eingeben: ");
            list.add(input.nextInt());
            if (list.get(i) < 0) break;
        }

        // Remove the last element from the list (which is the negative number that ended the input)
        list.remove(list.size()-1);

        // Print the final list of positive integers entered by the user
        System.out.println(list);
    }
}






