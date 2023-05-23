// Create a class named Aufgabe11
public class Aufgabe11 {

    // Define the main method
    public static void main(String[] args) {
        //Aufgabe 11: SEW ist cool
        //Geben Sie alle Zahlen zwischen 1 und 100 aus. Wenn die Zahl durch 3 teilbar ist, soll statt der Zahl "SEW"
        //ausgegeben werden. Wenn sie durch 5 teilbar ist, soll "cool" ausgegeben werden. Wenn sie durch 3 und 5 teilbar
        //ist, soll "SEW ist cool" ausgegeben werden.
        //1
        //2
        //SEW
        //4
        //cool
        //SEW
        //7
        //8
        //SEW
        //cool
        //11

        // Output numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {

            // If the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                // Output "SEW ist cool"
                System.out.println("SEW ist cool");

                // If the number is divisible by 3
            } else if (i % 3 == 0) {
                // Output "SEW"
                System.out.println("SEW");

                // If the number is divisible by 5
            } else if (i % 5 == 0) {
                // Output "cool"
                System.out.println("cool");

                // If the number is not divisible by either 3 or 5
            } else {
                // Output the number
                System.out.println(i);
            }
        }
    }
}
