package io.nkcoder.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */
public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      // skip the duplicate of i
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          result.add(List.of(nums[i], nums[j], nums[k]));

          // skip the duplicate of j
          while (j < k && nums[j] == nums[j + 1]) j++;
          // skip the duplicate of k
          while (j < k && nums[k] == nums[k - 1]) k--;

          j++;
          k--;
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return result;
  }

}
