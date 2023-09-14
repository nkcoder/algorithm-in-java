package io.nkcoder.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.nkcoder.hackerrank.SimpleArraySum.simpleArraySum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleArraySumTest {

  @Test
  public void shouldReturnSum() {
    int sum = simpleArraySum(List.of(1, 3, 5, 7, 2));
    assertEquals(18, sum);
  }

  @Test
  public void shouldReturnSumForOnly1Element() {
    int sum = simpleArraySum(List.of(1));
    assertEquals(1, sum);
  }
}
