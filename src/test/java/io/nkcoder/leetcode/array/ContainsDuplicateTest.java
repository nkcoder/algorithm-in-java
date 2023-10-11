package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.array.ContainsDuplicate.containsDuplicate;
import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicateTest {

    @Test
    public void case1() {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    public void case2() {
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    public void case3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = containsDuplicate(nums);
        assertThat(result).isTrue();
    }
}
