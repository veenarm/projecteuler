import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * Answered 12-03-16 - 4613732
 */
public class Problem2 {

    public static void main(String[] args) {

        // Old standard way
        int[] values = new int[] {0, 1};
        int current = 0;
        int total = 0;
        do {
            current = values[0] + values[1];
            if (current % 2 == 0) {
                total += current;
            }

            values[1] = (current == 1) ? 1 : values[0];
            values[0] = current;

        } while (current <= 4000000);
        System.out.println(total);

//
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(0, 1);
//        test.stream().
//
//        // Java 8 - Streams/Lambdas
//        System.out.println(IntStream.range(1, 1000).filter(i -> (i % 3 == 0) || (i % 5 == 0)).sum());


    }

}