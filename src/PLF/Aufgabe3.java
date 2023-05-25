package PLF;
import java.util.ArrayList;
import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        generateData(8,20);
    }

    static void generateData(int n, int max){
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(0,max));
        }
        System.out.println("The generated data: " + list);
        testNumbers(list);
    }

    static boolean isOdd(int n) {
        return n%2 != 0;
    }

    static void testNumbers(ArrayList<Integer> list) {
        int unevenCountLeft = 0;
        int unevenCountRight = 0;
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) %2 != 0) {
                unevenCountLeft++;
            }
        }

        for (int i = list.size()/2; i < list.size(); i++) {
            if (list.get(i) %2 != 0) {
                unevenCountRight++;
            }
        }
        System.out.println("Anzahl der ungeraden Zahlen links:  " + unevenCountLeft);
        System.out.println("Anzahl der ungeraden Zahlen rechts: " + unevenCountRight);

        if (unevenCountLeft == unevenCountRight) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}