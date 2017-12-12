package br.com.luciano.compositeexample;

public class Test {

    public static void main(String[] args) {
        ComponentComposite componentComposite = ComponentComposite.init();
        componentComposite.addComponent(ComponentLeaf.init().addLeafText("first"));
        componentComposite.addComponent(ComponentLeaf.init().addLeafText("second"));
        componentComposite.addComponent(ComponentLeaf.init());

        ComponentComposite finalComponent = ComponentComposite.init();
        finalComponent.addComponent(componentComposite);
        finalComponent.addComponent(ComponentLeaf.init());

        finalComponent.desenhar("Resultado");
    }
}
