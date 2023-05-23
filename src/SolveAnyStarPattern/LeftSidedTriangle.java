package SolveAnyStarPattern;

// Define a class called LeftSidedTriangle
public class LeftSidedTriangle {
    public static void main(String[] args) {
        // Set the number of rows for the triangle
        int n = 5;

        // Use a for loop to iterate through each row of the triangle
        for (int i = 0; i <= n; i++) {

            // Use another for loop to add spaces before each row of asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Use a third for loop to print the asterisks for each row
            // The number of asterisks per row will increase by one as i increases
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();

            //******
            // *****
            //  ****
            //   ***
            //    **
            //     *
            //with "* "
            //* * * * * *
            // * * * * *
            //  * * * *
            //   * * *
            //    * *
            //     *
        }
    }
}
