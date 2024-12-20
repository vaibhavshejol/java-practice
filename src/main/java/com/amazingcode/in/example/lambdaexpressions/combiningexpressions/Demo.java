package com.amazingcode.in.example.lambdaexpressions.combiningexpressions;

import java.util.Objects;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Demo {
    public static void main(String []args){

        Predicate<String> predicate = s -> (s != null) && !s.isEmpty() && s.length() < 5;

        System.out.println("Is string is not null, not empty and shorter than 5 = "+predicate.test("Vaibhav"));
        
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        Predicate<String> predicate2 = nonNull.and(nonEmpty).and(shorterThan5);

        System.out.println("Is string is not null, not empty and shorter than 5 = "+predicate2.test("VRS"));

        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();

        Predicate<String> predicate3 = isNotNullNorEmpty.and(shorterThan5);

        System.out.println("Is string is not null, not empty and shorter than 5 = "+predicate3.test("VRS"));

        //=================================================================================================

        // IntUnaryOperator multiplyByTwo = x -> x * 2;
        // IntUnaryOperator addThree = x -> x + 3;

        // IntUnaryOperator combinedFunction = multiplyByTwo.andThen(addThree);

        // int result = combinedFunction.applyAsInt(5); // (5 * 2) + 3 = 13
        // System.out.println(result);

        //=============================================================================================

        IntUnaryOperator multiplyByTwo = x -> x * 2;
        IntUnaryOperator addThree = x -> x + 3;

        IntUnaryOperator combinedFunction = multiplyByTwo.compose(addThree);

        int result = combinedFunction.applyAsInt(5); // (5 + 3) * 2 = 16
        System.out.println(result);
    }
}
