package org.example.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerEjemplo {
    public static void main(String[] args) {
        /*
         * Recibe dos valores y no retorna nada.
         */
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hola", "Mundo");
    }
}
