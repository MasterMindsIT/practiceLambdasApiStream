package org.example.lambdas.function;

import java.util.function.Function;

public class FunctionEjemplo {
    public static void main(String[] args) {
        /*
         * Recibe un valor y retorna un resultado.
         */
        Function<Integer, String> function = num -> "El número es: " + num;

        String result = function.apply(5);
        System.out.println(result);

    }
}
