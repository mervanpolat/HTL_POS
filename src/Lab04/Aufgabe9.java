package Lab04;

public class Aufgabe9 {
    public static void main(String[] args) {
        /*
        Aufgabe 9: Schachbrett
        Erstellen Sie ein 8x8 (2-dimensionales) Array von Strings, das ein Schachbrett darstellt.
        Die Positionen der Schachfiguren sind durch Buchstaben gekennzeichnet, wobei die folgende Zuordnung gilt:
        B Bauer
        T Turm
        S Springer/Pferd
        L Läufer
        K König
        D Dame
        Konfigurieren Sie Ihr Array nun so, dass es der anfänglichen Aufstellung eines Schachbrettes entspricht.
        Siehe gegebenenfalls https://de.wikipedia.org/wiki/Schachfigur.
        Stellen Sie dann fest, ob in der ersten Reihe an Position drei auch wirklich ein Läufer steht.
        Stellen Sie ebenfalls sicher, dass sich an in der vierten Reihe an Position sieben keine Spielfigur befindet.
        */

        // Erstellen des 2-dimensionalen Arrays und Zuordnung der Figuren gemäß der Schachregeln
        String[][] schachbrett = {
                {"T", "S", "L", "D", "K", "L", "S", "T"},
                {"B", "B", "B", "B", "B", "B", "B", "B"},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"", "", "", "", "", "", "", ""},
                {"B", "B", "B", "B", "B", "B", "B", "B"},
                {"T", "S", "L", "D", "K", "L", "S", "T"}
        };

        // Überprüfung, ob sich an Position [0][2] ein Läufer befindet
        if (schachbrett[0][2].equals("L")) {
            System.out.println("An Position [0][2] steht ein Läufer.");
        } else {
            System.out.println("An Position [0][2] steht keine Spielfigur oder keine Läuferfigur.");
        }

        // Überprüfung, ob sich an Position [3][6] keine Spielfigur befindet
        if (schachbrett[3][6].equals("")) {
            System.out.println("An Position [3][6] befindet sich keine Spielfigur.");
        } else {
            System.out.println("An Position [3][6] befindet sich eine Spielfigur.");
        }
    }
}
