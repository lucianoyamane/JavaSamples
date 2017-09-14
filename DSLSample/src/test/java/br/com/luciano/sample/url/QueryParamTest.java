package br.com.luciano.sample.url;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueryParamTest {

    private QueryParam queryParam;


    @Before
    public void before() {
        this.queryParam = QueryParam.init();
    }

    @Test
    public void testAdicionaParametro() {
        String esperado = "?campo='valor'";
        String resultado = this.queryParam.adiciona("campo", "valor").toString();

        Assert.assertEquals(esperado, resultado);
    }

}
