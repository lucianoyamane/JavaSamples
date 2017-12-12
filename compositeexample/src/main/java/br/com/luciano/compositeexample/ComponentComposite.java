package br.com.luciano.compositeexample;

import java.util.ArrayList;
import java.util.List;

public class ComponentComposite implements Component {

    private List<Component> componentList;

    private ComponentComposite() {
        this.componentList = new ArrayList<Component>();
    }

    public static ComponentComposite init() {
        return new ComponentComposite();
    }

    public void desenhar(String text) {
        System.out.print(" Composite " + text +" \n");
        for (Component component :
                componentList) {
            component.desenhar(text);
        }
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }
}
