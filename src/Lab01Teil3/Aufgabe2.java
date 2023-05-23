package Lab01Teil3;

import java.math.BigDecimal;

public class Aufgabe2 {
    public static void main(String[] args) {
        /*
        Aufgabe 2: Rechnen mit Geldbeträgen

        Für das Rechnen mit Geldbeträgen (Kontobewegungen, Online Shop, Kassenbuch, etc.) eignet sich der Datentyp
        BigDecimal, weil es bei diesem Datentyp zu keinen Rundungsfehlern kommt. Erstellen Sie zwei Variablen vom Typ
        BigDecimal aus Ganz- oder Kommazahlen und eine dritte aus der String darstellung einer Kommazahl. Addieren
        Sie die ersten beiden Zahlen und subtrahieren Sie die dritte davon. Geben Sie die Rechnung und das Ergebnis auf
        der Konsole aus.
        */

        BigDecimal zahl1 = new BigDecimal("500.23");
        BigDecimal zahl2 = new BigDecimal("235.2");
        String stringZahl = "124.56";
        BigDecimal zahl3 = new BigDecimal(stringZahl);
        BigDecimal addition = zahl1.add(zahl2);
        BigDecimal subtraction = addition.subtract(zahl3);
        System.out.println(zahl1 + " + " + zahl2 + " = " + addition + " - " + zahl3 + " = " + subtraction);
        //Prints 500.23 + 235.2 = 735.43 - 124.56 = 610.87
    }
}
