package io.nkcoder.leetcode.array;

import java.util.Stack;

/**
 * https://leetcode.com/problems/basic-calculator-ii/description
 */
public class BasicCalculatorII {
    // with stack, '153+2*2-1' is translated to '+153+2*2-1' as the integers are non-negative
    // when we encounter a new operator (+, -, *, /), we check the previous operator:
    // - if it's * or /, calculation happens, otherwise just enqueue the element
    //

    /**
     * Use a stack, '153+2*2-1' is translated to '+153+2*2-1' as the integers are non-negative.
     * when we encounter a new operator (+, -, *, /), we check the previous operator:
     * - if it's * or /, calculation happens, otherwise just enqueue the element
     * TC: O(n), SC: O(n)
     */
    public static int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();

        char previousOperation = '+';
        int currentNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // non-negative integers in the range [0, 231 - 1]
            if (Character.isDigit(currentChar)) {
                currentNumber = 10 * currentNumber + (currentChar - '0');
            }

            // NOTE: this is another if, not else if
            // non-integer: calculate the previous operation
            if ((!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)) || i == s.length() - 1) {
                if (previousOperation == '+') {
                    stack.push(currentNumber);
                } else if (previousOperation == '-') {
                    stack.push(-currentNumber);
                } else if (previousOperation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (previousOperation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                previousOperation = currentChar;
                currentNumber = 0;
            }
        }

        return stack.stream().reduce(0, Integer::sum);
    }

    /**
     * Without a stack: need to track the last num and the current num.
     *
     */
    public static int calculate2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        char lastOperation = '+';
        int lastNum = 0, length = s.length(), currentNumber = 0;
        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (lastOperation == '+' || lastOperation == '-') {
                    result += lastNum;
                    lastNum = lastOperation == '+' ? currentNumber : -currentNumber;
                } else {
                    lastNum = lastOperation == '*' ? lastNum * currentNumber : lastNum / currentNumber;
                }
                lastOperation = currentChar;
                currentNumber = 0;
            }

        }
        result += lastNum;
        return result;
    }

}
