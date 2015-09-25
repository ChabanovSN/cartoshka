package com.github.tartakynov.cartoshka.tree.entities;

public class Keyword extends Expression {
    private final String value;

    public Keyword(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Expression ev() {
        return this;
    }
}
