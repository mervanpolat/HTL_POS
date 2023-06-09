// This line indicates the package name, which is usually used to organize your classes in Java.
package PLF_24_5_2023;

// These are import statements that allow us to use predefined classes and methods in our code.
// Here, we are importing the ArrayList and Random classes from the java.util package.
import java.util.ArrayList;
import java.util.Random;

// The public keyword is an access modifier which represents visibility, it means it is visible to all.
// class is a keyword used to declare a class.
// The word Aufgabe2 is our class name.
public class Aufgabe2 {

    // This is the main method, which is the entry point for any Java program.
    // The Java Virtual Machine (JVM) calls the main method when the program starts.
    public static void main(String[] args) {
        // These lines call the generateData method with different parameters.
        generateData(8,12);
        generateData(12,30);
    }

    // This is a static method named generateData.
    // It generates an ArrayList of random integers with a size of n and each integer being between 0 and max.
    static void generateData(int n, int max) {
        // This line creates a new instance of the Random class.
        // This will be used to generate our random numbers.
        Random rand = new Random();

        // This line creates a new ArrayList to store our random integers.
        ArrayList<Integer> list = new ArrayList<>();

        // This is a for loop that will iterate n times.
        for (int i = 0; i < n; i++) {
            // This line adds a new random integer between 0 (inclusive) and max (exclusive) to our list.
            list.add(rand.nextInt(max));
        }

        // This line prints the generated list of random integers to the console.
        System.out.println("The generated data: " + list);

        // This line calls the calculateAverage method, passing our list of random integers as a parameter.
        calculateAverage(list);
    }

    // This is a static method named calculateAverage.
    // It calculates the average of the integers in an ArrayList.
    static void calculateAverage(ArrayList<Integer> list) {
        // These two lines initialize our sum and size variables.
        // sum will be used to store the total of all the integers in the list.
        // size will store the number of elements in the list.
        double sum = 0;
        double size = list.size();

        // This is a for loop that will iterate once for each element in the list.
        for (int i = 0; i < list.size(); i++) {
            // This line adds the current integer to our sum.
            sum += list.get(i);
        }

        // This line calculates the average by dividing the sum by the number of elements.
        double average = sum / size;

        // This line prints the average to the console.
        System.out.printf("The average is: %.3f     ", average);
    }
}
