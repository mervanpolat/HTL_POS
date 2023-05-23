package Lab05Teil1;
import java.util.ArrayList;

public class Aufgabe1 {
    public static void main(String[] args) {
        /*
        Aufgabe 1: Summe aller Listenelemente
        Erstelle eine Liste von Integer Zahlen mit mindestens 5 Elementen. Verwenden Sie anschließend eine Schleife,
        um die Summe aller Listenelemente zu berechnen. Geben Sie diese auf der Konsole aus.

        Können Sie die Aufgabe sowohl mit einer for als auch einer while Schleife lösen?

        Original list: [1, 2, 3, 4, 5]
        Sum (for): 15
        Sum (while): 15
        Sum (foreach): 15
        */

        // Erstelle eine ArrayList namens "list" und füge 5 Integer-Zahlen hinzu
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Rufe die drei Lösungsmethoden auf, um die Summe der Listenelemente auf verschiedene Arten zu berechnen
        losungWhile(list);
        losungFor(list);
        losungForEach(list);
    }

    // Methode, die die Summe der Listenelemente mithilfe einer for-each-Schleife berechnet und ausgibt
    static void losungForEach(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {  // Iteriere über jedes Element der Liste
            sum += num;         // Addiere jedes Element zur Summe hinzu
        }
        System.out.println("Sum (for-each): " + sum); // Gib die Summe auf der Konsole aus
    }

    // Methode, die die Summe der Listenelemente mithilfe einer while-Schleife berechnet und ausgibt
    static void losungWhile(ArrayList<Integer> list) {
        int sum = 0;
        int i = 0;
        while (i < list.size()) {   // Solange der Index kleiner als die Anzahl der Elemente in der Liste ist
            sum += list.get(i);     // Addiere das Element an der aktuellen Position zur Summe hinzu
            i++;                    // Inkrementiere den Index
        }
        System.out.println("Sum (while): " + sum); // Gib die Summe auf der Konsole aus
    }

    // Methode, die die Summe der Listenelemente mithilfe einer for-Schleife berechnet und ausgibt
    static void losungFor(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {  // Iteriere über jeden Index der Liste
            sum += list.get(i);                 // Addiere das Element an der aktuellen Position zur Summe hinzu
        }
        System.out.println("Sum (for): " + sum); // Gib die Summe auf der Konsole aus
    }
}
