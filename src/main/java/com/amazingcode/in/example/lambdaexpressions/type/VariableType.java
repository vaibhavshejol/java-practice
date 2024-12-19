package com.amazingcode.in.example.lambdaexpressions.type;

import java.util.function.Consumer;

public class VariableType {
    public static void main(String[] args) {
        // Assigning lambda to a variable of a functional interface type
        Runnable runnable = () -> System.out.println("Running task");
        
        // Another example with a Consumer functional interface
        Consumer<String> consumer = message -> System.out.println("Consumed: " + message);

        // Invoking the functional interface methods
        runnable.run();
        consumer.accept("Hello, Lambda!");
    }
}
