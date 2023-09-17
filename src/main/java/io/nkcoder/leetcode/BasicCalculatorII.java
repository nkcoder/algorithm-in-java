package io.nkcoder.leetcode;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/basic-calculator-ii/description/">227. Basic Calculator II<a/>
 */
public class BasicCalculatorII {
  // with stack: easier to understand
  public static int calculate(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    Stack<Integer> stack = new Stack<>();

    char operation = '+';
    int currentNumber = 0;

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        currentNumber = 10 * currentNumber + currentChar - '0';
      }
      if ((!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)) || i == s.length() - 1) {
        if (operation == '+') {
          stack.push(currentNumber);
        } else if (operation == '-') {
          stack.push(-currentNumber);
        } else if (operation == '*') {
          stack.push(stack.pop() * currentNumber);
        } else if (operation == '/') {
          stack.push(stack.pop() / currentNumber);
        }
        operation = currentChar;
        currentNumber = 0;
      }
    }

    return stack.stream().reduce(0, Integer::sum);
  }

  // without stack: better
  public static int calculate2(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    char operation = '+';
    int lastNum = 0, length = s.length(), currentNumber = 0;
    int result = 0;
    for (int i = 0; i < length - 1; i++) {
      char currentChar = s.charAt(i);
      if (Character.isDigit(currentChar)) {
        currentNumber = currentNumber * 10 + (currentChar - '0');
      }

      if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
        if (operation == '+' || operation == '-') {
          result += lastNum;
          lastNum = operation == '+' ? currentNumber : -currentNumber;
        } else {
          lastNum = operation == '*' ? lastNum * currentNumber : lastNum / currentNumber;
        }
        operation = currentChar;
        currentNumber = 0;
      }

    }
    result += lastNum;
    return result;
  }

}
