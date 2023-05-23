package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe13 {
    public static void main(String[] args) {
        //Aufgabe 13: Wo ist denn der Buchstabe?
        //Schreiben Sie ein Programm, das alle Buchstaben eines vom Benutzer eingegebenen Strings mit ihrer Position
        //ausgibt.

        Scanner input = new Scanner(System.in); // create a new Scanner object to read user input
        System.out.println("Bitte geben Sie einen Text ein: "); // prompt the user to enter a string
        String text = input.nextLine(); // read the user input as a string and store it in the 'text' variable

        int position = 1; // initialize the position counter to 1

        // loop through each character in the string and print its position and value
        for (int i = 0; i < text.toCharArray().length; i++) {
            System.out.println("Der Buchstabe an Position "+ position + " ist " + text.charAt(i)); // print the character's position and value
            position++; // increment the position counter
        }
    }
}
