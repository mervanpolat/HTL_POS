package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String[] args) {
        //Aufgabe 16: Jahrestag
        //Schreiben Sie ein Programm, bei dem Sie Tag und Monat (als Zahlen) eingeben können und das Programm
        //ausrechnet der wievielte Tag im Jahr es ist. Gehen Sie davon aus, dass es sich um kein Schaltjahr handelt.
        //Monat (1-12) eingeben: 5
        //Tag (1-31) eingeben: 17
        //Der 17. 5. ist der 137. Tag im Jahr.
        //Zusatzaufgabe:  überprüfen Sie, dass der angegebene Tag für das angegebene Monat möglich ist. Also kein 31.
        //Februar und schon gar kein 55.August oder ähnliches.

        Scanner input = new Scanner(System.in);
        System.out.print("Monat (1-12) eingeben: ");
        int month = input.nextInt();
        System.out.print("Tag (1-31) eingeben: ");
        int day = input.nextInt();

        // Überprüfen, ob die Eingaben gültig sind
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Ungültige Eingabe!");
            return;
        }

        // Array mit Anzahl der Tage pro Monat
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // Anzahl der Tage in allen Monaten vor dem eingegebenen Monat addieren
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Anzahl der Tage im eingegebenen Monat addieren
        totalDays += day;

        // Ergebnis ausgeben
        System.out.println("Der " + day + "." + month + " ist der " + totalDays + ". Tag im Jahr.");

        // Beispiel-Ausgabe: Monat (1-12) eingeben: 6
        //                   Tag (1-31) eingeben: 23
        //                   Der 23.6 ist der 174. Tag im Jahr.
    }
}
