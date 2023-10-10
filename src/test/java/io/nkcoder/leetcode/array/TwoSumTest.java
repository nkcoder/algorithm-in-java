package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.array.TwoSum.twoSum;
import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    @Test
    public void testCase1() {
        final int[] input = new int[] {2, 7, 11, 15};
        final int target = 9;
        int[] result = twoSum(input, target);
        assertThat(result).hasSize(2);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    public void testCase2() {
        final int[] input = new int[] {3, 2, 4};
        final int target = 6;
        int[] result = twoSum(input, target);
        assertThat(result).hasSize(2);
        assertThat(result).containsExactlyInAnyOrder(2, 1);
    }

    @Test
    public void testCase3() {
        final int[] input = new int[] {3, 3};
        final int target = 6;
        int[] result = twoSum(input, target);
        assertThat(result).hasSize(2);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }
}
