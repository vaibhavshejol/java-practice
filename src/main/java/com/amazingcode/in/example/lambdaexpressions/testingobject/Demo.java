package com.amazingcode.in.example.lambdaexpressions.testingobject;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Demo {
    public static void main(String []args){

        Predicate<Integer> isGreaterThan10 = i -> i > 10;

        // IntPredicate isGreaterThan10 = i -> i > 10;
        // LongPredicate isGreaterThan10 = i -> i > 10;
        // DoublePredicate isGreaterThan10 = i -> i > 10;

        boolean result = isGreaterThan10.test(21);
        // boolean result = isGreaterThan10.test(21L);
        // boolean result = isGreaterThan10.test(21.0);

        //===============================================================================================

        // BiPredicate<String, Integer> isOfLength = (word, length) -> word.length() == length;

        // boolean result = isOfLength.test("Vaibhav", 7);

        System.out.println(result);
    }
}
