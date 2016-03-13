package me.jrkr.euler;

import java.util.stream.IntStream;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 extends BaseProblem {

    public Problem6() {
        int sumTimes = IntStream.rangeClosed(1, 100).map(i -> i * i).sum();
        int sumAddition = IntStream.rangeClosed(1, 100).sum();

//        int sumTimes = 0;
//        int sumAddition = 0;
//        for (int i = 1; i <= 100; i++) {
//            sumTimes += i * i;
//            sumAddition += i;
//        }
        result = sumAddition * sumAddition - sumTimes;
        System.out.println(result);




    }

    public static void main(String[] args) {
        new Problem6();
    }

}
