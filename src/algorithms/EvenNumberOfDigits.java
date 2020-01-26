package algorithms;

import java.util.Arrays;

/**
 * Problem: Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 *
 * Explanation:
 * 12 contains 2 digits (even number of digits)
 * 345 contains 3 digits (odd number of digits)
 * 2 contains 1 digit (odd number of digits)
 * 6 contains 1 digit (odd number of digits)
 * 7896 contains 4 digits (even number of digits)
 *
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class EvenNumberOfDigits {
    // Approach 1: Divide And Conquer (fastest)
    private static int findEvenNumOfDigits1(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num >= 100000) {
                if (num >= 100) {
                    if (num >= 10) {
                        count++;
                    }
                } else {
                    if (num >= 1000) {
                        if (num >= 10000) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    // Approach 2: Dividing with Powers of Two (slightly slower)
    private static int findEvenNumOfDigits2(int[] nums) {
        return 0;
    }

    // Approach 3: Repeated Multiplication (slower)
    private static int findEvenNumOfDigits3(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findEvenNumOfDigits1(nums));
    }
}