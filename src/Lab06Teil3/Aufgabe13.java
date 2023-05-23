package Lab06Teil3;

public class Aufgabe13 {
    public static void main(String[] args) {
        // This program uses two pointers, start and end, to compare characters at opposite ends of the string.
        // If it ever finds a pair of characters that don't match, it immediately returns false because the string
        // can't be a palindrome. If it successfully compares all pairs of characters without finding a mismatch,
        // it returns true. The second function also removes spaces and punctuation and converts the string to
        // lowercase before performing the comparison, so it ignores case, spaces, and punctuation.

        // Test the is_palindrome_ignore_case function with "Anna". It should return true.
        System.out.println(is_palindrome_ignore_case("Anna"));

        // Test the is_palindrome_ignore_case_and_punctuation function with a sentence.
        // It should return true because the sentence is the same when read backwards, ignoring case, spaces and punctuation.
        System.out.println(is_palindrome_ignore_case_and_punctuation("Ein Neger mit Gazelle zagt im Regen nie!"));
    }

    // Function that checks if a string is a palindrome, ignoring case.
    public static boolean is_palindrome_ignore_case(String s) {
        // Convert the string to lowercase so we can do a case-insensitive comparison.
        s = s.toLowerCase();

        // Initialize start and end pointers.
        int start = 0;
        int end = s.length() - 1;

        // Keep moving the pointers towards each other until they meet in the middle.
        while (start < end) {
            // If the characters at the start and end pointers don't match, the string is not a palindrome.
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Move the pointers towards each other.
            start++;
            end--;
        }

        // If we've made it this far without returning, the string is a palindrome.
        return true;
    }

    // Function that checks if a string is a palindrome, ignoring case, spaces and punctuation.
    public static boolean is_palindrome_ignore_case_and_punctuation(String s) {
        // Convert the string to lowercase and remove spaces and punctuation.
        s = s.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");

        // Initialize start and end pointers.
        int start = 0;
        int end = s.length() - 1;

        // Keep moving the pointers towards each other until they meet in the middle.
        while (start < end) {
            // If the characters at the start and end pointers don't match, the string is not a palindrome.
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            // Move the pointers towards each other.
            start++;
            end--;
        }
        // If we've made it this far without returning, the string is a palindrome.
        return true;
    }
}
