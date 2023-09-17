package io.nkcoder.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/shuffle-the-array/">1470. Shuffle the Array</a>
 */
public class ShuffleArray {
  public static int[] shuffle(int[] nums, int n) {
    int[] result = new int[n * 2];
    for (int i = 0, j = 0; i < n && j < 2 * n; i++, j += 2) {
      result[j] = nums[i];
      result[j + 1] = nums[i + n];
    }
    return result;
  }

}
