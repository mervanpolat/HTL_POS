package Lab01Teil3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Aufgabe4 {
    public static void main(String[] args) {
        /*
        Aufgabe 4: Abgabedaten analysieren

        Beim Anlegen einer neuen Aufgabe in Google Classroom soll die Abgabedeadline gesetzt werden. Erfassen Sie
        zunächst das aktuelle Datum und die aktuelle Uhrzeit und setzen Sie die Abgabedeadline in genau zwei Wochen.
        Geben Sie die Deadline auf der Konsole aus. Verändern Sie die Deadline nun derart, dass die Uhrzeit auf
        23:59:59.000 gesetzt wird und geben Sie die neue Deadline aus.

        Erstellen Sie nun zwei weitere LocalDateTime Variablen, wobei eine vor der Deadline und eine nach der Deadline
        liegen soll. Ermitteln Sie nun für beide Variablen, ob sie vor der Deadline liegen und geben Sie das Ergebnis
        auf der Konsole aus. Ermitteln Sie weiter, wie lange vor bzw. nach der Deadline die Werte liegen und geben Sie auch diese
        Zeitspanne auf der Konsole aus.
        */

        LocalDate d = LocalDate.now();      //2022-10-22
        LocalTime t = LocalTime.now();      //15:08:54.000931

        LocalDate abgabeDatum = d.plusWeeks(2);
        LocalTime abgabeZeit = LocalTime.of(23,59,59,000);
        System.out.println("Der Abgabetermin für die Aufgabe ist am " + abgabeDatum + " um " + abgabeZeit);
        // Prints Der Abgabetermin für die Aufgabe ist am 2023-05-17 um 23:59:59

        LocalDateTime abgabeZeitUndDatum = LocalDateTime.of(abgabeDatum, abgabeZeit);
        LocalDateTime dt2 = LocalDateTime.now();
        LocalDateTime dt3 = LocalDateTime.of(2022, 12, 20, 21,37,10, 000);

        Duration dur = Duration.between(dt2, abgabeZeitUndDatum);
        Duration dur2 = Duration.between(dt3, abgabeZeitUndDatum);

        System.out.println("Der Datum für " + dt2 + " liegt vor der Deadline (" + abgabeZeitUndDatum + ")" + " = " + dur);
        // Prints Der Datum für 2023-05-03T12:45:33.732929 liegt vor der Deadline (2023-05-17T23:59:59) = PT347H14M25.267071S
        System.out.println("Der Datum für " + dt3 + " liegt nach der Deadline (" + abgabeZeitUndDatum + ")" + " = " + dur2);
        // Prints Der Datum für 2022-12-20T21:37:10 liegt nach der Deadline (2023-05-17T23:59:59) = PT3554H22M49S
    }
}
