package com.github.tartakynov.cartoshka.tree.entities;

import com.github.tartakynov.cartoshka.exceptions.CartoshkaException;
import com.github.tartakynov.cartoshka.scanners.TokenType;

public abstract class Literal extends Expression {
    @Override
    public Literal ev() {
        return this;
    }

    public Literal operate(TokenType operator, Literal operand) {
        throw new CartoshkaException(String.format("Operator [%s] cannot be applied to given operands", operator.getStr()));
    }

    public Literal operate(TokenType operator) {
        String operandType = this.getClass().getSimpleName().toLowerCase();
        throw new CartoshkaException(String.format("Operator [%s] cannot be applied to %s", operator.getStr(), operandType));
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isColor() {
        return false;
    }

    public boolean isDimension() {
        return false;
    }

    public boolean isKeyword() {
        return false;
    }

    public boolean isNumeric() {
        return false;
    }

    public boolean isQuoted() {
        return false;
    }

    public boolean hasDot() {
        return false;
    }

    public boolean isMulti() {
        return false;
    }

    public Double toNumber() {
        return null;
    }

    @Override
    public abstract String toString();

    public boolean isURL() {
        return false;
    }
}