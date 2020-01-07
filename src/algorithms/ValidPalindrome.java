package algorithms;

/**
 * Problem: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 *
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        // Remove any character that is not alphanumeric
        // and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use charAt() with a string or
        // Convert to array of lowercase chars
        // char[] c = s.toLowerCase().toCharArray();

        // Check if palindrome
        int length = s.length();

        for (int i = 0; i < (length / 2); i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
