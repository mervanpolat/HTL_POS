package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
        // Aufgabe8: Let’sparty!
        // Schreiben Sie ein Programm, das dem Benutzer hilft zu überprüfen, ob die Party beginnen kann.
        // Das Programm soll den Benutzer zumindest 3 Fragen stellen (z.B. „Sind genügend Getränke eingekühlt?“) und
        // auf die Antwort des Benutzers warten. Tippt der Benutzer ‚j‘ oder ‚J‘ ein, soll die nächste Frage gestellt werden.
        // Nur wenn alle Fragen mit ‚Ja‘ beantwortet werden, soll „Die Party kann beginnen“ auf der Konsole ausgegeben werden

        Scanner input = new Scanner(System.in);

        System.out.print("Sind genügend Getränke eingekühlt? (j/n): ");
        char ans = input.next().charAt(0);

        if (ans == 'j') {
            System.out.print("Sind Sie mindestens 18 Jahre alt? (j/n): ");
            ans = input.next().charAt(0);

            if (ans == 'j') {
                System.out.print("Haben Sie genung Geld? (j/n): ");
                ans = input.next().charAt(0);

                if (ans == 'j') {
                    System.out.println("Party kann beginnen!");
                }
            }
        } else {
            System.out.println("Das Programm wurde beendet!");
        }
        input.close();
    }
}
