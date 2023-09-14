package io.nkcoder.hackerrank;

import java.util.List;

// https://www.hackerrank.com/challenges/simple-array-sum?isFullScreen=true

public class SimpleArraySum {
  public static int simpleArraySum(List<Integer> arr) {
    return arr.stream().mapToInt(Integer::intValue).sum();
  }
}
