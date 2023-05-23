package Lab01Teil2;

public class Aufgabe5 {
    public static void main(String[] args) {
        /*
        Aufgabe 5: Wo in Österreich ...
        Gegeben sind drei String Variablen mit den Werten Upper, Lower und Austria. Verwenden Sie String Funktionen,
        um Variablen mit den folgenden Werten zu erstellen: UPPER AUSTRIA und lower austria. Geben Sie die Werte
        der Variablen auf der Konsole aus.
        */

        String text1, text2, text3;

        text1 = "Upper";
        text2 = "Lower";
        text3 = "Austria";

        System.out.println(text1.toUpperCase() + " " + text3.toUpperCase());    //Prints UPPER AUSTRIA
        System.out.println(text2.toLowerCase() + " " + text3.toLowerCase());    //Prints lower austria
    }
}
