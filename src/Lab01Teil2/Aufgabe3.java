package Lab01Teil2;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Aufgabe 3: Boolesche Bedingungen formulieren
        // Legen Sie Variablen für die folgenden Werte für den Kauf eines Computers an:
        // • Ist der Computer gebraucht (Boolean)
        // • Hauptspeicher (in GB, Byte)
        // • Preis (Integer oder Float)
        // • Handelt es sich um ein Black Friday Angebot (Boolean)
        // Formulieren Sie nun die zusammengesetzte Bedingung, die folgendes ausdrückt: ich kaufe den Computer, wenn er
        // nicht gebraucht ist, ausreichend Hauptspeicher (d.h. mindestens 8 GB) hat und nicht mehr als 1000 EUR kostet
        // oder wenn es sich um ein Black Friday Angebot handelt und der Computer nicht mehr als 1250 EUR kostet. Auch in
        // diesem Fall darf der Computer nicht gebraucht sein.

        boolean nichtGebraucht = true;
        byte hauptspeicher = 8;
        int preis = 1000;
        boolean blackFriday = false;

        boolean kaufen = (nichtGebraucht && hauptspeicher >= 8 && preis <= 1000 || blackFriday && preis <= 1250 && nichtGebraucht);
        System.out.println(kaufen); //Prints true
        System.out.println();
    }
}
