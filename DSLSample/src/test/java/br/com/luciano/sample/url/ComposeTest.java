package br.com.luciano.sample.url;

import org.junit.Assert;
import org.junit.Test;

public class ComposeTest {

    @Test
    public void somaDoisMaisDois() {
        Integer resultado = Soma
                            .inicio()
                                .dois()
                                .dois()
                            .fim()
                        .calcula();
        Integer esperado = 4;
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void multiplicaDoisVezesDois() {
        Integer resultado = Multiplicacao
                                .inicio()
                                    .dois()
                                    .dois()
                                .fim()
                            .calcula();
        Integer esperado = 4;
        Assert.assertEquals(esperado, resultado);
    }


    @Test
    public void multiplicaoComSoma() {
        Integer resultado = Multiplicacao
                                .inicio()
                                    .soma()
                                        .dois()
                                        .dois()
                                    .fim()
                                    .soma()
                                        .tres()
                                        .tres()
                                    .fim()
                                .fim()
                            .calcula();
        Integer esperado = 24;
        Assert.assertEquals(esperado, resultado);
    }

    //((2 + 3) * 3) + (5 * 3)
    @Test
    public void equacaoDificil() {
        Integer resultado = Multiplicacao
                                .inicio()
                                    .soma()
                                        .multiplicacao()
                                            .tres()
                                            .soma()
                                                .dois()
                                                .tres()
                                            .fim()
                                        .fim()
                                        .multiplicacao()
                                            .cinco()
                                            .tres()
                                        .fim()
                                    .fim()
                                .calcula();
        Integer esperado = 30;
        Assert.assertEquals(esperado, resultado);
    }
}
