package br.com.luciano.sample.url;

public class Seis extends LeafOperacao {

    private Seis() {
        super(6);
    }

    public static Seis inicio() {
        return new Seis();
    }
}
