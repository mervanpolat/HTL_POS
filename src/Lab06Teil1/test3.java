package Lab06Teil1;
import java.util.ArrayList;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(0,20+1));
        }
        System.out.println(list);

        int counterLeft = 0;
        int counterRight = 0;

        //Die linke Seite meiner Liste
        for (int i = 0; i < list.size()/2; i++) {
            int links = list.get(i);
            if (isOdd(links)) {
                counterLeft++;
            }
        }

        //Die rechte Seite meiner Liste
        for (int i = list.size()/2; i < list.size(); i++) {
            int rechts = list.get(i);
            if (isOdd(rechts)) {
                counterRight++;
            }
        }

        System.out.println("Links:  " + counterLeft);
        System.out.println("Rechts: " + counterRight);

        if (counterLeft==counterRight) {
            System.out.println("Die beiden Seiten sind gleich!");
        } else {
            System.out.println("Nicht gleich!");
        }
    }
    static boolean isOdd(int number) {
       return number%2 != 0;
    }
}
