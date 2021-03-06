package me.jrkr.euler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 extends BaseProblem {

    public Problem5() {
        boolean evenly_divisible = false;
        int updated = 2520; // divis by 1-10.
        while (evenly_divisible == false) {
            updated += 5;

            if (isDivisibleByOneToTwenty(updated)) {
                evenly_divisible = true;
            }
        }
        result = updated;
        System.out.println(result);
    }
    public static void main(String[] args) {
        new Problem5();
    }

    private boolean isDivisibleByOneToTwenty(int val) {
        for (int i = 1; i <= 20; i++) {
            if (val % i != 0) {
                return false;
            }
        }
        return true;
    }
}
