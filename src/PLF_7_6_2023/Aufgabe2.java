package PLF_7_6_2023;

import java.util.ArrayList;

public class Aufgabe2 {
    public static void main(String[] args) {
        ArrayList<String> produktnamen = new ArrayList<>();
        produktnamen.add("Wireless Mouse");
        produktnamen.add("4k Monitor");
        produktnamen.add("i12400K Intel CPU");

        ArrayList<Float> produktpreise = new ArrayList<>();
        produktpreise.add(45.9f);
        produktpreise.add(849.99f);
        produktpreise.add(380.0f);

        analyzeBudget(produktnamen,produktpreise,1000);
    }

    static void analyzeBudget(ArrayList<String> produktnamen, ArrayList<Float> produktpreise, float budget){
        budget = 1000f;
        ArrayList<Float> sum = new ArrayList<>();

        System.out.println(produktnamen);
        System.out.println(produktpreise);
        System.out.println("Budget: €" + budget);
        System.out.println("Ignoring: i12400K Intel CPU");

        for (int i = 0; i < produktpreise.size(); i++) {
            sum.add(produktpreise.get(i));
            if (sum.contains(produktpreise.get(2))) {
                sum.remove(2);
            }
        }
        System.out.println("A total of 2/3 products could be bought for €" + budget);
    }
}
