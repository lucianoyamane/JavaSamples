package br.com.luciano.sample.url;

public class Multiplicacao extends ComposeOperacao {

    private Multiplicacao() {
        super();
    }

    private Multiplicacao(ComposeOperacao operacaoPai) {
        super(operacaoPai);
    }

    public static Multiplicacao inicio() {
        return new Multiplicacao();
    }

    public static Multiplicacao inicio(ComposeOperacao operacaoPai) {
        return new Multiplicacao(operacaoPai);
    }

    @Override
    public Integer calcula() {
        Integer resultado = 1;

        for(Operacao operacao : this.operacoes) {
            resultado = resultado * operacao.calcula();
        }
        return resultado;
    }
}
