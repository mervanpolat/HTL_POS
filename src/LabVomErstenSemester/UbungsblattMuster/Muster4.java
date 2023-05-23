package LabVomErstenSemester.UbungsblattMuster;

public class Muster4 {
    public static void main(String[] args) {
        // set the number of rows
        int rows = 4;

        // print the first row of asterisks
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // print the remaining rows of asterisks and spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.print("        *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //* * * * *
        //        *
        //        *
        //        *
        //        *
    }
}
