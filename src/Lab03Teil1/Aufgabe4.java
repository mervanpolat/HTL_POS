package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {

        //Aufgabe 4: Zahlenanalyse
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        Scanner input = new Scanner(System.in);
        int meineZahl = input.nextInt();

        if (meineZahl < 10) {
            if (meineZahl > 5) {
                System.out.println("Mittelgroß");
            } else {
                System.out.println("klein");
            }
        } else {
            System.out.println("groß!");
        }
        input.close();
    }
}
