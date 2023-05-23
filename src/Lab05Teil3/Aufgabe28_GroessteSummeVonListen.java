package Lab05Teil3;
import java.util.ArrayList;

public class Aufgabe28_GroessteSummeVonListen {
    public static void main(String[] args) {
        // Create a list of lists called "lists"
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();

        // Add some sublists to the main list
        ArrayList<Integer> sublist1 = new ArrayList<Integer>();
        sublist1.add(1);
        sublist1.add(2);
        sublist1.add(3);

        ArrayList<Integer> sublist2 = new ArrayList<Integer>();
        sublist2.add(4);
        sublist2.add(5);
        sublist2.add(6);

        ArrayList<Integer> sublist3 = new ArrayList<Integer>();
        sublist3.add(10);
        sublist3.add(11);
        sublist3.add(12);

        ArrayList<Integer> sublist4 = new ArrayList<Integer>();
        sublist4.add(7);
        sublist4.add(8);
        sublist4.add(9);

        lists.add(sublist1);
        lists.add(sublist2);
        lists.add(sublist3);
        lists.add(sublist4);

        // Create a variable to keep track of the current maximum sum
        int maxSum = Integer.MIN_VALUE;

        // Create a variable to keep track of the sublist with the maximum sum
        ArrayList<Integer> maxSumList = new ArrayList<Integer>();

        // Loop through each sublist in the main list
        for (ArrayList<Integer> sublist : lists) {
            // Create a variable to keep track of the sum of the current sublist
            int sum = 0;

            // Loop through each element in the current sublist and add it to the sum
            for (int num : sublist) {
                sum += num;
            }

            // If the current sum is greater than the maximum sum seen so far
            if (sum > maxSum) {
                // Update the maximum sum and the sublist with the maximum sum
                maxSum = sum;
                maxSumList = sublist;
            }
        }
        // Print the sublist with the maximum sum
        System.out.println(maxSumList);
        //Prints [10, 11, 12]
    }
}
