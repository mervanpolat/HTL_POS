package Lab01Teil2;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Aufgabe 2: Boolesche Bedingungen auswerten
        // Gegeben sind die booleschen Variablen a, b und c mit den unten gezeigten Wahrheitswerten. Werten Sie die
        // booleschen Ausdrücke in der Tabelle im Kopf aus und notieren Sie Ihr Ergebnis. Überprüfen Sie Ihr Ergebnis
        // anschließend in IntelliJ.
        // • a = true
        // • b = false
        // • c = true

        boolean a,b,c;
        a = true;
        b = false;
        c = true;

        System.out.println();

        boolean eins = a && b && c;
        System.out.println(eins);   //Prints false
        boolean zwei = (a && b) || c;
        System.out.println(zwei);   //Prints true
        boolean drei = (a && b) || (a && c);
        System.out.println(drei);   //Prints true
        boolean vier = a && !b && !c;
        System.out.println(vier);   //Prints false
        boolean fuenf = a && (b || c);
        System.out.println(fuenf);  //Prints true
        boolean sechs = (!a && !b) || (!b && c);
        System.out.println(sechs);  //Prints true
        boolean sieben = (!a || !b) && (!b || !c);
        System.out.println(sieben); //Prints true
    }
}
