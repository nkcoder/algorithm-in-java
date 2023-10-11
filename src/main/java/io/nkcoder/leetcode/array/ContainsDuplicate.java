package io.nkcoder.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 *
 * 1. sort and compare adjacent elements. TC - O(nlogn), SC - O(n)
 * 2. double traversal. TC - O(n^2), SC - O(1)
 * 3. use a set to check duplicate. TC - O(n), SC - O(n)
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }

        return false;
    }
}
