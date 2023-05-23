package LabVomErstenSemester.UbungsblattMuster;

public class Muster1933 {
    public static void main(String[] args) {
        // Define the size of the pattern
        int n = 7;
        // Calculate the middle row and column
        int mid = n/2+1;
        int i,j;
        System.out.println("");

        // Loop through each row
        for (i = 1; i <= n; i++) {
            // Loop through each column
            for (j = 1; j <=n ; j++) {
                // If the current row or column is the middle one, or if the current
                // row or column is on the border of the pattern, print a "*"
                if (i==mid || j==mid || (i==1 && j>=mid) || (j==1 && i<=mid) || (i==n && j<=mid) || (j==n && i>=mid)) {
                    System.out.print("* ");
                } else {
                    // Otherwise, print a space
                    System.out.print("  ");
                }
            }
            // Move to the next line
            System.out.println();
        }

        // Output:
        //  *     * * * *
        //  *     *
        //  *     *
        //  * * * * * * *
        //        *     *
        //        *     *
        //  * * * *     *
    }
}
