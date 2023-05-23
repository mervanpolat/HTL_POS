package Lab02;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        // Aufgabe 4: Hühnerfarm
        // In dieser Aufgabe geht es um eine Hühnerfarm, die aus W Hühnerställen mit jeweils X Hennen besteht.
        // Jede Henne legt pro Tag circa Y Eier und diese werden in Kartons zu Z Stück abgepackt. Z.B.
        // eine Hühnerfarm mit drei Hühnerställen, in welchen jeweils 250 Hennen pro Tag circa 0,7 Eier legen.
        // Diese Eier werden in Kartons zu 10 Stück abgepackt.
        // Lassen Sie den Benutzer/die Benutzerin die Werte für W, X, Y und Z mit einer sinnvollen Eingabeaufforderung festlegen.
        // Berechnen Sie anschließend wie viele Eierkartons pro Jahr (!) gefüllt werden. Testen Sie Ihr Programm mit unterschiedlichen Werten,
        // z.B. 300 Hennen pro Stall oder nur 6 Eier pro Karton.

        Scanner input = new Scanner(System.in);

        //Hühnerfarm

        double w, x, y, z;

        System.out.print("Bitte geben Sie eine Zahl für Hühnerstall ein: ");
        w = input.nextDouble();

        System.out.println();

        System.out.print("Anzahl der Hennen: ");
        x = input.nextDouble();

        System.out.println();

        System.out.print("Bitte geben Sie die Zahl für die Eier ein: ");
        y = input.nextDouble();

        System.out.println();

        System.out.print("Bitte geben Sie die Anzahl der Kartons ein: ");
        z = input.nextDouble();
        System.out.println();

        //Berechnung der Hühnerställen und Hennen

        double huehnerStallUndHennen = w * x;

        //Berechnung der Eierstückzahl

        double eierstueckzahl = huehnerStallUndHennen * z;

        //Eierstückzahl in Kartonmenge

        int kartonmenge = (int) (eierstueckzahl / z);

        //In Jahr

        int jahr = kartonmenge * 365;

        System.out.println("Die jährliche Eierstückzahl beträgt: " + jahr);
    }
}
