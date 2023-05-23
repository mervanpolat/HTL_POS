package Lab03Teil1;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        // Aufgabe3: Taschenrechner
        // Erstellen Sie ein Programm, bei dem zwei (Komma-)Zahlen und der Operator über die Konsole eingegeben werden können.
        // Das Programm berechnet das Ergebnis und gibt es auf der Konsole aus. Wird ein ungültiger Operator eingegeben, so wird eine Fehlermeldung ausgegeben.

        System.out.print("Bitte geben Sie zwei Zahlen ein: ");
        Scanner input = new Scanner(System.in);

        double number1 = input.nextInt();
        double number2 = input.nextInt();

        System.out.print("Bitte geben Sie einen gültigen Operator ein: ");
        Scanner txt = new Scanner(System.in);
        String operator = txt.nextLine();

        String addition = "+";
        String subtraction = "-";
        String multiply = "*";
        String divide = "/";

        if (operator.equals(addition)) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 + number2));
        } else if (operator.equals(subtraction)) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 - number2));
        } else if (operator.equals(multiply)) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 * number2));
        } else if (operator.equals(divide)) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + (number1 / number2));
        }
        input.close();
    }
}
