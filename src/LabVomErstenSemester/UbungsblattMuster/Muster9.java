// Declare a class called "Muster9" in a package called "LabVomErstenSemester.UbungsblattMuster"
package LabVomErstenSemester.UbungsblattMuster;

// Define the class "Muster9"
public class Muster9 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Use a nested for loop to print 3 rows of 3 asterisks each
        for (int i = 1; i <= 3; i++) { // Loop over rows
            for (int j = 1; j <= 3; j++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Use two nested for loops to print 3 rows of 3 spaces, followed by 3 rows of 3 asterisks each
        for (int i = 1; i <= 3; i++) { // Loop over rows
            for (int j = 1; j <= 3; j++) { // Loop over columns
                System.out.print("  "); // Print two spaces
            }
            for (int k = 1; k <= 3; k++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Output:
        //* * *
        //* * *
        //* * *
        //      * * *
        //      * * *
        //      * * *
    }
}
