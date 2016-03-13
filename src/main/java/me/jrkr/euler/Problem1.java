package me.jrkr.euler;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Answered 12-03-16 - 233168
 */
public class Problem1 extends BaseProblem {

    public Problem1() {
        doOldWay();
        doNewWay();
    }

    // Java 8 - Streams/Lambdas
    private void doNewWay() {
        result = IntStream.range(1, 1000).filter(i -> (i % 3 == 0) || (i % 5 == 0)).sum();
        System.out.println(result);
    }

    private void doOldWay() {
        int add = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                add += i;
            }
        }
        System.out.println(add);
    }

    public static void main(String[] args) {
        new Problem1();
    }
}
