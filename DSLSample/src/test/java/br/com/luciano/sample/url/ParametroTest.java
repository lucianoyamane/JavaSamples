package br.com.luciano.sample.url;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParametroTest {

    private Parametro parametro;

    @Before
    public void before() {
        parametro = Parametro.init();
    }

    @Test
    public void testEstruturaBasicaCampoValor() {
        String esperado = "campo='value'";
        String resultado = parametro.adiciona("campo", "value").toString();

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testEstruturaBasicaCampoValorInteger() {
        String esperado = "campo='999'";
        String resultado = parametro.adiciona("campo", 999).toString();

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testEstruturaBasicaCampo() {
        String esperado = "value";
        String resultado = parametro.adiciona("value").toString();

        Assert.assertEquals(esperado, resultado);

    }

    @Test
    public void testEstruturaBasicaCampoInteger() {
        String esperado = "999";
        String resultado = parametro.adiciona(999).toString();

        Assert.assertEquals(esperado, resultado);

    }
}
