package br.com.luciano.sample.url;

public abstract class LeafOperacao implements Operacao {

    private Integer valor;

    protected LeafOperacao(Integer valor){
        this.valor = valor;
    }

    @Override
    public Integer calcula() {
        return valor;
    }
}
