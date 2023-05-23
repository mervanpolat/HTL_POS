// Declare a class called "Muster10" in a package called "LabVomErstenSemester.UbungsblattMuster"
package LabVomErstenSemester.UbungsblattMuster;

// Define the class "Muster10"
public class Muster10 {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Use a nested for loop to print 3 rows of 3 asterisks each
        for(int i=1; i<=3; i++) { // Loop over rows
            for(int j=1; j<=3; j++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Use a nested for loop to print 3 rows of 5 asterisks each
        for(int i=1; i<=3; i++) { // Loop over rows
            for(int j=1; j<=5; j++) { // Loop over columns
                System.out.print("* "); // Print an asterisk followed by a space
            }
            System.out.println(); // Move to the next line
        }

        // Output:
        // * * *
        // * * *
        // * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }
}
