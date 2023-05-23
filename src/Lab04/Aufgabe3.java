package Lab04;

import java.util.ArrayList;
import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        /*Aufgabe 3: Zufallsliste
        Wiederholen Sie nun das Programm aus Aufgabe 1: Zufallszahlen, allerdings mit einer Liste
        von Integer-Werten statt mit einem Array.
        */

        //Declaration
        Random rand = new Random();
        ArrayList arrayList = new ArrayList<>();

        //Assigning values
        arrayList.add(rand.nextInt(20));
        arrayList.add(rand.nextInt(20));
        arrayList.add(rand.nextInt(20));
        arrayList.add(rand.nextInt(20));
        arrayList.add(rand.nextInt(20));

        //Output
        System.out.println(arrayList);
        //Prints [2, 4, 8, 13, 17]

    }
}
