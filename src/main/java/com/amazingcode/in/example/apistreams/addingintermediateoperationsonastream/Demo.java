package com.amazingcode.in.example.apistreams.addingintermediateoperationsonastream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.amazingcode.in.example.apistreams.mapfilterreducealgorithm.City;

import lombok.Getter;
import lombok.Setter;

public class Demo {
    public static void main(String []args){

        // Mapping a stream to another stream
        //======================================================================================
        List<String> strings = List.of("one", "two", "three", "four");
        List<Integer> lengths = strings.stream()
                                    .map(String::length)
                                    .collect(Collectors.toList()); // puts the processed elements in a list
        System.out.println("lengths = " + lengths);

        //=====================================================================================
        // There is no collect() method that takes a Collector as an argument on specialized streams.
        IntSummaryStatistics stats = strings.stream()
                                    .mapToInt(String::length)
                                    .summaryStatistics();
        System.out.println("stats = " + stats);

        //=======================================================================================
        // Filtering a stream
        long count = strings.stream()
                    .map(String::length)
                    .filter(length -> length == 3)
                    .count();
        System.out.println("count = " + count);

        //======================================================================================
        // Methods of Stream
        // 1) distinct() uses hashCode() and equals() methods to spot the duplicates. 
        // 2) sorted()
        // 3) skip() 
        // 4) limit() 
        // 5) dropWhile(predicate) 
        // 6) takeWhile(predicate)
    }
}
