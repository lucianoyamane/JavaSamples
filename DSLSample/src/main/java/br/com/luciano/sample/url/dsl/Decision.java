package br.com.luciano.sample.url.dsl;

import br.com.luciano.sample.url.Builder;

public class Decision {

    private Boolean decision;

    private String stringDoIt;

    private String stringOtherWise;

    private Decision(){

    }

    public static Decision init() {
        return new Decision();
    }

    public Decision when(Boolean decision) {
        this.decision = decision;
        return this;
    }

    public Decision doIt(String doIt) {
        this.stringDoIt = doIt;
        return this;
    }

    public Decision otherwise(String otherwise) {
        this.stringOtherWise = otherwise;
        return this;
    }

    @Override
    public String toString() {
        if (this.decision) {
            return this.stringDoIt;
        }
        return this.stringOtherWise;
    }
}
