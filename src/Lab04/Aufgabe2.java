package Lab04;

import java.util.Arrays;

public class Aufgabe2 {
    public static void main(String[] args) {

         /*
        Aufgabe 2: Array umkehren
        Erstellen Sie wieder ein Integer Array für fünf Zahlen und füllen Sie es mit den Werten 1 bis 5.
        Schreiben Sie nun ein Programm, das die Reihenfolge der Zahlen im Array umkehrt –
        am Ende also 5, 4, 3, 2, 1 im Array steht.
        */

        // Creating an integer array with length 5 and filling it with values 1 to 5
        int[] arr = {1,2,3,4,5};

        // Setting the start index to the first element of the array
        int start = 0;

        // Setting the end index to the last element of the array
        int end = arr.length-1;

        // Swapping the elements of the array from start to end until the middle of the array is reached
        while (start<=end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        // Printing the reversed array
        System.out.println(Arrays.toString(arr));
    }

    // Function to swap the elements of an array at two given indices
    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
