package com.amazingcode.in.example.lambdaexpressions.type;

import java.util.function.Predicate;

public class ParameterType {
    public static void main(String[] args) {
        // Lambda as a parameter to a method
        process(() -> System.out.println("Processing task..."));

        // Lambda with a Predicate functional interface parameter
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + testPredicate(isEven, 4));
    }

    // Method that takes a Runnable as a parameter
    public static void process(Runnable task) {
        task.run();
    }

    // Method that takes a Predicate as a parameter
    public static boolean testPredicate(Predicate<Integer> predicate, int value) {
        return predicate.test(value);
    }
}

