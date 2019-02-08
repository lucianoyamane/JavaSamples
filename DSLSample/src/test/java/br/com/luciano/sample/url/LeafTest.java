package br.com.luciano.sample.url;

import org.junit.Assert;
import org.junit.Test;

public class LeafTest {

    @Test
    public void testZeroCalcula() {
        Integer esperado = 0;
        Integer resultado = Zero.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testUmCalcula() {
        Integer esperado = 1;
        Integer resultado = Um.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testDoisCalcula() {
        Integer esperado = 2;
        Integer resultado = Dois.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testTresCalcula() {
        Integer esperado = 3;
        Integer resultado = Tres.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testQuatroCalcula() {
        Integer esperado = 4;
        Integer resultado = Quatro.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testCincoCalcula() {
        Integer esperado = 5;
        Integer resultado = Cinco.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testSeisCalcula() {
        Integer esperado = 6;
        Integer resultado = Seis.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testSeteCalcula() {
        Integer esperado = 7;
        Integer resultado = Sete.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testeOitoCalcula() {
        Integer esperado = 8;
        Integer resultado = Oito.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }

    @Test
    public void testeNoveCalcula() {
        Integer esperado = 9;
        Integer resultado = Nove.inicio().calcula();
        Assert.assertEquals(esperado, resultado);
    }
}
