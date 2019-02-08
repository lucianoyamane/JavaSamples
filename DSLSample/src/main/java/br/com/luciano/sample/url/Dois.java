package br.com.luciano.sample.url;

public class Dois extends LeafOperacao {

    private Dois() {
        super(2);
    }

    public static Dois inicio() {
        return new Dois();
    }

}
