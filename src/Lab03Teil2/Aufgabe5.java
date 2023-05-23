package Lab03Teil2;

import java.util.Random;
import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        // Aufgabe 5: Rechentrainer
        // Erstellen Sie ein Programm, das mittels Zufallsgenerator eine Rechenoperation (Addition, Subtraktion,
        // Multiplikation oder Division) und zwei zufällige Argumente ermittelt und als Rechnung anzeigt.
        // Außerdem soll das Programm drei mögliche Lösungen anzeigen, wobei eine die richtige Lösung sein soll und
        // die anderen beiden falsche Lösungen. Danach muss man sich mittels Eingabe (a, b oder c) für eine Lösung entscheiden.
        // Wenn die Lösung richtig ist, soll eine Gratulation auf der Konsole angezeigt werden; ansonsten soll auf die richtige Antwort (a, b oder c) hingewiesen werden.

        Random rand = new Random();
        int max = 100;
        Scanner input = new Scanner(System.in);

        int a, b, c;

        a = 12;
        b = 19;
        c = 21;

        //generiert Zufallszahlen von 0-19
        int firstNumber = rand.nextInt(max);
        int secondNumber = rand.nextInt(max);

        //Part: 1

        //Mögliche Ergebnisse
        int ergebnis = firstNumber + secondNumber;
        int ergebnis2 = firstNumber + a;
        int ergebnis3 = secondNumber + b;

        //Ausgabe
        System.out.println("Mögliche Lösungen:\n");
        System.out.println("a: " + firstNumber + " + " + secondNumber + " = " + ergebnis);
        System.out.println("b: " + firstNumber + " + " + secondNumber + " = " + ergebnis2);
        System.out.println("c: " + secondNumber + " + " + firstNumber + " = " + ergebnis3);

        System.out.print("Welches der obigen Ergebnisse sind korrekt?: ");
        char answer = input.next().charAt(0);

        //Eingabe
        if (answer == 'a') {
            System.out.println("Richtig!");
        } else {
            System.out.println("Leider ist ihre Eingabe falsch, die richtige Lösung lautet: " + ergebnis);
        }

        //Part 2

        a = 5;
        b = 6;
        c = 34;

        //Mögliche Ergebnisse
        ergebnis = b + a;
        ergebnis2 = firstNumber + secondNumber;
        ergebnis3 = c + b;

        //Ausgabe
        System.out.println("Mögliche Lösungen:\n");
        System.out.println("a: " + a + " + " + b + " = " + ergebnis2);
        System.out.println("b: " + firstNumber + " + " + secondNumber + " = " + ergebnis2);
        System.out.println("c: " + secondNumber + " + " + firstNumber + " = " + ergebnis3);

        System.out.print("Welches der obigen Ergebnisse sind korrekt?: ");
        answer = input.next().charAt(0);

        if (answer == 'b') {
            System.out.println("Richtig!");
        } else {
            System.out.println("Leider ist ihre Eingabe falsch, die richtige Lösung lautet: " + ergebnis2);
        }

        //Part3

        a = 19;
        b = 114;
        c = 57;

        //Mögliche Ergebnisse
        ergebnis = secondNumber + a;
        ergebnis2 = a + b;
        ergebnis3 = firstNumber + secondNumber;

        //Ausgabe
        System.out.println("Mögliche Lösungen:\n");
        System.out.println("a: " + a + " + " + b + " = " + ergebnis2);
        System.out.println("b: " + secondNumber + " + " + a + " = " + ergebnis2);
        System.out.println("c: " + firstNumber + " + " + secondNumber + " = " + ergebnis3);

        System.out.print("Welches der obigen Ergebnisse sind korrekt?: ");
        answer = input.next().charAt(0);

        if (answer == 'c') {
            System.out.println("Richtig!");
        } else {
            System.out.println("Leider ist ihre Eingabe falsch, die richtige Lösung lautet: " + ergebnis3);
        }
        input.close();
    }
}
