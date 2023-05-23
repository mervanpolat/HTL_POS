package SolveAnyStarPattern;

public class DiamondPattern {
    public static void main(String[] args) {
        //In this example, we first print the upper half of the diamond, and then the lower half of the diamond.
        //The n variable represents the number of rows of the diamond, and it is set to 5 in this example.
        //In the first for loop, we iterate through the rows of the upper half of the diamond. In each iteration of this loop,
        //we first print the necessary number of spaces for the current row, which is equal to n - i, where i is the current row number.
        //After printing the spaces, we print the necessary number of stars for the current row, which is equal to 2 * i - 1.

        //In the second for loop, we iterate through the rows of the lower half of the diamond. In each iteration of this loop,
        //we first print the necessary number of spaces for the current row, which is equal to n - i, where i is the current row number.
        //After printing the spaces, we print the necessary number of stars for the current row, which is equal to 2 * i - 1.
        //Finally, we print the complete diamond pattern by combining the upper and lower halves of the diamond.

        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //    *
        //   ***
        //  *****
        // *******
        //*********
        // *******
        //  *****
        //   ***
        //    *
    }
}
