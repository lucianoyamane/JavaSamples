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
        String esperado = "?campo='value'";
        String resultado = this.queryParam.adiciona("campo", "value").toString();

        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testAdicionaDoisParametro() {
        String esperado = "?campo='value'&campo2='valor2'";
        String resultado = this.queryParam
                                    .adiciona("campo", "value")
                                    .adiciona("campo2", "valor2")
                                    .toString();

        Assert.assertEquals(esperado, resultado);
    }

}
