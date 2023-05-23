package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        //Aufgabe 6: Pensionsalter berechnen

        System.out.print("Bitte geben Sie Ihren Alter ein: ");
        Scanner input = new Scanner(System.in);
        int alter = input.nextInt();

        //Geschlecht: wahr = weiblich, falsch = männlich

        System.out.print("Geschlecht als boolean Wert eingeben (true = weiblich, false = männlich): ");
        Scanner geschlecht = new Scanner(System.in);
        String g = geschlecht.nextLine();
        String w = "true";
        String m = "false";

        //Berechnung

        if (alter < 0) {
            System.out.println("Ungültig!");
        } else if (alter < 20) {
            System.out.println("Das dauert noch ewig!");
        }

        //weiblich

        if (g.equals(w) && alter < 60) {
            System.out.println("Noch " + (60 - alter) + " Jahre bis zur Pension!");
        } else if (g.equals(w) && alter > 60) {
            System.out.println("Du könntest schon in Pension sein!");
        }

        //männlich

        if (g.equals(m) && alter < 65) {
            System.out.println("Noch " + (65 - alter) + " Jahre bis zur Pension!");
        } else if (g.equals(m) && alter > 65) {
            System.out.println("Du könntest schon in Pension sein!");
        }

        input.close();
        geschlecht.close();
    }
}
