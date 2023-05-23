package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        // Aufgabe 1: Maximum berechnen
        // Der Benutzer soll 3 Zahlen eingeben und das Programm soll das Maximum der 3 Zahlen ermitteln (und auf der
        // Konsole ausgeben). In diesem Fall ist die Verwendung der Funktion Math.max() nicht erlaubt!

        int zahl1, zahl2, zahl3;
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie drei Zahlen ein: ");

        zahl1 = input.nextInt();
        zahl2 = input.nextInt();
        zahl3 = input.nextInt();

        if (zahl1 > zahl2 && zahl1 > zahl2) {
            System.out.println("Aus den drei eingegebenen Zahlen: " + zahl1 + ", " + zahl2 + ", " + zahl3 + " ist die Zahl " + zahl1 + " die größte.");
        } else if (zahl2 > zahl1 && zahl2 > zahl3) {
            System.out.println("Aus den drei eingegebenen Zahlen: " + zahl1 + ", " + zahl2 + ", " + zahl3 + " ist die Zahl " + zahl2 + " die größte.");
        } else {
            System.out.println("Aus den drei eingegebenen Zahlen: " + zahl1 + ", " + zahl2 + ", " + zahl3 + " ist die Zahl " + zahl3 + " die größte.");
        }

        input.close();
    }
}
