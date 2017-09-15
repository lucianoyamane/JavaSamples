package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.HostValue;

public class HostLeaf extends LeafBuilder {

    public HostValue hostValue;

    public String hostText;

    private HostLeaf() {

    }

    public static HostLeaf init() {
        return new HostLeaf();
    }

    public final HostLeaf add(HostValue hostValue) {
        this.hostValue = hostValue;
        return this;
    }

    public final HostLeaf add(String hostText) {
        this.hostText = hostText;
        return this;
    }

    @Override
    public String toString() {
        if (this.hostText != null) {
            return hostText;
        }
        if (this.hostValue != null) {
            return this.hostValue.toString();
        }
        return "";
    }
}
