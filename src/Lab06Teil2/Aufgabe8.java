package Lab06Teil2; // This line defines the package in which this class is contained.

import java.util.Arrays; // This line imports the Arrays class from the java.util package, which provides various methods for manipulating arrays.
import java.util.Scanner; // This line imports the Scanner class from the java.util package, which is used to get input from the user.

public class Aufgabe8 { // This line begins the definition of a public class named Aufgabe8. Public means it can be accessed from any other class.

    public static void main(String[] args) { // This is the main method, where your program starts running. It's always required in a Java program.

        Scanner input = new Scanner(System.in); // This creates a new Scanner object that can read input from the console.

        int[]arr = {3, 1, 2, 5, 3, 1, 6, 0, 9, 4}; // This line declares and initializes an array of integers.

        System.out.println("Before: " + Arrays.toString(arr));
        // This line prints the array before swapping. Arrays.toString(arr) is a method that returns a string representation of the array.

        swap(arr,2,5); // This line calls the swap method, passing the array and the indices of the two elements to be swapped.

        System.out.println("After:  " + Arrays.toString(arr));
        // This line prints the array after the swap operation to show that the elements at the given indices have been swapped.

        swap(arr,2,10); // This line attempts to swap the elements at indices 2 and 10. However, this will result in an ArrayIndexOutOfBoundsException
        // because the array doesn't have an index 10.
    }

    private static void swap(int[]arr, int index1, int index2) {
        // This is the definition of the swap method. It's a private static method, meaning it can only be accessed from within this class and doesn't require an object of the class to be called.
        // It takes three parameters: an array of integers and two integers representing the indices of the elements to be swapped.

        int temp = arr[index1]; // This line creates a temporary variable and stores the value of the element at the first index.
        arr[index1] = arr[index2]; // This line assigns the value of the element at the second index to the element at the first index.
        arr[index2] = temp; // This line assigns the value stored in the temporary variable to the element at the second index.
    } // These three lines together swap the values of the elements at the given indices in the array.
}
