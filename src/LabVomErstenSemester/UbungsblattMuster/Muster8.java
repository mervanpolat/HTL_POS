// Declare a class called "Muster8" in a package called "LabVomErstenSemester.UbungsblattMuster"
package LabVomErstenSemester.UbungsblattMuster;

// Define the class "Muster8"
public class Muster8 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Use a nested for loop to print 5 rows of decreasing numbers of asterisks
        for (int i = 5; i >= 1; i--) { // Loop over rows
            for (int j = 1; j <= i; j++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Output:
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
    }
}
