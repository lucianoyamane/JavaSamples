package br.com.luciano.sample.url.dsl;

import br.com.luciano.sample.url.QueryParam;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecisaoTest {

    private Decision decision;

    @Before
    public void before() {
        decision = Decision.init();
    }

    @Test
    public void testDoIt() {

        decision.when(1 == 1).doIt("true").otherwise("false");
        String resultado = decision.toString();
        Assert.assertEquals("true", resultado);
    }

    @Test
    public void testOtherWise() {
        decision.when(1 == 2).doIt("true").otherwise("false");
        String resultado = decision.toString();
        Assert.assertEquals("false", resultado);
    }
}
