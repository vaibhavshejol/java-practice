package com.amazingcode.in.example.lambdaexpressions.consumingobject;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Demo {
    public static void main(String []args){

        Random random = new Random();
        Supplier<Integer> newRandom = () -> random.nextInt(10);
        // IntSupplier newRandom = () -> random.nextInt();
        // LongSupplier newRandom = () -> random.nextLong();
        // DoubleSupplier newRandom = () -> random.nextDouble();

        Consumer<String> printer = s -> System.out.println(s);
        
        // IntConsumer printer = s -> System.out.println(s);
        // LongConsumer printer = s -> System.out.println(s);
        // DoubleConsumer printer = s -> System.out.println(s);
        
        for (int i = 0; i < 5; i++) {

            int nextRandom = newRandom.get();
            printer.accept("next random = " + nextRandom);

            // printer.accept(nextRandom);
        }
    }
}
