package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe9 {
    public static void main(String[] args) {
        //Aufgabe 9: Häufigkeitsanalyse
        //Schreiben Sie ein Programm, das den Benutzer einen String und einen Buchstaben eingeben l‰sst. Im Anschluss soll
        //das Programm die Häufigkeit des Buchstabens im String ausgeben.
        //Eingabe String: Heute ist ein schöner Tag.
        //Eingabe Buchstabe: eu
        //Bitte nur einen Buchstaben eingeben!
        //Ein (!) Buchstabe bitte: e
        //Der Buchstabe 'e' kommt im String 'Heute ist ein schöner Tag.' 4 Mal vor.

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Bitte geben Sie einen Text ein: ");
        String text = input.nextLine();

        // Prompt the user to enter a letter
        System.out.println("Bitte geben Sie ein Buchstabe ein: ");
        char buchstabe = input.nextLine().charAt(0);

        // Create a counter to keep track of the number of times the letter appears in the text
        int counter = 0;

        // Loop through the text to count the number of times the letter appears
        for (int i = 0; i < text.length(); i++) {
            if (buchstabe==text.charAt(i)) {
                counter++;
            }
        }

        // Display the result to the user
        System.out.println("Der Buchstabe '" + buchstabe + "' kommt im String '" +  text + "' " + counter + " Mal vor.");
    }
}
