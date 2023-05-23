package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String[] args) {
        // Aufgabe7: Sternzeichenbestimmen
        // Schreiben Sie ein Programm, bei dem der Benutzer seinen Geburtsmonat und Geburtstag eingeben kann.
        // Das Programm gibt dann das entsprechende Sternzeichen aus.
        // Zusatzaufgabe: führen Sie eine Überprüfung der Monats- und Tageszahl durch.

        System.out.print("Bitte geben Sie Ihr Geburtstag ein: ");
        Scanner input = new Scanner(System.in);
        int tag = input.nextInt();

        System.out.print("Geburtsmonat: ");
        int monat = input.nextInt();

        String zeichen="";

        //Logik

        if (monat == 1) {
            if (tag < 20)
                zeichen = "Steinbock";
            else
                zeichen = "Wassermann";
        }
        else if (monat == 2) {
            if (tag < 19)
                zeichen = "Wassermann";
            else
                zeichen = "Fische";
        }
        else if(monat == 3) {
            if (tag < 21)
                zeichen = "Fische";
            else
                zeichen = "Widder";
        }
        else if (monat == 4) {
            if (tag < 20)
                zeichen = "Widder";
            else
                zeichen = "Stier";
        }
        else if (monat == 5) {
            if (tag < 21)
                zeichen = "Stier";
            else
                zeichen = "Zwillinge";
        }
        else if(monat == 6) {
            if (tag < 21)
                zeichen = "Zwillinge";
            else
                zeichen = "Krebs";
        }
        else if (monat == 7) {
            if (tag < 23)
                zeichen = "Krebs";
            else
                zeichen = "Löwe";
        }
        else if( monat == 8) {
            if (tag < 23)
                zeichen = "Löwe";
            else
                zeichen = "Jungfrau";
        }
        else if (monat == 9) {
            if (tag < 23)
                zeichen = "Jungfrau";
            else
                zeichen = "Waage";
        }
        else if (monat == 10) {
            if (tag < 23)
                zeichen = "Waage";
            else
                zeichen = "Skorpion";
        }
        else if (monat == 11) {
            if (tag < 22)
                zeichen = "Skorpion";
            else
                zeichen = "Schütze";
        }
        else if (monat == 12) {
            if (tag < 22)
                zeichen = "Schütze";
            else
                zeichen ="Steinbock";
        }

        System.out.println("Die Astrologische Zeichen für " + tag + "." + monat + " ist " + zeichen);
        input.close();
    }
}
