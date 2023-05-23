package Lab02;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Aufgabe 2: Benzinverbrauch
        // Um den Benzinverbrauch ihres Fahrzeuges ausrechnen zu können, hat Noemi beim letzten Mal Tanken
        // ihren Kilometerstand aufgeschrieben. Als sie das nächste Mal zum Tanken hält, kann sie anhand
        // des aktuellen Kilometerstands, der getankten Liter Benzin und des Gesamtpreises der Tankfüllung den
        // Benzinverbrauch pro 100 km und die Treibstoffkosten pro 100 km berechnen.
        // • Der ursprüngliche Kilometerstand, der aktuelle Kilometerstand, die getankte Menge Benzin (in l) und die
        //   Kosten für die Tankfüllung (in EUR) sollen vom Benutzer eingegeben werden können.
        // • Berechnen Sie den Benzinverbrauch pro 100 km und die Treibstoffkosten pro 100 km und geben Sie sie auf der Konsole aus.

        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------Aufgabe 2------------------------------");

        double liter_getankt, km_Unterschied, preis_gesamt, alteKmstand, neueKmstand;

        System.out.print("Bitte geben Sie die ursprüngliche Kilometerstand ein: ");
        alteKmstand = input.nextDouble();
        System.out.print("Bitte geben Sie die neue Kilometerstand ein: ");
        neueKmstand = input.nextDouble();

        km_Unterschied = neueKmstand - alteKmstand;

        System.out.print("Wie viel Liter Benzin haben Sie getankt? : ");
        liter_getankt = input.nextDouble();
        System.out.print("Wie viel hat die Tankfüllüng gekostet?: ");
        preis_gesamt = input.nextDouble();

        double benzinVerbrauchPro100km = (liter_getankt / km_Unterschied) * 100;
        double spritPreisProKm = (liter_getankt/preis_gesamt);
        double gesamtSpritKosten = (preis_gesamt/km_Unterschied) * 100;

        System.out.println("Das Auto benötigt pro 100 km " + benzinVerbrauchPro100km + " Liter Treibstoff, die €" + gesamtSpritKosten + " kosten");
    }
}
