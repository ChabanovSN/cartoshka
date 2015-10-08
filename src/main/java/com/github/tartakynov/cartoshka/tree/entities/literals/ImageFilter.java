package com.github.tartakynov.cartoshka.tree.entities.literals;

import com.github.tartakynov.cartoshka.tree.entities.Literal;

public class ImageFilter extends Literal {
    private final String name;

    private final MultiLiteral args;

    public ImageFilter(String name, MultiLiteral args) {
        this.name = name;
        this.args = args;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", name, args.toString());
    }

    @Override
    public boolean isImageFilter() {
        return true;
    }

    public String getName() {
        return name;
    }

    public MultiLiteral getArgs() {
        return args;
    }
}