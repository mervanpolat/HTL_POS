package LabVomErstenSemester.UbungsblattMuster;

public class Muster7 {
    public static void main(String[] args) {
        // set the number of rows and columns
        int rows = 6;
        int cols = 6;

        // print the asterisks with leading spaces
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //* * * * * *
        //*         *
        //*         *
        //*         *
        //*         *
        //* * * * * *
    }
}
