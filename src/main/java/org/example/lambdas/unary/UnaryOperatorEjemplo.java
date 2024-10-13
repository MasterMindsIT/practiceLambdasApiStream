package org.example.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorEjemplo {
    public static void main(String[] args) {
        /*
         * Recibe un valor, lo procesa y devuelve un resultado del mismo tipo.
         */
        UnaryOperator<Integer> unaryOperator = number -> number * number;
        int result = unaryOperator.apply(5);
        System.out.println(result);

    }
}
