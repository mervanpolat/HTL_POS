package Lab05Teil3;

import java.util.ArrayList;

public class Aufgabe24_VergleichVonListen {
    // define a public static method named "main" with a String[] argument
    public static void main(String[] args) {

        // Comment explaining the purpose of the program and the task to be performed

        // create an ArrayList object named "list" of type Integer
        ArrayList<Integer>list = new ArrayList<>();
        // create an ArrayList object named "list2" of type Integer
        ArrayList<Integer>list2 = new ArrayList<>();

        // use a for loop to add integers 1-5 to the first list
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }

        // use a for loop to add integers 5-8 to the second list
        for (int i = 5; i < 9; i++) {
            list2.add(i);
        }

        // prints the two lists
        System.out.println(list);
        System.out.println(list2);

        // initialize a counter variable to 0
        int counter = 0;

        // use an enhanced for loop to iterate through each element in the first list
        for (int num : list) {
            // use a regular for loop to iterate through each element in the second list
            for (int i = 0; i < list2.size(); i++) {
                // check if the current element in the first list is equal to the current element in the second list
                if (num==list2.get(i)) {
                    // increment the counter variable
                    ++counter;
                }
            }
        }

        // check if the counter variable is greater than or equal to 1
        if (counter>=1) {
            // if so, print a message indicating that the lists have at least one common element
            System.out.println("Die Listen haben mindestens ein gemeinsames Element: " + counter);
        } else {
            // if not, print a message indicating that the lists have no common elements
            System.out.println("Die Listen haben kein gemeinsames Element.");
        }
        //Prints
        //[1, 2, 3, 4, 5]
        //[5, 6, 7, 8]
        //Die Listen haben mindestens ein gemeinsames Element: 1
    }

}
