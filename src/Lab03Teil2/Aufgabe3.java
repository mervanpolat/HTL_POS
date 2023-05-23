package Lab03Teil2;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Aufgabe 3: Es kommt die Zeit im Jahr
        // Schreiben Sie ein Programm, bei dem man das Monat (als Zahl zwischen 1 und 12) und den Tag (als Zahl zwischen 1 und 31)
        // eingibt und das die astronomische Jahreszeit an diesem Tag ausgibt. Führen Sie Überprüfungen der Eingaben durch.
        // Wir ignorieren jedoch Schaltjahre und legen den Beginn der Jahreszeiten mit 20. März, 21. Juni, 23. September und 21. Dezember fest.
        // 1,  2, 12: Winter
        // 3,  4,  5: Frühling
        // 6,  7,  8: Sommer
        // 9, 10, 11: Herbst

        //Winterbeginn: 21.12 und Ende 20.3

        int monat, tag;
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte geben Sie den Monat als Zahl ein: ");
        monat = input.nextInt();
        System.out.print("Bitte geben Sie den Tag ein: ");
        tag = input.nextInt();

        String jahreszeit = "";

        //Kontrolle

        if ((tag > 0 && tag <= 31) && (monat > 0 && monat <= 12)) {
        } else {
            System.out.println("Ungültig!");
        }

        //Winter

        if (monat == 1 || monat == 2 || monat == 12 || monat == 3) {
            if ((monat == 12 && tag >= 21) || (monat == 1 && tag > 0 && tag <= 31) || (monat == 2 && tag > 0 && tag <= 31) || (monat == 3 && tag <= 19)) {
                jahreszeit = "Winter";
            }
        }

        //Frühling

        if (monat == 3 || monat == 4 || monat == 5) {
            if ((monat == 3 && tag >= 20 && tag < 32) || (monat == 4 && tag > 0 && tag < 32) || (monat == 5 && tag > 0 && tag < 32)) {
                jahreszeit = "Frühling";
            }
        }

        //Sommer

        if (monat == 7 || monat == 8 || monat == 9) {
            if ((monat == 7 && tag > 20 && tag < 32) || (monat == 8 && tag > 0 && tag < 32) || (monat == 9 && tag > 0 && tag < 23)) {
                jahreszeit = "Sommer";
            }
        }

        // Herbst

        if (monat == 9 || monat == 10 || monat == 11 || monat == 12) {
            if ((monat == 9 && tag >= 23 && tag < 32) || (monat == 10 && tag > 0 && tag < 32) || (monat == 11 && tag > 0 && tag < 32) || (monat == 12 && tag > 0 && tag <= 20)) {
                jahreszeit = "Herbst";
            }
        }
        System.out.println("Die Jahreszeit von " + tag + "." + monat + ".2022" + " ist " + jahreszeit + ".");

        input.close();
    }
}
