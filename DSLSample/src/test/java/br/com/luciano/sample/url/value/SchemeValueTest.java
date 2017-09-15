package br.com.luciano.sample.url.value;

import org.junit.Assert;
import org.junit.Test;

public class SchemeValueTest {


    @Test
    public void testToString() {
        String expected = "http://";
        String current = SchemeValue.HTTP.toString();

        Assert.assertEquals(expected, current);
    }
}
