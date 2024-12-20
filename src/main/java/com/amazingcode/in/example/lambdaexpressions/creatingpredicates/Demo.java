package com.amazingcode.in.example.lambdaexpressions.creatingpredicates;

import java.util.function.Predicate;

public class Demo {
    public static void main(String []args){

        Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");

        String str = "Duke";
        boolean result = isEqualToDuke.test(str);
        System.out.println("Is string is equal to \"Duke\" = "+result);

        //===========================================================================

        Predicate<String> isNotEqualToDuke = Predicate.not(isEqualToDuke);

        boolean result2 = isNotEqualToDuke.test(str);
        System.out.println("Is string is not equal to \"Duke\" = "+result2);
    }
}
