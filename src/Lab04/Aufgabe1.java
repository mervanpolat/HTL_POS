package Lab04;
import java.util.Random;    // Importing the necessary library to generate random numbers

public class Aufgabe1 {
    public static void main(String[] args) {

        /*
        Aufgabe 1: Zufallszahlen
        This program creates an integer array with space for five numbers and fills it with random numbers
        between 1 and 20. It then prints out the first and last number in the array as well as the length of the array.
        */

        // Creating an integer array with length 5
        int[] arr = new int[5];

        // Creating a new instance of Random class to generate random numbers
        Random rand = new Random();

        // Setting the minimum and maximum values for the random numbers to be generated
        int min = 1;
        int max = 20;

        // Generating a random number and assigning it to the first element of the array
        arr[0] = rand.nextInt(21);

        // Generating a random number and assigning it to the second element of the array
        arr[1] = rand.nextInt(21);

        // Generating a random number and assigning it to the third element of the array
        arr[2] = rand.nextInt(21);

        // Generating a random number and assigning it to the fourth element of the array
        arr[3] = rand.nextInt(21);

        // Generating a random number and assigning it to the fifth element of the array
        arr[4] = rand.nextInt(21);

        // Printing the first element of the array
        System.out.println(arr[0]);

        // Printing the last element of the array
        System.out.println(arr[4]);

        // Printing the length of the array
        System.out.println(arr.length);
    }
}
