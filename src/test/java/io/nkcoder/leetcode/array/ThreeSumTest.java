package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.nkcoder.leetcode.array.ThreeSum.threeSum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ThreeSumTest {

  @Test
  public void shouldReturnAllTriplets() {
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
    List<List<Integer>> results = threeSum(nums);
    assertEquals(2, results.size());
  }

  @Test
  public void shouldReturnEmptyWhenNoTriplets() {
    int[] nums = new int[]{0, 1, 1};
    List<List<Integer>> results = threeSum(nums);
    assertEquals(0, results.size());
  }

  @Test
  public void shouldReturnOnlyOneTriplet() {
    int[] nums = new int[]{0, 0, 0};
    List<List<Integer>> results = threeSum(nums);
    assertEquals(1, results.size());
    assertIterableEquals(List.of(0, 0, 0), results.get(0));
  }

  @Test
  public void shouldReturnTripletCase3() {
    int[] nums = new int[]{1, -1, -1, 0};
    List<List<Integer>> results = threeSum(nums);
    assertEquals(1, results.size());
  }

}
