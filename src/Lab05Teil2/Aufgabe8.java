package Lab05Teil2;

public class Aufgabe8 {
    public static void main(String[] args) {
        // Aufgabe 8: Zahlenfolge
        // Schreibe ein Programm, das alle Zahlen zwischen 0 und 6 (jeweils inklusive) ausgibt, außer 3 und 5.
        // 0 1 2 4 6

        // Loop through numbers from 0 to 6 (inclusive)
        for (int i = 0; i <= 6; i++) {
            // Check if the number is even or equal to 1
            if (i%2==0 || i == 1) {
                // If the number is even or equal to 1, print it followed by a space
                System.out.print(i + " ");  //0 1 2 4 6
            }
        }
    }
}
