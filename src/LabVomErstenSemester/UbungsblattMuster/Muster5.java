package LabVomErstenSemester.UbungsblattMuster;

public class Muster5 {
    public static void main(String[] args) {
        // set the number of rows
        int rows = 6;

        // print the asterisks with leading spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        //*
        //  *
        //    *
        //      *
        //        *
        //          *
    }
}
