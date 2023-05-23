package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String[] args) {
        //Aufgabe 15: Fehlende Zahlen
        //Schreiben Sie ein Programm, bei dem Sie 3 Zahlen zwischen 1 und 10 eingeben können. Anschließend sollen alle
        //noch fehlenden Zahlen zwischen 1 und 10 (jeweils inklusive) ausgegeben werden. Sie benötigen hier keine
        //Fehlerbehandlung (inkorrekte Eingaben, Zahlen außerhalb des Bereiches, etc.).
        //Dieses Programm soll solange ausgeführt werden, bis der Benutzer bei der Eingabe die Zahl 0 eingibt.

        Scanner input = new Scanner(System.in);
        int zahl1, zahl2, zahl3;

        //Eingabeaufforderung für die erste Zahl und Eingabe durch den Benutzer
        //Eingabe wird wiederholt, solange die Eingabe kein gültiger Wert zwischen 1 und 10 ist
        do {
            System.out.print("Geben Sie die erste Zahl zwischen 1-10: ");
            zahl1 = input.nextInt();
        } while (!(zahl1 >= 1 && zahl1<=10));

        //Eingabeaufforderung für die zweite Zahl und Eingabe durch den Benutzer
        //Eingabe wird wiederholt, solange die Eingabe kein gültiger Wert zwischen 1 und 10 ist
        do {
            System.out.print("Geben Sie die zweite Zahl zwischen 1-10: ");
            zahl2 = input.nextInt();
        } while (!(zahl2 >= 1 && zahl2<=10));

        //Eingabeaufforderung für die dritte Zahl und Eingabe durch den Benutzer
        //Eingabe wird wiederholt, solange die Eingabe kein gültiger Wert zwischen 1 und 10 ist
        do {
            System.out.print("Geben Sie die dritte Zahl zwischen 1-10: ");
            zahl3 = input.nextInt();
        } while (!(zahl3 >= 1 && zahl3<=10));

        //Ausgabe aller fehlenden Zahlen zwischen 1 und 10
        for (int i = 1; i <= 10; i++) {
            //Wenn i einer der eingegebenen Zahlen entspricht, wird nichts ausgegeben
            if (i == zahl1 || i == zahl2 || i == zahl3) {
                System.out.print("");
            } else {
                //sonst wird i ausgegeben
                System.out.println(i);
            }
        }
    }
}
