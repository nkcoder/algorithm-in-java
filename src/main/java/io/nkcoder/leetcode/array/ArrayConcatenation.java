package io.nkcoder.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-array/">1929. Concatenation of Array</a>
 */
public class ArrayConcatenation {
  /**
   * Time: 1ms (good)
   * Memory: 44.64MB (bad)
   */
  public static int[] getConcatenation(int[] input) {
    int len = input.length;
    int[] result = new int[2 * len];
    for (int i = 0; i < len; i++) {
      result[i] = input[i];
      result[i + len] = input[i];
    }
    return result;
  }
}
