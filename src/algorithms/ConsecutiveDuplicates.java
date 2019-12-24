package algorithms;

/**
 * Problem: Given a string -> Check if it has any consecutive duplicates
 */
public class ConsecutiveDuplicates {
    private static boolean hasConsecutiveDuplicate(String s) {
        // Convert string to lowercase char array
        char[] chars = s.toLowerCase().toCharArray();

        // Loop through the char array and
        // compare 2 consecutive chars at a time
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1])
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasConsecutiveDuplicate("dupliicates"));
    }
}