package me.jrkr.euler;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Answered 12-03-16 - 233168
 */
public class Problem1 {

    public static void main(String[] args) {

        // Old standard way
        int add = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                add += i;
            }
        }

        // Java 8 - Streams/Lambdas
        System.out.println(IntStream.range(1, 1000).filter(i -> (i % 3 == 0) || (i % 5 == 0)).sum());
    }
}
