package io.nkcoder.leetcode;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.ValueAfterOperation.finalValueAfterPerformingOperation;
import static io.nkcoder.leetcode.ValueAfterOperation.finalValueAfterPerformingOperation2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueAfterOperationTest {

  @Test
  public void shouldCalculateValue() {
    String[] operations = {"++X", "X++", "--X", "X--", "X--"};
    int result = finalValueAfterPerformingOperation(operations);
    assertEquals(-1, result);
  }

  @Test
  public void shouldCalculateValue2() {
    String[] operations = {"++X", "X++", "--X", "X--", "X--"};
    int result = finalValueAfterPerformingOperation2(operations);
    assertEquals(-1, result);
  }
}
