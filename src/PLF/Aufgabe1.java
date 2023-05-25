package PLF;

public class Aufgabe1 {
    public static void main(String[] args) {
        wasserbedarf(1,1,1);
        wasserbedarf(3,5,2);
    }

    static void wasserbedarf(double laenge, double breite, double anzahlGies) {

        double flaeche = laenge * breite;

        double berechnung = flaeche * (anzahlGies * 2);
        System.out.println("Wasserbedarf: " + berechnung);
    }
}
