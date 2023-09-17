package io.nkcoder.leetcode;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.BuildArrayFromPermutation.buildArray;
import static io.nkcoder.leetcode.BuildArrayFromPermutation.buildArray2;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuildArrayFromPermutationTest {
  @Test
  public void shouldBuildArray() {
    int[] nums = new int[]{1, 3, 4, 5, 2, 0};
    assertArrayEquals(new int[]{3, 5, 2, 0, 4, 1}, buildArray(nums));
  }

  @Test
  public void shouldBuildArrayFor1Element() {
    int[] nums = new int[]{0};
    assertArrayEquals(new int[]{0}, buildArray(nums));
  }

  @Test
  public void shouldBuildArray2() {
    int[] nums = new int[]{1, 3, 4, 5, 2, 0};
    assertArrayEquals(new int[]{3, 5, 2, 0, 4, 1}, buildArray2(nums));
  }

  @Test
  public void shouldBuildArray2For1Element() {
    int[] nums = new int[]{0};
    assertArrayEquals(new int[]{0}, buildArray2(nums));
  }
}
