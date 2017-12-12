package br.com.luciano.sample.url;

import java.util.ArrayList;
import java.util.List;

public class PathParam extends CompositeBuilder{

    private List<LeafBuilder> leafBuilders;

    private PathParam() {
        this.leafBuilders = new ArrayList<>();
    }

    public static PathParam init() {
        return new PathParam();
    }

    public PathParam adiciona(String valor) {
        this.leafBuilders.add(Parametro.init().adiciona(valor));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder pathParamBuilder = new StringBuilder();
        for(LeafBuilder leafBuilder : this.leafBuilders) {
            pathParamBuilder.append("/");
            pathParamBuilder.append(leafBuilder.toString());
        }

        return pathParamBuilder.toString();
    }
}
