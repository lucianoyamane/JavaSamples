package br.com.luciano.sample.url;

public class Nove extends LeafOperacao {

    private Nove() {
        super(9);
    }

    public static Nove inicio() {
        return new Nove();
    }
}
