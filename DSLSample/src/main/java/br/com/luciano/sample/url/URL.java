package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.SchemeValue;

/**
 * <scheme></>://<host>:<port>/<path>?<searchpart>
 *
 */
public class URL extends CompositeBuilder {

    private SchemeValue schemeValue;
    private Host host;


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

    public URL host(Host host) {
        this.host = host;
        return this;
    }


    @Override
    public String toString() {
        StringBuilder urlStringBuilder = new StringBuilder();
        if (this.schemeValue != null) {
            urlStringBuilder.append(this.schemeValue.toString());
        }
        if (this.host != null) {
            urlStringBuilder.append(this.host.toString());
        }
        return urlStringBuilder.toString();
    }
}
