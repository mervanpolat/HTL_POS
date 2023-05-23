// Import the necessary class for reading input.
package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String[] args) {
        //Aufgabe 7: L‰nge eines Strings – Do It Yourself
        //Schreiben Sie ein Programm, bei dem der Benutzer einen String eingeben kann und die L‰nge des Strings
        //ausgegeben wird. Dabei dürfen Sie aber die Funktion length() nicht verwenden!
        //Gib einen String ein: Hello world!
        //L‰nge des Strings 'Hello world!': 12

        // Create a Scanner object for reading user input.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a text and read it as a string.
        System.out.println("Geben Sie einen Text ein: ");
        String text = input.nextLine();

        // Initialize a counter to keep track of the length of the string.
        int counter = 0;

        // Iterate through each character in the string and increment the counter for each character.
        for (char ch : text.toCharArray()) {
            counter++;
        }

        // Print the length of the string.
        System.out.println("Länge des String '" + text + "' : " + counter);
    }
}
