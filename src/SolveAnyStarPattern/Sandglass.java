package SolveAnyStarPattern;

public class Sandglass {
    public static void main(String[] args) {
        int n = 5;

        // Upper half of the sandglass
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the sandglass
        for (int i = 2; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*********
        // *******
        //  *****
        //   ***
        //    *
        //   ***
        //  *****
        // *******
        //*********
    }
}

