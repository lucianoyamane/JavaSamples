package br.com.luciano.sample.url.value;

public enum HostValue {

    WWW("www"),
    COM("com"),
    EDU("edu"),
    ORG("org"),
    GOV("gov"),
    BR("br");

    private String value;

    HostValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
