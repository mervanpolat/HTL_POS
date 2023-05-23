package Lab06Teil3;  // Defines the package that this Java file is part of
import java.util.Arrays;  // Import the Arrays class from the java.util package

public class Aufgabe15 {  // Declares a public class named Aufgabe15
    public static void main(String[] args) {  // The main method, which is the entry point for any Java program
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  // Declares and initializes an array of integers
        int sum = 8;  // Declares an integer variable sum and assigns the value 8 to it

        // Calls the method pair_with_sum with the array and sum as arguments, stores the result in the variable 'result'
        int[] result = pair_with_sum(arr, sum);
        // Prints the array 'result' as a string, should print [0, 6] if a pair is found that sums to 8
        System.out.println("Die Summe " + sum + " kann in der Liste " + Arrays.toString(arr) + " durch die Elemente an den " +
                "Positionen " + Arrays.toString(result) + " gebildet werden.");
        // Prints Die Summe 8 kann in der Liste [1, 2, 3, 4, 5, 6, 7] durch die Elemente an den Positionen [0, 6] gebildet werden.
    }

    // Declares a public static method named pair_with_sum which takes an array of integers and a single integer as parameters
    public static int[] pair_with_sum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {  // Outer loop, iterates over each element in the array
            for (int j = i + 1; j < arr.length; j++) {  // Inner loop, iterates over each element in the array after the element at index i
                if (arr[i] + arr[j] == sum) {  // If the sum of the numbers at the current pair of indices equals the desired sum
                    return new int[]{i, j};  // Returns a new array containing the indices i and j
                }
            }
        }
        return new int[]{-1, -1};  // If no pair of numbers in the array sums to the desired value, return an array [-1, -1]
    }
}
