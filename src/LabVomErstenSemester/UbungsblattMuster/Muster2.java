// Declare a class called "Muster2" in a package called "LabVomErstenSemester.UbungsblattMuster"
package LabVomErstenSemester.UbungsblattMuster;

// Define the class "Muster2"
public class Muster2 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Use a nested for loop to print 5 rows of decreasing numbers of asterisks
        for (int i = 0; i < 5; i++) { // Loop over rows
            for (int j = 5; j > i; j--) { // Loop over columns
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

