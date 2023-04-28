/**
 * A factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 */
public class Main {

  /**
   * The factorial is great candidate for a recursion, so let's start with it.
   *
   * Following the definition above and adding the check for n <= 1 as base case, all we have to do is
   * multiply the current n with the result of the factorial with input n-1
   *
   * Time Complexity O(n)
   * Space Complexity O(n)
   */
  public static long factorialV1(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Invalid input");
    } else if (n <= 1) {
      return 1; // base case
    }

    return n * factorialV1(n - 1);
  }

  /**
   * The second version will be an iterative one that could be implemented using while/for/do-while.
   * We'll choose for in this challenge.
   *
   * All we have to do is start from n and multiply with all the numbers less than it until we reach 2 (inclusive) as multiplying by 1 is a waste of operation.
   *
   * We have to be careful with the input and set a limit to the input accordingly for both this version and the one above, if we expect
   * to calculate bigger factorials. Factorial of 13 produces a value exceeding the integer limit: 6227020800.
   *
   * Time Complexity O(n)
   * Space Complexity O(1)
   */
  public static long factorialV2(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Invalid input");
    }

    long result = 1;

    for (int i = n; i >= 2; i--) {
      result *= i;
    }

    return result;
  }
}
