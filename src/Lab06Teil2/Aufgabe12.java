package Lab06Teil2;
import java.util.Arrays;

public class Aufgabe12 {
    public static void main(String[] args) {
        // Define an array of integers
        int[]arr = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array using Arrays.toString to format it nicely
        System.out.println("Before: " + Arrays.toString(arr));

        // Define two pointers, one at the start of the array and one at the end
        int start = 0;
        int end = arr.length - 1;

        // Loop until the two pointers meet in the middle of the array
        while (start <= end) {

            // Inside the loop, swap the elements at the two pointers
            swap(arr, start, end);

            // Move the start pointer one step towards the end of the array
            start++;

            // Move the end pointer one step towards the start of the array
            end--;
        }

        // Print the reversed array
        System.out.println("After:  " + Arrays.toString(arr));
    }

    // Function to swap the elements in an array at two given indices
    private static void swap(int[]arr, int index1, int index2) {
        // Store the element at index1 in a temporary variable
        int temp = arr[index1];

        // Replace the element at index1 with the element at index2
        arr[index1] = arr[index2];

        // Replace the element at index2 with the original element at index1 (stored in temp)
        arr[index2] = temp;
    }
}
