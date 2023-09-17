package io.nkcoder.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/">2011. Final Value of Variable After Performing Operations</a>
 */
public class ValueAfterOperation {
  public static int finalValueAfterPerformingOperation(String[] operations) {
    int result = 0;
    for (String op : operations) {
      if (op.contentEquals("++X") || op.contentEquals("X++")) {
        result++;
      } else if (op.contentEquals("--X") || op.contentEquals("X--")) {
        result--;
      }
    }
    return result;
  }

  /**
   * <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/solutions/3137715/optimized-solution-100-beats/">optimized-solution-100-beats</a>
   * The ASCII value of + is 43, and - is 44, and we can use the second char of the operation.
   */
  public static int finalValueAfterPerformingOperation2(String[] operations) {
    int result = 0;
    for (String s: operations) {
      result += (44 - s.charAt(1));
    }
    return result;
  }
}
