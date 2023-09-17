package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorIITest {

  @Test
  public void shouldCalculateForOnlyPlusMinus() {
    String s = "1 + 6 - 3 + 8 - 4";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(8, result);
  }

  @Test
  public void shouldCalculateForOnlyMultiplyDivide() {
    String s = "2 * 8 / 4 * 5 / 10";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(2, result);
  }

  @Test
  public void shouldCalculateForAllOperators() {
    String s = "2 + 3 * 4 - 5 + 8 / 4 * 3 / 2";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(12, result);
  }

  @Test
  public void shouldCalculate2ForOnlyPlusMinus() {
    String s = "1 + 6 - 3 + 8 - 4";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(8, result);
  }

  @Test
  public void shouldCalculate2ForOnlyMultiplyDivide() {
    String s = "2 * 8 / 4 * 5 / 10";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(2, result);
  }

  @Test
  public void shouldCalculate2ForAllOperators() {
    String s = "2 + 3 * 4 - 5 + 8 / 4 * 3 / 2";
    int result = BasicCalculatorII.calculate(s);
    assertEquals(12, result);
  }
}
