package br.com.luciano.sample.url;

public class Tres extends LeafOperacao {

    private Tres() {
        super(3);
    }

    public static Tres inicio() {
        return new Tres();
    }
}
