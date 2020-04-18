package Interpreter;

import Interpreter.Expressions.DivisionExpression;
import Interpreter.Expressions.MinusExpression;
import Interpreter.Expressions.MultiplicationExpression;
import Interpreter.Expressions.PlusExpression;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            5+3-(a+((b*3-c)*d)/6
            where
            a = 1
            b = 2
            c = 4
            d = 1
        */

        var a = new Variable("a", 1f);
        var b = new Variable("b", 2f);
        var c = new Variable("c", 4f);
        var d = new Variable("d", 1f);
/*
        var expression = new PlusExpression(
                new Value(5f, (
                        new MinusExpression(3f, new DivisionExpression(
                                new PlusExpression(a, new MultiplicationExpression(
                                        new MinusExpression(new MultiplicationExpression(b, new Value(3f)), c), d)
        )Z, 6)))));*/
    }
}
