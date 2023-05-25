package PLF;

import java.util.ArrayList;
import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
        generateData(8,12);
    }

    static void generateData(int n, int max) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(0,max));
        }
        System.out.println("The generated data: " + list);
        calculateAverage(list);
    }

    static void calculateAverage(ArrayList<Integer> list) {
        double sum = 0;
        double size = list.size();
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = sum / size;
        System.out.println("The average is:     " + average);
    }
}
