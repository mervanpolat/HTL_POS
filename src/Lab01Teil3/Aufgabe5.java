package Lab01Teil3;

public class Aufgabe5 {
    public static void main(String[] args) {
        /*Aufgabe 5: Notenwerte verwenden

        Bekanntlich reicht die Notenskala in Österreich von 1 (sehr gut) bis zu 5 (nicht genügend). Erstellen Sie einen
        Aufzählungstyp Schulnoten mit den Werten SehrGut, Gut, Befriedigend, Genuegend, NichtGenuegend.

        Erstellen Sie nun eine Variable von diesem Typ und weisen Sie ihr einen beliebigen Wert zu. Geben Sie sowohl den
        Wert der Variablen als auch ihre ordinale Position auf der Konsole aus.
        Erstellen Sie nun eine weitere Variable vom Typ Schulnoten, indem sie den entsprechenden String parsen. Geben
        Sie auch von dieser Variablen, den Wert und die ordinale Position aus.
        */

        Schulnoten eins = Schulnoten.SehrGut;
        Schulnoten zwei = Schulnoten.Gut;
        Schulnoten drei = Schulnoten.Befriedigend;
        Schulnoten vier = Schulnoten.Genuegend;
        Schulnoten fuenf = Schulnoten.NichtGenuegend;

        System.out.println(zwei);   //Prints Gut
        System.out.println(zwei.ordinal()); //Prints 1
    }

    public enum Schulnoten {
        SehrGut,
        Gut,
        Befriedigend,
        Genuegend,
        NichtGenuegend;
    }
}
