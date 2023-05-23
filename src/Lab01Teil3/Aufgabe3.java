package Lab01Teil3;

public class Aufgabe3 {
    public static void main(String[] args) {
        /*
        Aufgabe 3: Gleich ist nicht immer gleich

        Legen Sie zwei Variablen mit denselben Werten von einem Begleiter-Datentyp
        (Integer, Double, BigDecimal,...) an. Überzeugen Sie sich von der Aussage, dass die Werte von
        Begleiter-Objekten zwar ident sein können, die Begleiter-Objekte selbst aber unterschiedlich sind.
        Geben Sie das Ergebnis Ihrer Überprüfung auf der Konsole aus.

        Werte sind gleich: true
        Begleiter-Objekte sind gleich: false

        Zusatz: was passiert, wenn Sie ein Begleiter-Objekt mit sich selbst vergleichen?
        Zusatz: was passiert, wenn Sie zwei primitive Werte (also int, float, ...) miteinander vergleichen?
        Was liefern in diesem Fall die Operatoren == und equals?
        */

        Double n1 = 19.19;
        Double n2 = 19.19;

        System.out.println(n1.equals(n2));  // Prints true
        System.out.println(n1 == n2);       // Prints false

        Integer z1 = 19;
        Integer z2 = 19;

        System.out.println(z1.equals(z1));  // Prints true
        System.out.println(z1 == z2);       // Prints true
    }
}
