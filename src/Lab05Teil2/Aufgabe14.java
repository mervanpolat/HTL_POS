package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe14 {
    public static void main(String[] args) {
        //Aufgabe 14: Durchschnitt mit Wiederholung
        //Schreiben Sie ein Programm, das den Durchschnitt von drei vom Benutzer eingegebenen Zahlen findet. Wiederholen
        //Sie die Eingabe und lassen Sie den Benutzer drei neue Zahlen eingeben, falls gew̧ünscht.
        //Erste Zahl eingeben: 1
        //Zweite Zahl eingeben: 2
        //Dritte Zahl eingeben: 3
        //Der Durchschnitt von 1, 2 und 3 ist 2,000000
        //Soll noch ein Durchschnitt berechnet werden? [y/n] y
        //Erste Zahl eingeben: 2
        //Zweite Zahl eingeben: 3
        //Dritte Zahl eingeben: 5
        //Der Durchschnitt von 2, 3 und 5 ist 3,333333
        //Soll noch ein Durchschnitt berechnet werden? [y/n] n

        Scanner input = new Scanner(System.in);
        System.out.println();
        char answer;

        do {
            System.out.print("Erste Zahl eingeben: ");
            int zahl1 = input.nextInt();
            System.out.print("Zweite Zahl eingeben: ");
            int zahl2 = input.nextInt();
            System.out.print("Dritte Zahl eingeben: ");
            int zahl3 = input.nextInt();

            int durchschnitt = (zahl1+zahl2+zahl3)/3;
            System.out.println("Der Durchschnitt von " + zahl1 + ", " + zahl2 + ", " + zahl3 + " ist " + durchschnitt);

            System.out.println("Soll noch ein Durchschnitt berechnet werden? [y/n] ");
            answer = input.next().charAt(0);

        } while (answer == 'y');
        System.out.println("Programm wurde beendet!");
    }
}
