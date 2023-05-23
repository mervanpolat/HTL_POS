package Lab02.IPOAufgaben;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------ Aufgabe 1.1 ------------------------------------");

        //Berechne den Rabatt auf ein Produkt. z.B. 30% Rabatt auf ein Spiel im Steam Sale.
        System.out.print("Bitte geben Sie den Betrag für den Preis ein: ");
        double preis = input.nextDouble();
        System.out.print("Bitte geben Sie den Betrag für die Rabatt ein: ");
        double rabatt = input.nextDouble();
        double berechneRabatt = 100.0 - rabatt;
        double gesamtRabattBerechnung = berechneRabatt / 100.0;
        System.out.println("Der Preis €" + preis + " mit " + (int)rabatt + "% Rabatt kostet: €" + preis * gesamtRabattBerechnung);

        System.out.println("------------------------------------ Aufgabe 1.2 ------------------------------------");

        //Konvertiere Meter in Fuß.
        System.out.print("Bitte geben Sie eine Zahl für Meter ein: ");
        double laengeInMeter = input.nextDouble();
        double zahl = 3.281;
        double formel = laengeInMeter * zahl;
        System.out.println("Die Länge " + laengeInMeter + "m beträgt: " + formel + " Fuß.");

        System.out.println("------------------------------------ Aufgabe 1.3 ------------------------------------");

        //Konvertiere Kilometer zu Meilen.
        System.out.print("Bitte eine Zahl für Kilometer eingeben: ");
        double km = input.nextDouble();
        double calculateKmToMiles = km / 1.609;
        System.out.println("" + km + " Kilometer beträgt " + calculateKmToMiles + " Meile");

        System.out.println("------------------------------------ Aufgabe 1.4 ------------------------------------");

        //Berechne Umfang und Fläche eines Rechtecks.
        System.out.print("Bitte geben Sie eine Zahl für die Länge des Rechtecks ein: ");
        double a = input.nextDouble();
        System.out.print("Bitte geben Sie eine Zahl für die Breite des Rechtecks ein: ");
        double b = input.nextDouble();
        double umfang = a + b + a + b;
        System.out.println("Der Umfang beträgt " + umfang);

        System.out.println("------------------------------------ Aufgabe 1.5 ------------------------------------");

        //Konvertiere Minuten in Stunden und Minuten.
        System.out.print("Bitte geben Sie eine Zahl für Minuten ein: ");
        double eingabeMinuten = input.nextDouble();

        double stundenBerechnung = eingabeMinuten / 60.0;
        double minutenBerechnung = eingabeMinuten % 60.0;

        System.out.println("" + eingabeMinuten + " Minuten beträgt: " + (int)stundenBerechnung + " Stunden und " + minutenBerechnung + " Minuten");

        System.out.println("------------------------------------ Aufgabe 1.6 ------------------------------------");

        //Rechne Kilogramm und Gramm in Gramm um.
        System.out.print("Bitte geben Sie eine Zahl für Kilogramm ein: ");
        double kilogramm = input.nextDouble();
        double gramm = kilogramm * 1000;
        System.out.println(kilogramm + " Kilogramm beträgt: " + gramm + " Gramm.");

        System.out.println("------------------------------------ Aufgabe 1.7 ------------------------------------");

        //Berechne den Body Mass Index
        double koerpermasse, koerpergroeße, bmi;

        System.out.print("Bitte gebe deine Körpermasse in Kilogramm ein: ");
        koerpermasse = input.nextDouble();

        System.out.print("Bitte gebe deine Körpergrösse ein: ");
        koerpergroeße = input.nextDouble();
        koerpergroeße = koerpergroeße / 100;

        bmi = koerpermasse / (koerpergroeße*koerpergroeße);

        System.out.println("Dein BMI lautet: " + bmi);

        System.out.println("------------------------------------ Aufgabe 1.8 ------------------------------------");

        //Berechne den Jahresverbrauch einer Glühbirne
        double gesamtVerbrauch, verbrauchInKWh, preisInKwh, kWhStromPreis, jahr, verbrauch, stunden;

        System.out.print("Bitte einen Preis für kWh festlegen: ");
        kWhStromPreis = input.nextDouble();             //Preis pro kWh beträgt x

        System.out.print("Bitte eine Zahl für Verbrauch (Watt) bestimmen: ");
        verbrauch = input.nextDouble();

        System.out.print("Bitte die Stunden für die Stromberechnung eingeben: ");
        stunden = input.nextDouble();

        gesamtVerbrauch = verbrauch * stunden;          //Verbrauchsberechnung für x Stunden
        verbrauchInKWh = gesamtVerbrauch / 1000;        //Umwandlung auf Kilowattstunden
        preisInKwh = verbrauchInKWh * kWhStromPreis;    //Gesamtpreis in kWh
        jahr =  preisInKwh * 365;                       //Gesamtpreis für ein ganzes Jahr
        System.out.println();

        System.out.println("Der Jahresverbrauch eines Glühbirne beträgt: " + jahr + " kWh.");
    }
}
