package Lab06Teil1;

public class test4 {
    public static void main(String[] args) {
        String text = "Anna Sophie";
        System.out.println(isPalindrome(text));

        int[]arr = {1,2,4,5,65,3};

    }

    static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length()-1;
        //0 1 2 3 4 5
        //M e r v a n
        //
        while (start<end) {
            if (text.charAt(start) == text.charAt(end)) {
                return true;
            } else {
                start++;
                end--;
            }
        }
        return false;
    }
}
