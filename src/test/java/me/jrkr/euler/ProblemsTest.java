package me.jrkr.euler;


import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ProblemsTest {


    @Test
    public void testProblems() throws IOException {
        Assert.assertEquals(233168, new Problem1().result);
        Assert.assertEquals(4613732, new Problem2().result);
        // problem 3 not solved
        Assert.assertEquals(232792560, new Problem5().result);
        Assert.assertEquals(25164150, new Problem6().result);
        Assert.assertEquals(104743, new Problem7().result);

        Assert.assertEquals("5537376230", new Problem13().stringResult);
        Assert.assertEquals(21124, new Problem17().result);
        Assert.assertEquals(871198282, new Problem22().result);

    }

}
