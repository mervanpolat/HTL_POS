package SolveAnyStarPattern;

// Define a class called RightSidedTriangle
public class RightSidedTriangle {
    public static void main(String[] args) {

        // Declare and initialize an integer variable called n to determine the size of the triangle
        int n = 4;

        // Use a for loop to iterate through each row of the triangle
        for (int i = 0; i <= n; i++) {

            // Use a nested for loop to print spaces before the asterisks on each line
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            // Use another nested for loop to print asterisks on each line
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after printing the asterisks on each line
            System.out.println();
        }
        //     *
        //    **
        //   ***
        //  ****
        // *****
        //with space added "* "
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
    }
}
