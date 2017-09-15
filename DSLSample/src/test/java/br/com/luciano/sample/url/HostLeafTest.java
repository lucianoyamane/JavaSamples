package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.HostValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HostLeafTest  {

    private HostLeaf hostLeaf;

    @Before
    public void before() {
        this.hostLeaf = HostLeaf.init();
    }

    @Test
    public void testEmpty() {
        String expected = "";
        String current = this.hostLeaf.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAdd() {
        String expected = "www";
        String current = this.hostLeaf
                                .add(HostValue.WWW)
                            .toString();
        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddString() {
        String expected = "text";
        String current = this.hostLeaf
                .add("text")
                .toString();
        Assert.assertEquals(expected, current);
    }

}
