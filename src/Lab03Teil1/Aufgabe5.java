package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        // Aufgabe5: Schnurrschnurr
        // Schreiben Sie ein Programm, das Menschenjahre in Katzenjahre umrechnet.
        // Dabei soll gelten, dass das erste Menschenjahr wie 15 Katzenjahre, das zweite und dritte wie sechs und
        // jedes weitere wie vier Katzenjahre zählen.
        // Lesen Sie die Anzahl an Menschenjahren von der Konsole ein.
        // Zusatz: können Sie ein weiteres Programm schreiben, das die umgekehrte Berechnung – also von Katzenjahren in Menschenjahre – durchführt?

        int erstesJahr= 15;
        int zweitesJahr = 6;
        int drittesJahr = 6;
        int andere = 4;

        System.out.print("Bitte geben Sie eine Zahl für die Menschenjahre ein: ");
        Scanner input = new Scanner(System.in);
        int menschenjahr = input.nextInt();

        if (menschenjahr == 1 ) {
            System.out.println("Die eingegebene Menschenjahr: " + menschenjahr + " entspricht: " + erstesJahr + " Katzenjahre");
        } else if (menschenjahr == 2) {
            System.out.println("Die eingegebene Menschenjahr: " + menschenjahr + " entspricht: " + zweitesJahr + " Katzenjahre");
        } else if (menschenjahr == 3) {
            System.out.println("Die eingegebene Menschenjahr: " + menschenjahr + " entspricht: " + drittesJahr + " Katzenjahre");
        } else if (menschenjahr >= 4) {
            System.out.println("Die eingegebene Menschenjahr: " + menschenjahr + " entspricht: " + andere + " Katzenjahre");
        }

        input.close();
    }
}
