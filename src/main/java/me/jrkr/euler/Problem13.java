package me.jrkr.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem13 {

    public static void main(String[] args) throws IOException {
        InputStream is = Problem13.class.getResourceAsStream("Problem13.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        ArrayList<String> list = new ArrayList<>();
        br.lines().forEachOrdered(l -> list.add(l));

        BigInteger bi = new BigInteger("0");
        for (String s : list) {
            bi = bi.add(new BigInteger(s));
        }

        System.out.println(bi.toString().substring(0, 10));
    }
}