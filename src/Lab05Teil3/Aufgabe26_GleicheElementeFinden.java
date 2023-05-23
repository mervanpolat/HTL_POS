package Lab05Teil3;
import java.util.ArrayList;

public class Aufgabe26_GleicheElementeFinden {
    public static void main(String[] args) {
        //Aufgabe 26: Gleiche Elemente finden
        //Schreiben Sie ein Programm, das alle Elemente, die zwei Listen – egal an welcher Stelle – gemeinsam haben,
        //ausgibt.
        //• Lösen Sie das Problem zunächst mit verschachtelten Schleifen.
        //• Erweitern Sie Ihre Lösung dann, sodass jedes gemeinsame Element nur einmal ausgegeben wird.
        //• Profi-Aufgabe: Können Sie das Problem, dass jedes Element nur einmal ausgegeben werden soll,
        //auch ohne Schleifen lösen? (Hinweis: verwenden Sie HashSets!)

        // Create two ArrayLists called list and list2
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Add some integers to list
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);

        // Add some integers to list2
        list2.add(1);
        list2.add(2);
        list2.add(1);
        list2.add(7);

        // Create an empty ArrayList called collectDistinctNum to store the common elements
        ArrayList<Integer> collectDistinctNum = new ArrayList<>();

        // Loop through each element in list
        for (int num:list) {
            // Loop through each element in list2
            for (int i = 0; i < list2.size(); i++) {
                // If the current element in list2 is equal to the current element in list
                // and the element is not already in collectDistinctNum
                if ((list2.contains(num) && !collectDistinctNum.contains(num))) {
                    // Add the element to collectDistinctNum
                    collectDistinctNum.add(num);
                }
            }
        }
        // Print the common elements
        System.out.println(collectDistinctNum);
        //[1, 2]
    }
}
