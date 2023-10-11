package io.nkcoder.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 * <pre>
 *     1. only exactly one match
 *     2. use 2 indices to loop the nums twice will incur TC: O(n^2), but SC: O(1).
 *     3. use a map (check if the diff exists in the map) to swap SC for TC. TC - O(n), SC - O(n).
 * </pre>
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> num2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int diff = target - current;
            if (num2Index.containsKey(diff)) {
                result[0] = i;
                result[1] = num2Index.get(diff);
            } else {
                num2Index.put(current, i);
            }
        }
        return result;
    }
}
