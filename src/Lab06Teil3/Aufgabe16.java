// This is the package declaration
package Lab06Teil3;

// This is the class declaration
public class Aufgabe16 {

    //Explanation:
    // • The function perfect_number(int num) takes an integer as an argument and checks if it is a perfect number.
    // • A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
    // • The function iterates from 1 to num / 2 (inclusive) and checks if the current number is a divisor of num (i.e., num % i == 0 is true).
    // • If it is a divisor, it adds the number to the running total sum.
    // • After the loop, it checks if sum is equal to num. If it is, num is a perfect number and the function returns true; otherwise, it returns false.

    // This is the main method, the entry point to the program
    public static void main(String[] args) {
        // We are calling the perfect_number function with different arguments
        // and printing the results
        System.out.println(perfect_number(6));  // Should return true
        System.out.println(perfect_number(28));  // Should return true
        System.out.println(perfect_number(496));  // Should return true
        System.out.println(perfect_number(8128));  // Should return true
        System.out.println(perfect_number(10));  // Should return false
    }

    // This is a method that checks whether a number is perfect or not
    public static boolean perfect_number(int num) {
        // We start with a sum of 0
        int sum = 0;
        // We go from 1 to num / 2 inclusive. This is because a number cannot
        // be evenly divided by a number greater than its half
        for (int i = 1; i <= num / 2; i++) {
            // If the remainder of num divided by i is 0, i is a divisor of num
            if (num % i == 0) {
                // We add the divisor to the sum
                sum += i;
            }
        }
        // If the sum of the divisors is equal to the original number, it's a perfect number
        // We return true in this case, false otherwise
        return sum == num;
    }
}



