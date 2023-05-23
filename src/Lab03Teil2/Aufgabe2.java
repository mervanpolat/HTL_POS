package Lab03Teil2;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Aufgabe 2: Umfang und Diagonale
        // Schreiben Sie ein Programm, bei dem Sie die zwei Seiten eines Rechtecks eingeben können.
        // Kontrollieren Sie, ob die Eingaben korrekt sind (d.h. größer als 0) und berechnen Sie Umfang und Diagonale des Rechtecks.
        // Geben Sie beide Rechenergebnisse auf der Konsole aus.
        // Hinweis: für die Quadratwurzel können Sie die Funktion Math.sqrt() verwenden.

        double a,b,umfang,diagonale;

        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl für die Länge ein: ");
        a = input.nextInt();

        System.out.print("Bitte geben Sie eine Zahl für die Breite ein: ");
        b = input.nextInt();

        if (a > 0 && b > 0) {
            umfang = a+b+a+b;
            diagonale = Math.sqrt((a*a) + (b*b));

            System.out.println("Der Umfang beträgt: " + umfang);
            System.out.println("Die Diagonale beträgt: " + diagonale);
        } else {
            System.out.println("Ungültig!");
        }
        input.close();
    }
}
