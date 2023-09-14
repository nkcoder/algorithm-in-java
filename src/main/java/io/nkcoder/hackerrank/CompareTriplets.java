package io.nkcoder.hackerrank;

import java.util.List;

// https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class CompareTriplets {
  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    if (a.size() != b.size()) {
      return List.of();
    }

    int size = a.size();
    int scoreA = 0, scoreB = 0;
    for (int i = 0; i < size; i++) {
      if (a.get(i) > b.get(i)) {
        scoreA++;
      } else if (a.get(i) < b.get(i)) {
        scoreB++;
      }
    }
    return List.of(scoreA, scoreB);
  }
}
