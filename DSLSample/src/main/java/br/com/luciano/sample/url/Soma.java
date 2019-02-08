package br.com.luciano.sample.url;

public class Soma extends ComposeOperacao {


    private Soma() {
        super();
    }

    private Soma(ComposeOperacao operacaoPai) {
        super(operacaoPai);
    }

    public static Soma inicio() {
        return new Soma();
    }

    public static Soma inicio(ComposeOperacao operacaoPai) {
        return new Soma(operacaoPai);
    }

    @Override
    public Integer calcula() {

        Integer resultado = 0;

        for(Operacao operacao : this.operacoes) {
            resultado += operacao.calcula();
        }
        return resultado;
    }

}
