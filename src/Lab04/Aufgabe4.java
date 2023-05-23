package Lab04;

import java.util.ArrayList;

public class Aufgabe4 {
    public static void main(String[] args) {
        /*
        Aufgabe 4: Einfügen statt anhängen
        Erstellen Sie eine Liste von Strings mit den Werten „Rot“, „Blau“ und „Grün“. Fügen sie nun nach „Rot“ den Wert
        „Gelb“ ein und vor „Grün“ den Wert „Rosa“. Geben Sie danach die Länge der Liste aus, leeren diese und geben die
        Länge (jetzt hoffentlich 0) nochmals aus.
        */

        ArrayList arrayList = new ArrayList<String>();

        arrayList.add("Rot");
        arrayList.add("Blau");
        arrayList.add("Grün");

        arrayList.set(0,"Geld");
        arrayList.set(2,"Rosa");
        System.out.println(arrayList.size());
        //Prints 3
        arrayList.remove(0);
        arrayList.remove(1);
        arrayList.remove(0);

        System.out.println(arrayList.size());
        //Prints 0
    }
}
