package io.nkcoder.leetcode.array;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ArrayConcatenation {
    public static int[] getConcatenation(int[] input) {
        int len = input.length;
        int[] result = new int[2 * len];
        for (int i = 0; i < len; i++) {
            result[i] = input[i];
            result[i + len] = input[i];
        }
        return result;
    }
}
