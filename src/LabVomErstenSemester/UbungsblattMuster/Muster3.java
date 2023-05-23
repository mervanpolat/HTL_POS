package LabVomErstenSemester.UbungsblattMuster;

public class Muster3 {
    public static void main(String[] args) {
        // set the number of rows
        int rows = 6;

        // print the first row of asterisks
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }

        // print the remaining rows of single asterisks
        for (int i = 1; i <= rows; i++) {
            System.out.println("*");
        }

        //* * * * * *
        //*
        //*
        //*
        //*
        //*
    }
}
