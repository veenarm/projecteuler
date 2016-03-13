package me.jrkr.euler;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 * My solution - used ICU4J, I couldn't get them to output the 'and' so had to hard wire it for this solution.
 * removed all empty space and dashes
 */
public class Problem17 extends BaseProblem {

    public Problem17() {
        int lengthTotal = 0;
        for (int i = 1; i <= 1000; i++) {
            lengthTotal += numberToString(i).length();
        }
        result = lengthTotal;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Problem17();
    }

    private String numberToString(int number) {
        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(new Locale("EN", "AU"), RuleBasedNumberFormat.SPELLOUT);
        String result = ruleBasedNumberFormat.format(number).replace(" ", "").replace("-", "");
        if (result.contains("hundred") && !result.endsWith("hundred")) {
            result = result.replace("hundred", "hundredand");
        }
        return result;
    }
}
