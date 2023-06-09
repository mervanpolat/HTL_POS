package Lab06Teil1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        CanSahin();
    }
    static void CanSahin(){
        //Liste deklariert
        //Zufallszahl generator deklariert
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        //for-schleife gibt an, die Anzahl der generierten Nummern und list.add fügt die Zahlen hinzu.
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1,100+1));
        }

        System.out.println(list);

        double divisor = list.size();
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        double durchschnitt = sum / divisor;
        System.out.println("Der Durchschnitt: " + durchschnitt);
    }
}
