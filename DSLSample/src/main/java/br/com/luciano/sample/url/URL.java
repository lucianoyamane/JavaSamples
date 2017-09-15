package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.SchemeValue;

/**
 * <scheme></>://<host>:<port>/<path>?<searchpart>
 *
 */
public class URL extends CompositeBuilder {

    private SchemeValue schemeValue;
    private Boolean www;
    private String dominio;
    private String subDominio;

    private URL() {

    }

    public static URL init() {
        return new URL();
    }

    public URL http() {
        this.schemeValue = SchemeValue.HTTP;
        return this;
    }

    public URL https() {
        this.schemeValue = SchemeValue.HTTPS;
        return this;
    }

    public URL www() {
        this.www = Boolean.TRUE;
        return this;
    }

    public URL dominio(String dominio) {
        this.dominio = dominio;
        return this;
    }

    public URL subDominio(String subDominio) {
        this.subDominio = subDominio;
        return this;
    }
}
