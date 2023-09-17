package io.nkcoder.leetcode;

/**
 * <a href="https://leetcode.com/problems/build-array-from-permutation/">1920. Build Array from Permutation</a>
 */
public class BuildArrayFromPermutation {
  public static int[] buildArray(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[nums[i]];
    }
    return result;
  }

  public static int[] buildArray2(int[] nums) {
    go(nums, 0);
    return nums;
  }

  private static void go(int[] nums, int start) {
    if (start < nums.length) {
      int result = nums[nums[start]];
      go(nums, start + 1);
      nums[start] = result;
    }
  }
}
