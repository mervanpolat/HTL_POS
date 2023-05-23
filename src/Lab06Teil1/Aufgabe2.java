package Lab06Teil1;

public class Aufgabe2 {
    public static void main(String[] args) {
        //Aufgabe 2: Umrechnung von Zoll in Zentimeter
        //Es gibt relativ viele Größenangaben, die auch bei uns in Zoll angegeben werden. Denken Sie nur an die Größe des
        //Bildschirms bei Handy/Laptop/PC, an die Größe von Fahrrad- oder Autoreifen, etc. Schreiben Sie daher eine
        //Funktion umrechnen, die eine Gleitkommazahl als Parameter bekommt, diese in Zentimeter umrechnet und den
        //Zentimeterwert als Ergebnis zurückliefert. Finden Sie den Umrechnungsfaktor von Zoll in Zentimeter im Internet.
        //Beispielausgabe für 14.1 Zoll:
        //14,10 Zoll entsprechen 35,81 cm.
        //Testen Sie die Funktion, indem Sie sie mit verschiedenen Testdaten aufrufen.

        // Calls the umrechnen function with a value of 12.9 (in inches) as an argument
        // The result is printed to the console, which is the conversion of 12.9 inches to centimeters
        System.out.println(umrechnen(12.9));    // Prints 32.766
    }

    // Defines a static method called "umrechnen" that takes a double as a parameter (inch)
    // This function converts inches to centimeters
    static double umrechnen(double inch) {
        // The conversion factor for inches to centimeters is 2.54
        // Multiplies the input value (inch) by 2.54 to convert it to centimeters
        // Returns the result of the conversion
        return inch * 2.54;
    }
}
