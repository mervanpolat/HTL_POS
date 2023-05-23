package Lab05Teil3;

public class Aufgabe22_Zahlenpyramide {
    public static void main(String[] args) {
        //Aufgabe 22: Zahlenpyramide
        //Schreiben Sie ein Programm, das Folgendes ausgibt (verwenden Sie verschachtelte Schleifen):
        //1
        //22
        //333
        //4444
        //55555
        //666666
        //7777777
        //88888888
        //999999999

        // This is a for loop that initializes the variable i to 1, and will repeat
        // the loop until i is no longer less than 10. It increments i by 1 each time
        // the loop is executed.
        for (int i = 1; i < 10; i++) {

            // This is a nested for loop that initializes the variable j to 1, and will
            // repeat the loop until j is no longer less than or equal to i. It increments
            // j by 1 each time the loop is executed.
            for (int j = 1; j <= i; j++) {

                // This line prints the value of i to the console without starting a new line.
                System.out.print(i);
            }

            // This line prints a newline character to the console, which will move the
            // cursor to the beginning of the next line.
            System.out.println();
        }
    }
}
