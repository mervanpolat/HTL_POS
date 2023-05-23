package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe10 {
    public static void main(String[] args) {
        // Aufgabe 10: (Z)Ersetzungsaufgabe
        // Schreiben Sie ein Programm, das alle s und S eines eingegebenen Strings in $ umwandelt.
        // Sie können diese Aufgabe zuerst mit String-Funktionen lösen, aber nachdem es hier um Schleifen geht,
        // versuchen Sie es bitte auch mit einer Schleife.
        // Eingabe String: Gestern schien die Sonne.
        // Der neue String lautet: Ge$tern $chien die $onne.

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein: ");
        String text = input.nextLine();
        System.out.println("Eingabe String: " + text);

        for (int i = 0; i < text.length(); i++) {
            // Überprüfen, ob das aktuelle Zeichen im Text 's' oder 'S' ist
            if (text.charAt(i) == 's' || text.charAt(i) == 'S') {
                // Wenn ja, ersetzen Sie das Zeichen durch '$'
                text = text.replace("s","$");
                text = text.replace("S","$");
            }
        }
        // Ausgabe des neuen Textes
        System.out.println("Der neue String lautet: " + text);
    }
}
