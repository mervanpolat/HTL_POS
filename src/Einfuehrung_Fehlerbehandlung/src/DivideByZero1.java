package Einfuehrung_Fehlerbehandlung.src;

import java.util.Scanner;

public class DivideByZero1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Geben Sie bitte den Dividenden ein: ");
            int dividend = scanner.nextInt();
            System.out.print("Geben Sie bitte den Divisor ein: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Ergebnis: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null nicht möglich");
        } catch (Exception ex) {
            System.out.println("Fehler: Ungültige Eingabe!");
        } finally {
            scanner.close();
        }
    }
}
