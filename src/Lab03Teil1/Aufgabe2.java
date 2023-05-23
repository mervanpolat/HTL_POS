package Lab03Teil1;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Aufgabe2: Schulnoten
        // Schreiben Sie ein Programm, das eine Ganzzahl von der Konsole einliest und die entsprechende textuelle
        // Beschreibung der Note ausgibt (Sehr gut - 1, Gut - 2, Befriedigend - 3, Genügend - 4, Nicht genügend - 5).
        // Wenn eine ungültige Zahl eingegeben wird, soll das Programm eine sinnvolle Fehlermeldung ausgeben.
        // Hinweis: Sie können diese Aufgabe mit 'normalen' Verzweigungen oder Mehrfachverzweigungen lösen.

        System.out.print("Bitte geben Sie eine gültige Note ein: ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (1 == n) {
            System.out.println("Sehr gut");
        } else if (2 == n) {
            System.out.println("Gut");
        } else if (3 == n) {
            System.out.println("Befriedigend");
        } else if (4 == n) {
            System.out.println("Genügend");
        } else if (5 == n) {
            System.out.println("Nicht genügend");
        } else {
            System.out.println("Fehleingabe!");
        }

        input.close();
    }
}
