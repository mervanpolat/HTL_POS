package Lab01Teil2;

public class Aufgabe8 {
    public static void main(String[] args) {
         /*
        Aufgabe 8: Leer oder nicht
        Überlegen Sie sich zwei Arten wie Sie überprüfen können, ob der Wert einer String Variablen ein Leerstring ist. Legen
        Sie für jede der beiden Arten eine boolesche Variable an und geben Sie die Ergebnisse auf der Konsole aus. Testen
        Sie Ihr Programm mit den Strings "HTL Wien West", "", " ", " " und null.
        */

        String s1 = "HTL Wien West";
        String s2 = "";
        String s3 = " ";
        String s4 = null;

        boolean isEmpty = s1.isEmpty();
        System.out.println(isEmpty);    //Prints false
        isEmpty = s2.isEmpty();
        System.out.println(isEmpty);    //Prints true
        isEmpty = s3.isEmpty();
        System.out.println(isEmpty);    //Prints false
        //isEmpty = s4.isEmpty(); //Since s4 is null, NullPointerException will arise every time I use it until I initialize it.
        //System.out.println(isEmpty);

    }
}
