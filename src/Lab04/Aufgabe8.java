package Lab04;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
         /*
        Aufgabe 8: Noteneingabe
        Erstellen Sie eine leere Liste von Ganzzahlen. Lassen Sie den Benutzer/die Benutzerin nun insgesamt drei Zahlen
        eingeben. Überprüfen Sie für jede Zahl, ob sie einer gültigen Note (also einem Wert zwischen 1 (sehr gut) und 5 (nicht
        genügend) entspricht. Nur gültige Zahlen sollen in die Liste aufgenommen werden.
        Berechnen Sie währenddessen auch den Notendurchschnitt der eingegebenen Noten.
        */

        // Erstellen einer Scanner-Instanz zum Einlesen von Benutzereingaben
        Scanner input = new Scanner(System.in);
        // Erstellen einer leeren ArrayList für die gültigen Noten
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Eingabe der ersten Zahl und Überprüfung auf Gültigkeit
        System.out.print("Geben Sie die erste Zahl ein: ");
        int zahl1 = input.nextInt();
        if (zahl1 >= 1 && zahl1<= 5) arrayList.add(zahl1);
        else {
            System.out.println("Ungültige Zahl!");
        }

        // Eingabe der zweiten Zahl und Überprüfung auf Gültigkeit
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zahl2 = input.nextInt();
        if (zahl2 >= 1 && zahl2<= 5) arrayList.add(zahl2);
        else {
            System.out.println("Ungültige Zahl!");
        }

        // Eingabe der dritten Zahl und Überprüfung auf Gültigkeit
        System.out.print("Geben Sie die dritte Zahl ein: ");
        int zahl3 = input.nextInt();
        if (zahl3 >= 1 && zahl3<= 5) arrayList.add(zahl3);
        else {
            System.out.println("Ungültige Zahl!");
        }

        // Berechnung des Notendurchschnitts
        int notendurchschnitt = (zahl1+zahl2+zahl3) /3;
        // Ausgabe der gültigen Noten
        System.out.println(arrayList);
        // Ausgabe des Notendurchschnitts
        System.out.println("Notendurchschnitt: " + notendurchschnitt);
    }
}
