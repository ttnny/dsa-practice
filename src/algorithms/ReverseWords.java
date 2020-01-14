package algorithms;

/**
 * Problem: Given a string of words, reverse the order of the words in the string.
 *
 * Constraints
 * -----------
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = temp.length - 1; i >= 0; i--) {
            if (temp[i].length() != 0) {
                result.append(temp[i]).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "This is    Tony   ";
        System.out.println(reverseWords(s));
    }
}