package br.com.luciano.sample.url;

import java.util.ArrayList;
import java.util.List;

public class QueryParam extends CompositeBuilder {

    private List<LeafBuilder> leafBuilders;

    private QueryParam() {
        this.leafBuilders = new ArrayList<LeafBuilder>();
    }

    public static QueryParam init() {
        return new QueryParam();
    }

    public QueryParam adiciona(String campo, String valor) {
        this.leafBuilders.add(Parametro.init().adiciona(campo, valor));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder queryParamBuilder = new StringBuilder();
        if (this.leafBuilders.size() > 0) {
            queryParamBuilder.append("?");
            for(LeafBuilder leafBuilder : this.leafBuilders) {
                queryParamBuilder.append(leafBuilder.toString());
            }
        }
        return queryParamBuilder.toString();
    }
}
