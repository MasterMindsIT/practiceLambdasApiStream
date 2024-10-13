package org.example.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerEjemplo {
    public static void main(String[] args) {
        /*
         * Recibe un valor y no retorna nada.
         */

        Consumer<String> consumer = System.out::print;
        consumer.accept("Santiago");
    }
}