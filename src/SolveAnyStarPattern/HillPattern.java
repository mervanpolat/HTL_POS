package SolveAnyStarPattern;

// Define a class called HillPattern
public class HillPattern {
    public static void main(String[] args) {

        // Declare and initialize an integer variable called n to determine the size of the hill
        int n = 5;

        // Use a for loop to iterate through each row of the hill
        for (int i = 1; i <= n; i++) {

            // Use a nested for loop to print spaces before the asterisks on each line
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // Use another nested for loop to print the left side of the hill
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

            // Use yet another nested for loop to print the right side of the hill
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing the left and right sides of the hill on each line
            System.out.println();
        }
        //     *
        //    ***
        //   *****
        //  *******
        // *********
    }
}
