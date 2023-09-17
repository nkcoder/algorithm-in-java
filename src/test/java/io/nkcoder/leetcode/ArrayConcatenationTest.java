package io.nkcoder.leetcode;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.ArrayConcatenation.getConcatenation;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayConcatenationTest {

  @Test
  public void shouldReturnConcatenation() {
    int[] input = {1, 2, 2, 3};
    int[] result = getConcatenation(input);
    assertArrayEquals(new int[]{1, 2, 2, 3, 1, 2, 2, 3}, result);
  }

  @Test
  public void shouldReturnConcatenationForOnly1Element() {
    int[] input = {1};
    int[] result = getConcatenation(input);
    assertArrayEquals(new int[]{1, 1}, result);
  }
}
