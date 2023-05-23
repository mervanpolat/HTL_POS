package Lab02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {

        // Aufgabe 5: Kostenfunktion
        // Eine Firma möchte die Berechnung der Preise ihrer Produkte automatisieren. Es soll daher ein Programm erstellt werden,
        // das den Grundpreis eines Produktes (Gleitkommazahl!) in Euro einliest, die Fixkosten von 15% des Grundpreises addiert
        // und anschließend noch einen Gewinn von 20% (von Grundpreis plus Fixkosten) hinzuaddiert. Dieser Verkaufspreis soll dann ausgegeben werden.
        // Hinweis: auch hier können Sie bei der Verwendung des Datentyps double möglicherweise einen Rundungsfehler beobachten!
        // Grundpreis eingeben: 10.0
        // Der Verkaufspreis beträgt 13.799999999999999 Euro.
        // Schreiben Sie Ihr Programm im nächsten Schritt so um, dass der Datentyp BigDecimal verwendet wird, und vergleichen Sie die Ausgabe.

        Scanner input = new Scanner(System.in);

        BigDecimal basispreis,fixkosten,gewinn;

        System.out.print("Bitte geben Sie eine Zahl für den Basispreis ein: ");
        basispreis = input.nextBigDecimal();

        fixkosten = new BigDecimal("1.15");
        gewinn = new BigDecimal("1.20");

        BigDecimal gesamtkosten = basispreis.multiply(fixkosten).multiply(gewinn);

        System.out.println("Der Verkaufspreis für den Basispreis " + "€"+ basispreis + " beträgt " + gesamtkosten);
    }
}
