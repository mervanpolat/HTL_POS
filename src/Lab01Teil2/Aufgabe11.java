package Lab01Teil2;

public class Aufgabe11 {
    public static void main(String[] args) {
        /*
        Aufgabe 11: Begrüßung 2.0
        Gegeben ist eine String Variable mit einem beliebigen Namen, z.B. Albert Einstein. Erstellen Sie ein Programm,
        das nun eine personalisierte Begrüßung erzeugt, die wie folgt aussieht. Insbesondere ist die Anzahl der benötigten
        Sternchen natürlich nicht fix, sondern hängt vom Wert der String Variablen ab. Wenn Sie den Wert ändern, z.B. auf
        Linus Torvalds, muss Ihr Programm noch immer richtig funktionieren. Die Ausgabe soll wie folgt aussehen:

        *******************************************
        ** Herzlich willkommen, Albert Einstein! **
        *******************************************

        */

        String greeting = "** Herzlich Willkommen, ";
        String person = "Mervan Polat! **";
        System.out.print("*".repeat(greeting.length()));
        System.out.print("*".repeat(person.length()));
        System.out.println();
        System.out.println(greeting+person);
        System.out.print("*".repeat(greeting.length()));
        System.out.print("*".repeat(person.length()));

        // Prints
        // ****************************************
        // ** Herzlich Willkommen, Mervan Polat! **
        // ****************************************

    }
}
