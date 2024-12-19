package com.amazingcode.in.example.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Demo {
    public static void main(String []args){

        ToIntFunction<String> boundMethodReference = s -> s.length(); // Bound to the specific "s" instance
        Integer result = boundMethodReference.applyAsInt("Vaibhav");
        System.out.println("Length by bound method = "+result);

        ToIntFunction<String> unboundMethodReference = String::length;
        Integer result2 = unboundMethodReference.applyAsInt("Vaibhav");
        System.out.println("Length by unbound method = "+result2);

        //==========================================================================

        IntBinaryOperator staticMethodReference = Integer::sum; // static
        Integer addition = staticMethodReference.applyAsInt(5, 7);
        System.out.println("Addition with static method = "+addition);

        //==========================================================================
        
        Supplier<List<String>> newListOfStrings = ArrayList::new; // constructor
        List<String> list = newListOfStrings.get();
        list.add("Vaibhav");
        list.add("Shejol");
        System.out.println(list);

        // IntFunction<List<String>> newListOfNStrings = size -> new ArrayList<>(size);
        IntFunction<List<String>> newListOfNStrings = ArrayList::new;
        List<String> list2 = newListOfNStrings.apply(5);
        list2.add("Vaibhav");
        list2.add("Shejol");
        System.out.println(list2);
    }
}

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Person{
    int id;
    String name;
}