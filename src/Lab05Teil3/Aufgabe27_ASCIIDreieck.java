package Lab05Teil3;
public class Aufgabe27_ASCIIDreieck {
    public static void main(String[] args) {
        //Schreiben Sie ein Programm, das dieses Konstrukt ausgibt:
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        //Versuchen sie es mit zwei mal zwei ineinander verschachtelten for Schleifen zu lösen.

        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int row = 0; row < 5; row++) {
            for (int col = 5; col > row; col--) {
                if (col!=5) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
