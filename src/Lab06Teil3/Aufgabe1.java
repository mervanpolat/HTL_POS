package Lab06Teil3;

import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        //Schreiben Sie eine Funktion translate_b, die einen String als Parameter nimmt und diesen String in B-Sprache
        //retourniert. Die B-Sprache ersetzt jeden Vokal (a,e,i,o,u) durch den Vokal gefolgt von einem b und nochmals dem
        //Vokal.
        //Lesen Sie solange vom Benutzer Wörter ein und geben Sie diese kodiert aus, bis der Benutzer "quit" eingibt.
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String name = input.nextLine();
        b_Sprache(name);
    }

    static void b_Sprache(String name) {

        if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
            name = name.replace("a", "aba");
            name = name.replace("e", "ebe");
            name = name.replace("i", "ibi");
            name = name.replace("o", "obo");
            name = name.replace("u", "ubu");
        }
        System.out.println(name);
    }
}
