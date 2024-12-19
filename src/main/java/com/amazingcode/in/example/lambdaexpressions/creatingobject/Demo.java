package com.amazingcode.in.example.lambdaexpressions.creatingobject;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        // IntSupplier newRandom = () -> random.nextInt();
        // LongSupplier newRandom = () -> random.nextLong();
        // DoubleSupplier newRandom = () -> random.nextDouble();
        // BooleanSupplier newRandom = () -> random.nextBoolean();

        for (int index = 0; index < 5; index++) {

            System.out.println(newRandom.get());

            // System.out.println(newRandom.getAsInt());
            // System.out.println(newRandom.getAsLong());
            // System.out.println(newRandom.getAsDouble());
            // System.out.println(newRandom.getAsBoolean());
        }

    }
}
