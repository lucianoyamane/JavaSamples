package br.com.luciano.sample.url.dsl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecisionTest {

    private Decision decision;

    @Before
    public void before() {
        decision = Decision.init();
    }

    @Test
    public void testDoItString() {

        decision.when(1 == 1).doIt("true").otherwise("false");
        String resultado = decision.toString();
        Assert.assertEquals("true", resultado);
    }

    @Test
    public void testOtherWiseString() {
        decision.when(1 == 2).doIt("true").otherwise("false");
        String resultado = decision.toString();
        Assert.assertEquals("false", resultado);
    }

    @Test
    public void testOnlyDoItTrue() {
        decision.when(1 == 1).doIt("true");
        String resultado = decision.toString();
        Assert.assertEquals("true", resultado);
    }

    @Test
    public void testOnlyDoItFalse() {
        decision.when(1 == 2).doIt("true");
        String resultado = decision.toString();
        Assert.assertNull(resultado);
    }
}
