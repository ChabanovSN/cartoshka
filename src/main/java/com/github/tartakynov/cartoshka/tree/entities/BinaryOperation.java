package com.github.tartakynov.cartoshka.tree.entities;

import com.github.tartakynov.cartoshka.scanners.TokenType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BinaryOperation extends Expression {
    private final TokenType operator;

    private final Expression left;

    private final Expression right;

    public BinaryOperation(TokenType operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression ev() {
        throw new NotImplementedException();
    }
}
