package com._2gis.cartoshka.tree.entities;

import com._2gis.cartoshka.Location;
import com._2gis.cartoshka.Visitor;

public class Field extends Expression {
    private final String name;

    public Field(Location location, String name) {
        super(location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public <R, P> R accept(Visitor<R, P> visitor, P params) {
        return visitor.visitFieldExpression(this, params);
    }
}