package com._2gis.cartoshka.tree;

import com._2gis.cartoshka.Feature;
import com._2gis.cartoshka.Location;

public class Element extends Node implements Evaluable<Boolean> {
    private final String value;
    private final ElementType type;

    public Element(Location location, String value, ElementType type) {
        super(location);
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public ElementType getType() {
        return type;
    }

    public Boolean ev(Feature feature) {
        switch (getType()) {
            case CLASS:
                if (feature.getClasses().contains(value)) {
                    return true;
                }

                break;

            case ID:
                if (value.equals(feature.getLayer())) {
                    return true;
                }

                break;

            case WILDCARD:
                return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public void fold() {
    }

    public enum ElementType {
        MAP,
        ID,
        CLASS,
        WILDCARD
    }
}
