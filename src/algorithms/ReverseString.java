package algorithms;

/**
 * Problem: Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 *
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    // Using 2 pointers -> O(1) Space
    public static void reverseString(char[] c) {
        if (c.length == 0) {
            System.out.println("Empty string");
        } else {
            int left = 0, right = c.length - 1;
            while (left < right) {
                char tempChar = c[left];
                c[left++] = c[right]; // left++ returns left first, then increase left by 1
                c[right--] = tempChar;
            }
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        char[] c = s.toCharArray();

        reverseString(c);
        System.out.println(c);
    }
}
