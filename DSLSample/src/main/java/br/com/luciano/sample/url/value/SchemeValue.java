package br.com.luciano.sample.url.value;

public enum SchemeValue {

    HTTP("http"),
    HTTPS("https"),
    FTP("ftp"),
    FILE("file");

    private String valor;

    private SchemeValue(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.valor;
    }

}
