package Lab06Teil1;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        // Aufgabe1: Namen einlesen
        // Schreiben Sie eine Funktion readName, die den Benutzer/die Benutzerin seinen/ihren Nickname eingeben lässt.
        // Ein Nickname muss allerdings aus mindestens 3 Zeichen bestehen. Erst wenn mindestens 3 Zeichen eingegeben wurden,
        // soll die Funktion den Nickname als Ergebnis zurückliefern. Rufen Sie die Funktion in Ihrem Programm auf!

        // Start of the program
        // Calls the nickname function with an empty string as an argument
        nickname("");
    }

    // Defines a static method called "nickname" that takes a string as a parameter
    static void nickname(String name) {

        // The do-while loop continues until a valid nickname is provided
        do {
            // Prompts the user to enter their nickname
            System.out.print("Enter your nickname: ");

            // Creates a new Scanner object named "input" to read user input
            Scanner input = new Scanner(System.in);

            // Reads the user's input and assigns it to the "name" variable
            name = input.nextLine();

            // Checks if the length of the entered name is at least 3 characters long
            if (name.length() >= 3) {
                // If the condition is met, the entered name is printed
                System.out.println(name);
            } else {
                // If the entered name is shorter than 3 characters, the user is asked to enter a longer name
                System.out.println("Enter a name which consists at least of three characters!");
            }

            // The loop continues until the length of the entered name is at least 3 characters
        } while (!(name.length()>=3));
    }
}
