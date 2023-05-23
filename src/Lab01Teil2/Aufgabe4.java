package Lab01Teil2;

public class Aufgabe4 {
    public static void main(String[] args) {

        // Aufgabe 4: Verknüpfen von Zeichenketten
        // Erstellen Sie zwei String und eine Floatvariable und verknüpfen Sie diese zu einem einzelnen String.
        // Geben Sie den Ergebnisstring dann auf der Konsole aus. Die Ausgabe könnte wie folgt aussehen:
        // Der Computer kostet 1234.56 Euro.

        String textEins,textZwei;
        float zahl;

        textEins = "Der Computer kostet ";
        zahl = 1234.56f;
        textZwei = " Euro.";

        System.out.println(textEins + zahl + textZwei); //Prints Der Computer kostet 1234.56 Euro.

        System.out.println();
    }
}
