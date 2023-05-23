package LabVomErstenSemester.UbungsblattMuster;

public class Muster6 {
    public static void main(String[] args) {
        int rows = 5;
        // print the asterisks with leading spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //     *
        //    *
        //   *
        //  *
        // *
    }
}
