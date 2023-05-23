package Lab01Teil2;

public class Aufgabe10 {
    public static void main(String[] args) {
        /*
        Aufgabe 10: Aus zwei mach eins
        Gegeben sind die Strings Donaubrücke und Dampfschiff. Ausgegeben werden soll Donauschiff.
        */

        String donaubruecke = "Donaubrücke";
        String dampfschiff = "Dampfschiff";

        String ersetzen = donaubruecke.replace("brücke", "schiff");
        System.out.println(ersetzen);   //Prints Donauschiff
    }
}
