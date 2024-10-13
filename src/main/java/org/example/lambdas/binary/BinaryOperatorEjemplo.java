package org.example.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorEjemplo {
    public static void main(String[] args) {
        /*
         * Recibe dos valores del mismo tipo y retorna un valor del mismo tipo.
         */
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int result = binaryOperator.apply(10, 20);
        System.out.println(result);
    }
}
