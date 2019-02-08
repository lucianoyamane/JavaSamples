package br.com.luciano.sample.url;

public class Zero extends LeafOperacao {

    private Zero() {
        super(0);
    }

    public static Zero inicio() {
        return new Zero();
    }
}
