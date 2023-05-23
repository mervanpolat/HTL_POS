package Lab01Teil2;

public class Aufgabe7 {
    public static void main(String[] args) {
        /*
        Aufgabe 7: Fehlerkorrektur

        Ersetzen Sie im String HTL Wyen Wäst alle y durch i und alle ä durch e.
        Geben Sie das Ergebnis auf der Konsole aus.
        */

        String nameZwei = "HTL Wyen Wäst";

        String str1 = nameZwei.replace('y', 'i');
        String str2 = str1.replace('ä', 'e');

        System.out.println(str2);   //Prints HTL Wien West
    }
}
