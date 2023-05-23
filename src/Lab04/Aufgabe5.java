package Lab04;
import java.util.ArrayList;

public class Aufgabe5 {
    public static void main(String[] args) {
        /*
        Aufgabe 5: Aus Listen entfernen
        Erstellen Sie eine Liste von Strings mit den Werten „Eins“, „Zwei“, „Drei“ und „Vier“. Löschen Sie nun zuerst das
        zweite Element und anschließend das Element mit dem Wert „Drei“. Geben Sie die Länge der Ergebnisliste auf der
        Konsole aus.
        */

        ArrayList arrayList = new ArrayList<String>();
        arrayList.add(0,"Eins");
        arrayList.add(0,"Zwei");
        arrayList.add(0,"Drei");
        arrayList.add(0,"Vier");

        arrayList.remove(1);
        arrayList.remove(1);

        System.out.println(arrayList.size());
        //Prints 2
        System.out.println(arrayList);
        //Prints [Vier, Eins]
    }
}
