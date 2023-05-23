package Lab01Teil2;

public class Aufgabe6 {
    public static void main(String[] args) {
        /*
        Aufgabe 6: Wo im String ...
        Gegeben ist eine String Variable mit dem Wert HTL Wien West. Finden Sie nun die Position des ersten Vorkommens
        für folgende Buchstaben: W, e, H, T, t, f, h. Geben Sie das Ergebnis auf der Konsole wie folgt aus:
        Der Buchstabe ... kommt im String an Position ... vor.
        Stellen Sie (für sich) sicher, dass Sie die Ergebnisse bzw. die Ausgabe für alle Buchstaben verstehen.
        */

        String name = "HTL Wien West";

        String findeW = "W";
        System.out.println("Der Buchstabe " + findeW + " kommt im String an Position " + name.indexOf(findeW));
        //Prints Der Buchstabe W kommt im String an Position 4
        String findee = "e";
        System.out.println("Der Buchstabe " + findee + " kommt im String an Position " + name.indexOf(findee));
        //Prints Der Buchstabe e kommt im String an Position 6
        String findeH = "H";
        System.out.println("Der Buchstabe " + findeH + " kommt im String an Position " + name.indexOf(findeH));
        //Prints Der Buchstabe H kommt im String an Position 0
        String findeT = "T";
        System.out.println("Der Buchstabe " + findeT + " kommt im String an Position " + name.indexOf(findeT));
        //Prints Der Buchstabe T kommt im String an Position 1
        String findet = "t";
        System.out.println("Der Buchstabe " + findet + " kommt im String an Position " + name.indexOf(findet));
        //Prints Der Buchstabe t kommt im String an Position 12
        String findef = "f";
        System.out.println("Der Buchstabe " + findef + " kommt im String an Position " + name.indexOf(findef));
        //Prints Der Buchstabe f kommt im String an Position -1
        String findeh = "h";
        System.out.println("Der Buchstabe " + findeh + " kommt im String an Position " + name.indexOf(findeh));
        //Prints Der Buchstabe h kommt im String an Position -1
    }
}
