package ru.itexpertise.trials;

import java.util.Scanner;

/**
 * @author Pavel Tokarev, 31.08.2021
 */

public class Palindrome {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(isPalindrome(scanner.nextLong()));
  }

  private static boolean isPalindrome(long number) {
    long temp = number;
    long result = 0;

    while (temp != 0) {
      result = result * 10 + temp % 10;
      temp /= 10;
    }

    return result == number;
  }
}
