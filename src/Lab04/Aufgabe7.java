package Lab04;

import java.util.ArrayList;

public class Aufgabe7 {
    public static void main(String[] args) {
        /*
        Aufgabe 7: Noch mehr Listenoperationen
        Erstellen Sie eine Liste mit den Namen „Anna“, „Markus“, „Sabine“, „Heinrich“ und „Doris“. Finden Sie heraus, das
        wievielte Element „Sabine“ ist und geben Sie das Ergebnis auf der Konsole aus. Überprüfen Sie weiters, ob der Name
        „Gustav“ in der Liste vorkommt, und geben Sie auch dieses Ergebnis auf der Konsole aus.
        */

        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(0,"Anna");
        arrayList.add(1,"Markus");
        arrayList.add(2,"Sabine");
        arrayList.add(3,"Heinrich");
        arrayList.add(4,"Doris");

        System.out.println(arrayList.indexOf("Sabine"));
        System.out.println(arrayList.contains("Gustav"));
    }
}
