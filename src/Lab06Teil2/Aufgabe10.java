package Lab06Teil2; // This line defines the package in which this class is contained.

public class Aufgabe10 { // This line begins the definition of a public class named Aufgabe10. Public means it can be accessed from any other class.

    public static void main(String[] args) {
        // This is the main method, where your program starts running. It's always required in a Java program.

        // The following lines call the translateB method with different strings as argument.
        translateB("");         // Calls the translateB method with an empty string as argument. It prints an empty string because there's no vowel to replace.
        translateB("Hihihoho"); // Calls the translateB method with "Hihihoho" as argument. It prints "Hibihbihoboho".
        translateB("Blume");    // Calls the translateB method with "Blume" as argument. It prints "Bublubmebe".
        translateB("Computer"); // Calls the translateB method with "Computer" as argument. It prints "Cobompubutber".
    }

    static void translateB(String text) {
        // This is the definition of the translateB method. It's a static method, meaning it doesn't require an object of the class to be called.
        // It takes a string as parameter and replaces every vowel (a, e, i, o, u) in the string with the vowel followed by a 'b' and the vowel again.

        // The if statement checks if the string contains any of the vowels (a, e, i, o, u). If it does, the string is modified.
        if (text.contains("a") || text.contains("e") || text.contains("i") || text.contains("o") || text.contains("u")) {

            // The following lines replace every vowel in the string with the vowel followed by a 'b' and the vowel again.
            text = text.replace("a", "aba"); // Replaces every 'a' in the string with 'aba'.
            text = text.replace("e", "ebe"); // Replaces every 'e' in the string with 'ebe'.
            text = text.replace("i", "ibi"); // Replaces every 'i' in the string with 'ibi'.
            text = text.replace("o", "obo"); // Replaces every 'o' in the string with 'obo'.
            text = text.replace("u", "ubu"); // Replaces every 'u' in the string with 'ubu'.
        }
        // The modified string is then printed to the console.
        System.out.println(text);
    }
}

/**
 * package Lab06Teil2;
 *
 * public class Aufgabe10 {
 *     public static void main(String[] args) {
 *         translateB("Hihihoho");
 *         translateB("Blume");
 *         translateB("Computer");
 *     }
 *
 *     static void translateB(String text) {
 *         StringBuilder sb = new StringBuilder(); // Create a new StringBuilder
 *
 *         for (char c : text.toCharArray()) { // Convert the string to a char array and loop over it
 *             sb.append(c); // Append each character to the StringBuilder
 *             // If the character is a vowel, also append 'b' and the vowel again
 *             if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
 *                 sb.append('b').append(c);
 *             }
 *         }
 *
 *         System.out.println(sb.toString()); // Convert the StringBuilder back to a string and print it
 *     }
 * }
*/
