package algorithms;

import java.util.Arrays;

public class AnagramDetection {
    /**
     * Problem: Given 2 string -> Check if they are anagram of each other
     */
    private static boolean detectAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        // Convert strings to lowercase char arrays
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        // Then sorting
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        // Compare sorted char arrays and return
        for (int i = 0; i < aChars.length; i++)
            if (aChars[i] != bChars[i])
                return false;

        return true;
    }


    public static void main(String[] args) {
        System.out.println(detectAnagram("cat", "tca"));
        System.out.println(detectAnagram("peeK", "keeP"));
        System.out.println(detectAnagram("chicken", "kicchen"));
        System.out.println(detectAnagram("happy", "yypah"));
    }
}