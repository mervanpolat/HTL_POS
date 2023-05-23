package Lab06Teil2; // This line defines the package in which this class is contained.

public class Aufgabe9 { // This line begins the definition of a public class named Aufgabe9. Public means it can be accessed from any other class.

    public static void main(String[] args) { // This is the main method, where your program starts running. It's always required in a Java program.

        // This code demonstrates a Java class Aufgabe9 containing a findLast method that takes two String parameters:
        // text and suchString. The findLast method returns the index of the last occurrence of the suchString within
        // the text. If the suchString is not found, it returns -1. The main method demonstrates various use cases
        // for the findLast method by calling it with different input strings and printing the results.

        // The following lines call the findLast method and print the result.
        // Each line demonstrates a different use case:
        System.out.println(findLast("aaaa", "a"));     // Should return 3, as the last occurrence of "a" is at index 3.
        System.out.println(findLast("aaaaa", "aa"));   // Should return 3, as the last occurrence of "aa" is at index 3.
        System.out.println(findLast("ababab", "ab"));  // Should return 4, as the last occurrence of "ab" is at index 4.
        System.out.println(findLast("aaaa", "b"));     // Should return -1, as the substring "b" does not appear in the text.
        System.out.println(findLast("", "b"));         // Should return -1, as the input text is empty and does not contain any substrings.
    }

    // This is the definition of the findLast method. It's a static method, meaning it doesn't require an object of the class to be called.
    // It takes two parameters: a text (String) and a substring (String) to search for.
    static int findLast(String text, String suchString) {
        // The lastIndexOf() method returns the position of the last occurrence of the given substring in the text.
        // If the substring is not found, it returns -1.
        return text.lastIndexOf(suchString);
    }
}
