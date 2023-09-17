package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.array.ShuffleArray.shuffle;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleArrayTest {

  @Test
  public void shouldShuffle() {
    int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
    int n = 4;
    int[] result = shuffle(nums, n);
    assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, result);
  }

  @Test
  public void shouldShuffleFor1Pair() {
    int[] nums = new int[]{1, 2};
    int n = 1;
    assertArrayEquals(new int[]{1, 2}, nums);
  }

}
