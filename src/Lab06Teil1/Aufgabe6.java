package Lab06Teil1;

import java.util.ArrayList;

public class Aufgabe6 {
    public static void main(String[] args) {
        // Aufgabe 6: Gesamtpreis berechnen
        // Erstellen Sie eine Funktion calc_price, die eine Liste von Gleitkommazahlen und eine Liste von Integer-Werten
        // als Parameter bekommt und den Gesamtpreis berechnet. Die Liste von Gleitkommazahlen repräsentieren die Einzelpreise
        // für die gekauften Artikel und die Liste von Integer-Werten beinhaltet die Anzahl des jeweils gekauften Produkts.
        // (Die Listen müssen also gleiche Länge haben.)
        // Beispiel:
        // Preise: 1,1 – 2,2 – 3,3 Anzahlen: 3–2–1
        //      Die Gesamtsumme beträgt 11,00 €.
        // Testen Sie die Funktion, indem Sie sie mit verschiedenen Testdaten aufrufen.
        // Funktioniert die Funktion auch mit leeren Listen?

        // Creates ArrayLists for storing the individual prices (einzelPreise) and the number of purchased items (gekaufteArtikel)
        ArrayList<Double> einzelPreise = new ArrayList<>();
        ArrayList<Integer> gekaufteArtikel = new ArrayList<>();

        // Adds the individual prices to the einzelPreise ArrayList
        einzelPreise.add(1.1);
        einzelPreise.add(2.2);
        einzelPreise.add(3.3);

        // Adds the number of purchased items to the gekaufteArtikel ArrayList
        gekaufteArtikel.add(3);
        gekaufteArtikel.add(2);
        gekaufteArtikel.add(1);

        // Calls the calcPrice function with the einzelPreise and gekaufteArtikel ArrayLists as arguments
        // The result is printed to the console (€11.0)
        calcPrice(einzelPreise, gekaufteArtikel); // Prints €11.0
    }

    // Defines a static method called "calcPrice" that takes two ArrayLists as parameters (einzelPreise and gekaufteArtikel)
    // This function calculates the total price of purchased items
    static void calcPrice(ArrayList<Double> einzelPreise, ArrayList<Integer> gekaufteArtikel) {
        // Initializes a variable "produkt" to store the total price
        double produkt = 0;

        // Checks if the lengths of the two input ArrayLists are equal
        if (einzelPreise.size() == gekaufteArtikel.size()) {
            // Loops through the ArrayLists, multiplying the corresponding elements and adding the result to the "produkt" variable
            for (int i = 0; i < gekaufteArtikel.size(); i++) {
                produkt = produkt + einzelPreise.get(i) * gekaufteArtikel.get(i);
            }
        }

        // Prints the calculated total price
        System.out.println("€" + produkt);
    }
}
