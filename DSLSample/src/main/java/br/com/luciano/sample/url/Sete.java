package br.com.luciano.sample.url;

public class Sete extends LeafOperacao {

    private Sete() {
        super(7);
    }

    public static Sete inicio() {
        return new Sete();
    }
}
