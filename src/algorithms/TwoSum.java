package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given    nums = [2, 7, 11, 15], target = 9,
 * Because  nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    // Approach 1: Two loops -> O(n^2)
    private static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    // Approach 2: Two-pass Hash Table -> O(n)
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        return new int[]{};
    }

    // Approach 3: One-pass Hash Table -> O(n)
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {11, 7, 15, 2};
        int target = 9;

        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
        System.out.println(Arrays.toString(twoSum3(nums, target)));
    }
}