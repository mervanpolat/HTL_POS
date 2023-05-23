package SolveAnyStarPattern;

// Define a class called IncreasingTriangle
public class IncreasingTriangle {
    public static void main(String[] args) {

        // Use a for loop to iterate through each row of the triangle
        for (int i = 0; i < 5; i++) {

            // Use a nested for loop to print asterisks on each line
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing the asterisks on each line
            System.out.println();
        }
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
    }
}
