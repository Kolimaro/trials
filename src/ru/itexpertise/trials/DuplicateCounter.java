package ru.itexpertise.trials;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Pavel Tokarev, 31.08.2021
 */

public class DuplicateCounter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String line = scanner.nextLine();

    System.out.println(duplicateCounter(line));
  }

  private static int duplicateCounter(String str) {
    int countOfDuplicates = 0;
    String[] temp = str.split(" ");
    Map<String, Integer> duplicates = new HashMap<>();

    for (String word : temp) {
      duplicates.put(word, duplicates.containsKey(word) ? duplicates.get(word) + 1 : 1);
    }

    for (Integer value : duplicates.values()) {
      if (value > 1) {
        countOfDuplicates += value;
      }
    }

    return countOfDuplicates;
  }
}
