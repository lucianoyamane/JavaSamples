package br.com.luciano.sample.url;

public class Quatro extends LeafOperacao {

    private Quatro() {
        super(4);
    }

    public static Quatro inicio() {
        return new Quatro();
    }
}
