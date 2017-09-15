package br.com.luciano.sample.url;

import br.com.luciano.sample.url.value.HostValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Host extends CompositeBuilder {

    private List<HostLeaf> hostLeaves;

    private Boolean wwwAdded;

    private Host() {
        this.hostLeaves = new ArrayList<>();
        this.wwwAdded = Boolean.FALSE;
    }

    public static Host init() {
        return new Host();
    }

    public Host add(HostLeaf hostLeaf) {
        this.hostLeaves.add(hostLeaf);
        return this;
    }

    public final Host subDomain(HostValue hostValue) {
        this.hostLeaves.add(HostLeaf.init().add(hostValue));
        return this;
    }

    public final Host subDomain(String subdomain) {
        this.hostLeaves.add(HostLeaf.init().add(subdomain));
        return this;
    }

    public final Host www() {
        this.hostLeaves.add(0, HostLeaf.init().add(HostValue.WWW));
        this.wwwAdded = Boolean.TRUE;
        return this;
    }

    public final Host domain(String domain) {
        if (wwwAdded) {
            this.hostLeaves.add(1, HostLeaf.init().add(domain));
        } else {
            this.hostLeaves.add(0, HostLeaf.init().add(domain));
        }
        return this;
    }


    @Override
    public String toString() {
        StringBuilder hostStringBuilder = new StringBuilder();
        Iterator<HostLeaf> hostLeafIterator = this.hostLeaves.iterator();
        while(hostLeafIterator.hasNext()) {
            hostStringBuilder.append(hostLeafIterator.next().toString());
            if (hostLeafIterator.hasNext()) {
                hostStringBuilder.append(".");
            }
        }

        return  hostStringBuilder.toString();
    }
}
