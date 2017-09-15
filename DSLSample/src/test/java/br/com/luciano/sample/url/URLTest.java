package br.com.luciano.sample.url;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class URLTest {
    private URL url;

    @Before
    public void before() {
        url = URL.init();
    }

    @Test
    public void testHttp() {
        url.http();
        String expected = "http://";
        String resultado = this.url.toString();

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void testHttps() {
        url.https();
        String expected = "https://";
        String resultado = this.url.toString();

        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void testHost() {
        url
            .host(Host.init().www().domain("domain"));

        String expected = "www.domain";
        String resultado = this.url.toString();
        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void testSchemeHost() {
        url
            .http()
            .host(Host.init().www().domain("domain"));

        String expected = "http://www.domain";
        String resultado = this.url.toString();
        Assert.assertEquals(expected, resultado);
    }

    @Test
    public void testHostScheme() {
        url
                .host(Host.init().www().domain("domain"))
                .http();

        String expected = "http://www.domain";
        String resultado = this.url.toString();
        Assert.assertEquals(expected, resultado);
    }

}
