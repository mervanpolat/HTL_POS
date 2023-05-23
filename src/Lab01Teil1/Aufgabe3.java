package Lab01Teil1;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Aufgabe3: Schulstunden
        // Eine Schulstunde dauert 45 Minuten. Berechnen Sie dann wie lange 3 Schulstunden dauern.
        // Legen Sie sowohl für die Dauer als auch die Anzahl von Schulstunden eigene Variablen an, um später die Werte leicht ändern zu können.
        // Berechnen Sie anschließend folgende Werte:
        // • Die Gesamtdauer in Stunden (als Gleitkommazahl).
        // • Die Anzahl der ganzen Stunden (à 60 Minuten)
        // • Die Anzahl der noch übrigen Minuten (zwischen 0 und 59)
        // Die Ausgabe soll wie folgt aussehen:
        // 3 Schulstunden dauern 135 Minuten oder 2,250000 Stunden. Das sind 2 Stunden und 15 Minuten.

        // Formel -> s = v*t -> t = s/v
        float zeit = 135;
        float stunden = zeit / 60;
        float minuten = zeit % 60; //15 remainder

        System.out.println("3 Schulstunden dauern " + zeit + " Minuten oder " + stunden + " Stunden.");
        // Prints 3 Schulstunden dauern 135.0 Minuten oder 2.25 Stunden.
        System.out.println("Das sind " + (int)stunden + " Stunden und " + (int)minuten + " Minuten.");
        // Prints Das sind 2 Stunden und 15 Minuten.
    }
}
