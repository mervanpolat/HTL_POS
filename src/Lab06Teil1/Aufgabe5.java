package Lab06Teil1;

public class Aufgabe5 {
    public static void main(String[] args) {
        // Aufgabe 5: Mittlere von 3 Zahlen
        // Erstellen Sie eine Funktion middle, die als Parameter 3 Zahlen nimmt und die mittlere Zahl zurückliefert.
        // Beispiel:
        // middle(1,2,3)
        // 2
        // middle(8,5,9)
        // 8
        // middle(6,2,3)
        // 3
        // Testen Sie die Funktion, indem Sie sie mit verschiedenen Testdaten aufrufen.
        // Funktioniert Ihre Funktion, auch wenn Zahlen doppelt vorkommen?

        // Calls the middle function with the values 21, 38, and 24 as arguments
        // The result is printed to the console, which is the middle value among the three numbers (24)
        System.out.println(middle(21, 38, 24));  // Prints 24
    }

    // Defines a static method called "middle" that takes three integers as parameters (number1, number2, number3)
    // This function finds the middle value among the three provided integers
    static int middle(int number1, int number2, int number3) {
        // Creates an array with the three input numbers
        int[] arr = {number1, number2, number3};

        // Sorts the array using the bubbleSort method
        bubbleSort(arr);

        // Returns the middle value (second element) from the sorted array
        return arr[1];
    }

    // Defines a static method called "bubbleSort" that takes an integer array as a parameter (arr)
    // This function sorts the array using the Bubble Sort algorithm
    static void bubbleSort(int[] arr) {
        // Outer loop iterates through the entire array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop iterates through the array, comparing adjacent elements
            for (int j = 1; j < arr.length; j++) {
                // If the current element is greater than the next one, swap their positions
                if (arr[j - 1] >= arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    // Defines a static method called "swap" that takes an integer array and two indices as parameters (arr, index1, index2)
    // This function swaps the elements at the specified indices in the array
    static void swap(int[] arr, int index1, int index2) {
        // Temporarily stores the value at index1
        int temp = arr[index1];

        // Assigns the value at index2 to index1
        arr[index1] = arr[index2];

        // Assigns the stored value from index1 to index2
        arr[index2] = temp;
    }
}
