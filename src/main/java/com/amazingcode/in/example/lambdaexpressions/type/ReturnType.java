package com.amazingcode.in.example.lambdaexpressions.type;

import java.util.function.Supplier;

public class ReturnType {
    public static void main(String[] args) {
        // Retrieve a Runnable using a method that returns it
        Runnable runnable = createRunnable();
        runnable.run();

        // Retrieve a Supplier using a method that returns it
        Supplier<String> supplier = createSupplier("Hi Vaibhav");
        System.out.println("Supplied value: " + supplier.get());
    }

    // Method that returns a Runnable
    public static Runnable createRunnable() {
        return () -> System.out.println("Runnable created");
    }

    // Method that returns a Supplier
    public static Supplier<String> createSupplier(String str) {
        return () -> str;
    }
}
