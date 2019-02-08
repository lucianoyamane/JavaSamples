package br.com.luciano.sample.url;

public class Oito extends LeafOperacao {

    private Oito() {
        super(8);
    }

    public static Oito inicio() {
        return new Oito();
    }
}
