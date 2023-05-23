package Lab01Teil2;

public class Aufgabe9 {
    public static void main(String[] args) {
        /*
        Aufgabe 9: Anfang und Ende
        Gegeben ist ein beliebiger String (z.B. HTL Wien West). Legen Sie zwei boolesche Variablen an, die angeben ob der
        gegebene String mit HTL beginnt bzw. mit einem Satzzeichen (d.h. Punkt, Rufzeichen, Fragezeichen) endet. Geben
        Sie die Werte für die beiden Variablen auf der Konsole aus und testen Sie ihr Programm mit unterschiedlichen Werten.

        Zusatz: was passiert, wenn Ihr String mit einem (oder mehreren) Leerzeichen endet? Was können Sie tun, um
        Leerzeichen am Anfang und/oder Ende zu ignorieren?
        */

        String word = "      HTL Wien West  ";
        boolean startsWith = word.startsWith("HTL");
        boolean endsWith = word.endsWith(".") || word.endsWith("!") || word.endsWith("?");

        System.out.println(startsWith); //Prints false
        System.out.println(endsWith);   //Prints false

        //Zusatz

        String zusatz = word.stripLeading();
        String zusatz2 = zusatz.stripTrailing();
        System.out.println(zusatz2);    //Prints HTL Wien West
    }
}
