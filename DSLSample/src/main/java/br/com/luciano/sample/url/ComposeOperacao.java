package br.com.luciano.sample.url;

import java.util.ArrayList;
import java.util.List;

public abstract class ComposeOperacao implements Operacao {

    protected List<Operacao> operacoes;
    protected ComposeOperacao operacaoPai;

    protected ComposeOperacao() {
        this.operacoes = new ArrayList<>();
    }

    protected ComposeOperacao(ComposeOperacao operacaoPai) {
        this.operacoes = new ArrayList<>();
        this.operacaoPai = operacaoPai;
    }


    public ComposeOperacao soma() {
        Soma soma = Soma.inicio(this);
        this.operacoes.add(soma);
        return soma;
    }

    public ComposeOperacao multiplicacao() {
        Multiplicacao multiplicacao = Multiplicacao.inicio(this);
        this.operacoes.add(multiplicacao);
        return multiplicacao;
    }

    public ComposeOperacao um() {
        this.operacoes.add(Um.inicio());
        return this;
    }

    public ComposeOperacao dois() {
        this.operacoes.add(Dois.inicio());
        return this;
    }

    public ComposeOperacao tres() {
        this.operacoes.add(Tres.inicio());
        return this;
    }

    public ComposeOperacao quatro() {
        this.operacoes.add(Quatro.inicio());
        return this;
    }

    public ComposeOperacao cinco() {
        this.operacoes.add(Cinco.inicio());
        return this;
    }

    public ComposeOperacao seis() {
        this.operacoes.add(Seis.inicio());
        return this;
    }

    public ComposeOperacao sete() {
        this.operacoes.add(Sete.inicio());
        return this;
    }

    public ComposeOperacao oito() {
        this.operacoes.add(Oito.inicio());
        return this;
    }

    public ComposeOperacao nove() {
        this.operacoes.add(Nove.inicio());
        return this;
    }

    public ComposeOperacao zero() {
        this.operacoes.add(Zero.inicio());
        return this;
    }

    public ComposeOperacao fim() {
        if (this.operacaoPai != null) {
            return this.operacaoPai;
        }
        return this;
    }


}
