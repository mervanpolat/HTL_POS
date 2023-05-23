package Lab01Teil1;

public class Aufgabe5 {
    public static void main(String[] args) {
        // Aufgabe5: Energiekosten
        // Eine Glühbirne leuchtet durchschnittlich 6 Stunden pro Tag. Dabei verbraucht sie 60 W an Strom.
        // Berechnen Sie ihre jährlichen Energiekosten, wenn eine kWh Strom 0,19 € kostet.
        // Geben Sie das Ergebnis auf der Konsole aus.
        // • Verwenden Sie aussagekräftige Variablennamen
        // • Verwenden Sie Variablen für alle Zahlenwerte, sodass Sie diese später leicht ändern können
        // • Berechnen Sie die Energiekosten, wenn statt der 60 W Birne eine Energiesparlampe verwendet wird, die
        // nur 5 W Strom verbraucht.
        // Erzeugen Sie eine entsprechende Ausgabe auf der Konsole, die alle verwendeten Werte und das Ergebnis zeigt.

        float gesamtVerbrauch, verbrauchInKWh, preisInKwh, kWhStromPreis, jahr;

        kWhStromPreis = 0.19f;                      //Preis pro kWh beträgt €0,19
        gesamtVerbrauch = 60 * 6;                   //Verbrauchsberechnung für 6 Stunden
        verbrauchInKWh = gesamtVerbrauch / 1000;    // Umwandlung auf Kilowattstunden
        preisInKwh = verbrauchInKWh * kWhStromPreis;// Gesamtpreis in kWh
        jahr =  preisInKwh * 365;                   // Gesamtpreis für ein ganzes Jahr
        System.out.println("€" + jahr);             // Ausgabe

        //Prints €24.966002
    }
}
