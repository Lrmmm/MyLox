package com.craftinginterpreters.lox;

import java.util.List;

abstract class Expr1 {
 static class Binary extends Expr1 {
    Binary(Expr1 left, Token operator, Expr1 right){
    this.left = left;
    this.Token = Token;
    this.Expr = Expr1;
    }

    final Expr1 left;
    final  Token operator;
    final  Expr1 right;
    }
 static class Grouping extends Expr1 {
    Grouping(Expr1 expression){
    this.expression = expression;
    }

    final Expr1 expression;
    }
 static class Literal extends Expr1 {
    Literal(Object value){
    this.value = value;
    }

    final Object value;
    }
 static class Unary extends Expr1 {
    Unary(Token operator, Expr1 right){
    this.operator = operator;
    this.Expr = Expr1;
    }

    final Token operator;
    final  Expr1 right;
    }
}
