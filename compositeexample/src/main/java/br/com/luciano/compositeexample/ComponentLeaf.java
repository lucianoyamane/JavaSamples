package br.com.luciano.compositeexample;

public class ComponentLeaf implements Component {

    private String leafText;

    public void desenhar(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Leaf ").append(text);
        if (leafText != null) {
            stringBuilder.append(" ").append(leafText).append(" ");
        }
        stringBuilder.append(" \n");

        System.out.print(stringBuilder.toString());
    }

    public final ComponentLeaf addLeafText(String leafText) {
        this.leafText = leafText;
        return this;
    }

    private ComponentLeaf() {

    }

    public static ComponentLeaf init() {
        return new ComponentLeaf();
    }
}
