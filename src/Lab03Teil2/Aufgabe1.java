package Lab03Teil2;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        //Aufgabe 1: Steuerrechner

        System.out.print("Geben Sie Ihren jährlichen Gehalt ein: ");
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();

        if (g < 11000) {
            System.out.println("0%");
            System.out.println(g * 1.00);
        } else if (g > 11000 && g < 18000) {
            System.out.println("Fallender Höchststeuersatz: 25%");
            System.out.println("Netto: €" + g *0.75);
        } else if (g > 18000 && g < 31000) {
            System.out.println("Fallender Höchststeuersatz: 35%");
            System.out.println("Netto: €" + g * 0.65);
        } else if (g > 31000 && g < 60000) {
            System.out.println("Fallender Höchststeuersatz: 42%");
            System.out.println("Netto: €" + g*0.58);
        } else if (g > 60000 && g < 90000) {
            System.out.println("Fallender Höchststeuersatz: 48%");
            System.out.println("Netto: €" + g*0.52);
        } else if (g > 90000 && g < 1000000) {
            System.out.println("Fallender Höchststeuersatz: 50%");
            System.out.println("Netto: €" + g*0.5);
        } else if (g > 1000000){
            System.out.println("Fallender Höchststeuersatz: 55%");
            System.out.println("Netto: €" + g*0.45);
        }
        input.close();
    }
}
