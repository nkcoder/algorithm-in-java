package io.nkcoder.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/string-to-integer-atoi">8. String to Integer (atoi)</a>
 */
public class StringToInteger {

  public static int myAtoi(String s) {
    if (s == null || s.isEmpty()) return 0;

    String sStriped = s.stripLeading();
    if (sStriped.isEmpty()) return 0;

    int currentResult = 0;
    boolean negative = sStriped.charAt(0) == '-';
    int startIndex = sStriped.charAt(0) == '-' || sStriped.charAt(0) == '+' ? 1 : 0;
    for (int i = startIndex; i < sStriped.length(); i++) {
      if (!Character.isDigit(sStriped.charAt(i))) break;

      int digit = sStriped.charAt(i) - '0';
      // detect overflow
      if (currentResult > (Integer.MAX_VALUE - digit) / 10) {
        return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }

      currentResult = currentResult * 10 + digit;
    }

    return negative ? -currentResult : currentResult;
  }
}
