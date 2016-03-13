package me.jrkr.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * What is the total of all the name scores in the file?
 */
public class Problem22 extends BaseProblem {

    public Problem22() throws IOException {
        InputStream is = Problem22.class.getResourceAsStream("Problem22.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String readLine = br.readLine().replaceAll("\"", "");
        StringTokenizer st = new StringTokenizer(readLine, ",");
        List<String> names = new ArrayList<>();
        while (st.hasMoreElements()) {
            names.add(st.nextToken());
        }
        names.sort(String::compareTo);
        for (int i = 0; i < names.size(); i++) { // + 1 to numbers
            result += getWordValue(names.get(i)) * (i + 1);
        }
        System.out.println(result);
    }

    private int getWordValue(String input) {
        int result = 0;
        if (input == null || input.isEmpty()) return result;
        for (int i = 0; i < input.length(); i++) result +=  getAlphabetValue(input.substring(i, i + 1));
        return result;
    }

    private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private int getAlphabetValue(String input) {
        return ALPHABET.indexOf(input.toLowerCase()) + 1;
    }

    public static void main(String[] args) throws IOException {
        new Problem22();
    }
}
