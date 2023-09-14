package io.nkcoder.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.nkcoder.hackerrank.CompareTriplets.compareTriplets;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareTripletsTest {
  @Test
  public void shouldCompareWhenAliceWin() {
    List<Integer> result = compareTriplets(List.of(6, 4, 2), List.of(5, 3, 1));
    assertIterableEquals(List.of(3, 0), result);
  }

  @Test
  public void shouldCompareWhenBobWin() {
    List<Integer> result = compareTriplets(List.of(1, 2, 3), List.of(5, 3, 7));
    assertIterableEquals(List.of(0, 3), result);
  }

  @Test
  public void shouldCompareWhenTie() {
    List<Integer> result = compareTriplets(List.of(8, 2, 3), List.of(5, 2, 7));
    assertIterableEquals(List.of(1, 1), result);
  }

  @Test
  public void shouldNotCompareWhenInvalidInput() {
    List<Integer> result = compareTriplets(List.of(1, 2, 5, 6), List.of(1, 9, 8));
    assertTrue(result.isEmpty());
  }
}
