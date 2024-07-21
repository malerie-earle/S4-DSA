package Stacks;

// Check if palindrome
public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        int n = word.length();

        // Create a StringBuilder to build the reverse of the word
        StringBuilder reverseWord = new StringBuilder();

        // Build the reverse of the word
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reverseWord.append(currentChar);
            System.out.println("Adding character '" + currentChar + "' to reverseWord: " + reverseWord.toString());
        }

        // Print the final reverseWord
        System.out.println("Reverse of the word '" + word + "' is: " + reverseWord.toString());

        // Check if the original word is equal to its reverse
        boolean isPalindrome = word.equals(reverseWord.toString());
        if (isPalindrome) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "racecar";
        String word3 = "hello";

        System.out.println("Checking if '" + word1 + "' is a palindrome:");
        System.out.println(isPalindrome(word1));
        System.out.println();

        System.out.println("Checking if '" + word2 + "' is a palindrome:");
        System.out.println(isPalindrome(word2));
        System.out.println();

        System.out.println("Checking if '" + word3 + "' is a palindrome:");
        System.out.println(isPalindrome(word3));
    }
}
