package io.nkcoder.leetcode.array;

import org.junit.jupiter.api.Test;

import static io.nkcoder.leetcode.array.StringToInteger.myAtoi;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {

  @Test
  public void shouldReturn0WhenNoDigit() {
    String s = "abc";
    assertEquals(0, myAtoi(s));
  }

  @Test
  public void shouldReturnIntegerForString() {
    String s = "43";
    assertEquals(43, myAtoi(s));
  }

  @Test
  public void shouldReturnIntegerForStringWithLeadingSpace() {
    String s = "        43";
    assertEquals(43, myAtoi(s));
  }

  @Test
  public void shouldReturnIntegerForStringWithTrailingNonDigit() {
    String s = "82763abc";
    assertEquals(82763, myAtoi(s));
  }

  @Test
  public void shouldReturnNegativeIntegerForString() {
    String s = "-82763abc";
    assertEquals(-82763, myAtoi(s));
  }

  @Test
  public void shouldClampToSmallestInteger() {
    String s = Integer.MIN_VALUE + "1";
    assertEquals(Integer.MIN_VALUE, myAtoi(s));
  }

  @Test
  public void shouldClampToMaxInteger() {
    String s = Integer.MAX_VALUE + "1";
    assertEquals(Integer.MAX_VALUE, myAtoi(s));
  }

  @Test
  public void shouldReturnPositiveInteger() {
    String s = "   +87463";
    assertEquals(87463, myAtoi(s));
  }


  @Test
  public void shouldReturn0ForEmptyInput() {
    String s = "   ";
    assertEquals(0, myAtoi(s));
  }
}
