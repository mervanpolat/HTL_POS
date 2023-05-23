package Lab03Teil2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aufgabe4 {
    public static void main(String[] args) {
        // Aufgabe 4: Zeitdifferenz (fortgeschritten)
        // Schreiben Sie ein Programm, das die Differenz zweier Zeitangaben berechnet.
        // Die Zeitangaben werden in Stunden, Minuten und Sekunden angegeben.
        // Die Differenz soll ebenfalls in Stunden, Minuten und Sekunden ausgegeben werden.
        // Zusatz: stellen Sie sicher, dass das Eingabeformat korrekt ist und auch die eingegebenen Zahlenbereiche gültig sind (z.B. Stunden nur zwischen 0 und 23).
        // Zusatz: stellen Sie sicher, dass auch der Überschreitung von Mitternacht Rechnung getragen wird. Zum Beispiel beträgt die Differenz zwischen 22:00:00 Uhr und 05:00:00 Uhr genau 7 Stunden.

        LocalDateTime ldtOne = LocalDateTime.of(2022,12,25,22,00,00);
        LocalDateTime ldtTwo = LocalDateTime.of(2022,12,26,5,00,00);
        Duration dur = Duration.between(ldtOne,ldtTwo);

        System.out.println("Die Differenz beträgt: " + dur);

        //prints: Die Differenz beträgt: PT7H
    }
}
