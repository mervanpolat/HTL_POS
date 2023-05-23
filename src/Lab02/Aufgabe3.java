package Lab02;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {

        // Aufgabe3: Satz des Pythagoras
        // Berechnen Sie die Hypotenuse c in einem rechtwinkeligen Dreieck gemäß der Formel aus der Mathematik c2 = a2+b2,
        // wobei die Seitenlängen a und b jeweils vom Benutzer eingegeben werden sollen. Geben Sie das Ergebnis für c aus.
        // Beispiel: a = 3, b = 4 => c2 = 32 + 42 = 9 + 16 = 25 => c = 5
        // Verwenden Sie die Funktion Math.sqrt(), um die Quadratwurzel zu berechnen. Sie können auch (aber müssen
        // nicht) Math.pow() für die Berechnung des Quadrates einer Zahl verwenden.

        Scanner input = new Scanner(System.in);

        double a,b,c;

        System.out.print("Bitte eine Zahl für a eingeben: ");
        a = input.nextDouble();
        System.out.print("Bitte eine Zahl für b eingeben: ");
        b = input.nextDouble();

        c = (a*a) + (b*b);
        c = Math.sqrt(c);

        System.out.println();
        System.out.println(a + "²" + " + " + b + "²" + " = " + a*a + " + " + b*b + " = "  + (a*a+b*b) + " = " + c);
        // Prints 5.0² + 7.0² = 25.0 + 49.0 = 74.0 = 8.602325267042627
    }
}
