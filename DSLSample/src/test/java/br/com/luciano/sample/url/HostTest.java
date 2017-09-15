package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.HostValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HostTest {

    private Host host;

    @Before
    public void before() {
        this.host = Host.init();
    }

    @Test
    public void testAddLeaf() {
        this.host
                .add(HostLeaf.init().add("host_test"));

        String expected = "host_test";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddWWWDomain() {
        this.host
                .www()
                .domain("domain");

        String expected = "www.domain";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddWWWDomainOutOfOrder() {
        this.host
                .domain("domain")
                .www();

        String expected = "www.domain";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddWWWDomainSubDomainsOutOfOrder() {
        this.host
                .subDomain(HostValue.COM)
                .subDomain(HostValue.EDU)
                .domain("domain")
                .www();

        String expected = "www.domain.com.edu";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddSubDomain() {
        this.host
                .www()
                .domain("domain")
                .subDomain(HostValue.COM)
                .subDomain(HostValue.EDU);

        String expected = "www.domain.com.edu";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testAddSubDomainText() {
        this.host
                .www()
                .domain("domain")
                .subDomain("subdomain");

        String expected = "www.domain.subdomain";
        String current = this.host.toString();

        Assert.assertEquals(expected, current);
    }
}
