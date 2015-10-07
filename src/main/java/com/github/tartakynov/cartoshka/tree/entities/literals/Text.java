package com.github.tartakynov.cartoshka.tree.entities.literals;

import com.github.tartakynov.cartoshka.scanners.TokenType;
import com.github.tartakynov.cartoshka.tree.entities.Literal;

public class Text extends Literal {
    private final String value;

    private final boolean isURL;

    public Text(String value, boolean isURL) {
        this.value = value;
        this.isURL = isURL;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean isText() {
        return true;
    }

    @Override
    public Literal operate(TokenType operator, Literal operand) {
        if (operator == TokenType.ADD && (operand.isNumeric() || operand.isText() || operand.isURL())) {
            return new Text(this.toString() + operand.toString(), isURL);
        }

        return super.operate(operator, operand);
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean isURL() {
        return isURL;
    }
}