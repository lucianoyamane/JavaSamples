package br.com.luciano.compositeexample;

public class ComponentLeaf implements Component {

    public void desenhar(String text) {
        System.out.print(" Leaf " + text + " \n");
    }

    private ComponentLeaf() {

    }

    public static ComponentLeaf init() {
        return new ComponentLeaf();
    }
}
