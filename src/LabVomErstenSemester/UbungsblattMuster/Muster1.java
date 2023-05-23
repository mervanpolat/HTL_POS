// Declare a class called "Muster1" in a package called "LabVomErstenSemester.ÜbungsblattMuster"
package LabVomErstenSemester.UbungsblattMuster;

// Define the class "Muster1"
public class Muster1 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Use a nested for loop to print 5 rows and 5 columns of asterisks
        for (int i = 0; i < 5; i++) { // Loop over rows
            for (int j = 0; j < 5; j++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Output:
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }
}
