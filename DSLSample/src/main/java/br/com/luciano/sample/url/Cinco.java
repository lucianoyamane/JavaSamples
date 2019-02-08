package br.com.luciano.sample.url;

public class Cinco extends LeafOperacao {

    private Cinco() {
        super(5);
    }

    public static Cinco inicio() {
        return new Cinco();
    }
}
