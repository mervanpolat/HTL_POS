package Lab01Teil3;

public class Aufgabe1 {
    public static void main(String[] args) {
        //Aufgabe 1: Minimum ermitteln
        //Gegeben sind drei String Variablen mit beliebigen ganzzahligen Werten (als Strings!), z.B. "23", "5","13".
        //Wandeln Sie die Strings in Integer-Werte um und ermitteln Sie das Minimum und Maximum der drei Zahlen.
        //Geben Sie die drei Zahlen und das Minimum/Maximum auf der Konsole aus.
        //Das Minimum von 23, 5 und 13 ist 5.
        //Das Maximum von 23, 5 und 13 ist 23.

        String a = "5";
        String b = "543";
        String c = "54";

        int zahlA = Integer.parseInt(a);
        int zahlB = Integer.parseInt(b);
        int zahlC = Integer.parseInt(c);

        int max = Integer.max(Integer.max(zahlA,zahlB), zahlC);
        System.out.println("Das maximum von " + zahlA + ", " + zahlB + " und " + zahlC + " ist " + max);
        // Prints Das maximum von 5, 543 und 54 ist 543
        int min = Integer.min(Integer.min(zahlA,zahlB), zahlC);
        System.out.println("Das minimum von " + zahlA + ", " + zahlB + " und " + zahlC + " ist " + min);
        // Prints Das minimum von 5, 543 und 54 ist 5
    }
}
