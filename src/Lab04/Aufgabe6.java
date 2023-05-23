package Lab04;
import java.util.ArrayList;

public class Aufgabe6 {
    public static void main(String[] args) {
        /*
        Aufgabe 6: Aus Listen entfernen – Vorsicht Falle
        Erstellen Sie jetzt eine Liste von Integer-Werten und füllen Sie die Liste mit den Zahlen 1, 2, 3, 4 und 5. Löschen Sie
        nun das dritte Element und anschließend den Wert 2. Geben Sie die Länge der Liste und die Werte an den einzelnen
        Positionen auf der Konsole aus, um zu überprüfen, dass alles korrekt funktioniert hat.
        */

        //Create a new ArrayList object named 'arrayList'
        ArrayList arrayList = new ArrayList<Integer>();

        //Add integer values to the ArrayList object at specific index positions
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);

        //Remove the third element from the ArrayList object
        arrayList.remove(2);

        //Remove the value 2 from the ArrayList object
        arrayList.remove(1);

        //Print the size of the ArrayList object
        System.out.println(arrayList.size());   //Prints 3

        //Print the values in the ArrayList object
        System.out.println(arrayList);          //Prints [1, 4, 5]
    }
}
