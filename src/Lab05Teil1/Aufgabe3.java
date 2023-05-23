package Lab05Teil1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        //Aufgabe 3: Durchsuchen einer Liste
        //Erstellen Sie nochmals eine Liste aus Ganzzahlen mit mindestens 5 Elementen. Finden Sie nun das größte und das
        //kleinste Element in der Liste und geben Sie diese auf der Konsole aus. (Die Verwendung von min() und max() ist
        //nicht erlaubt.)
        //• Testen Sie Ihr Programm mit der Liste [7, 5, 6, 4, 2, 1, 3]
        //Min = 1, max = 7
        //Zusatzaufgabe: lösen Sie diese Aufgabe sowohl mit einer for-Schleife als auch mit einer while-Schleife.
        //Profi-Zusatzaufgabe: finden Sie jetzt das zweitgrößte und zweitkleinste Element in der Liste.
        //Min = 1, min2 = 2, max = 7, max2 = 6


        // Create a new Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Create a new ArrayList of integers to store the numbers
        ArrayList<Integer>list = new ArrayList<Integer>(5);

        // Prompt the user to enter 5 numbers and add them to the list
        for (int i = 0; i < 5; i++) {
            System.out.println("Zahl eingeben: ");
            list.add(input.nextInt());
        }

        // Initialize variables to hold the minimum and maximum values, using the constants from the Integer class
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Loop through the list to find the maximum value
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num > max) max = num;
        }

        // Loop through the list again to find the minimum value
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) min = num;
        }

        // Print out the original list, the maximum value, and the minimum value
        System.out.println(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Sort the list in ascending order
        Collections.sort(list);
        // Print out the sorted list, along with the second maximum and second minimum values
        System.out.println(list);
        System.out.println("Second max value: " + list.get(list.size()-2));
        System.out.println("Second min value: " + list.get(1));
    }
}
