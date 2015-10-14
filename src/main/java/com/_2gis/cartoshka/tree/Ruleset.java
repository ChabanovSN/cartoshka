package com._2gis.cartoshka.tree;

import com._2gis.cartoshka.Location;
import com._2gis.cartoshka.Visitor;

import java.util.List;

public class Ruleset extends Node {
    private final List<Selector> selectors;
    private final List<Node> block;

    public Ruleset(Location location, List<Selector> selectors, List<Node> block) {
        super(location);
        this.selectors = selectors;
        this.block = block;
    }

    public List<Selector> getSelectors() {
        return selectors;
    }

    public List<Node> getBlock() {
        return block;
    }

    @Override
    public <R, P> R accept(Visitor<R, P> visitor, P params) {
        return visitor.visitRuleset(this, params);
    }
}