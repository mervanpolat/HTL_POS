package PLF_7_6_2023;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        readString(input);
    }

    static void readString(Scanner input) {
        ArrayList<String> liste = new ArrayList<>();
       String text = "";

        do {
            System.out.println("Bitte geben Sie einen Text ein: ");
            text = input.nextLine();

            if (text.equals(" ") || text.equals("0")) {
                System.out.println(liste);
                analyzeWords(liste);
            } else {
                liste.add(text);
            }
        } while (!(text.equals(" ") || text.equals("0")));
    }

    static void analyzeWords(ArrayList<String> liste) {
        String buchstabe = "a";
        int counter = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (buchstabe.equals(liste.get(i).toLowerCase())) {
                counter++;
            }
            System.out.println("There are " + liste.size() + " strings in the list that have more than one 'a'.");

        }
        System.out.println("Strings: " + liste);
    }

    static boolean checkWord(String a){
        return true;
    }
}
