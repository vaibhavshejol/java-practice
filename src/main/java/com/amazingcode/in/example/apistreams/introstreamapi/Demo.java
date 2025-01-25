package com.amazingcode.in.example.apistreams.introstreamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String []args){
        
        List<String> strings = List.of("one","two","three","four");
        var map = strings.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        // It groups the strings by their length with groupingBy(String::length)
        // It counts the number of strings for each length with counting()
        // It then creates a Map<Integer, Long> to store the result
    }
}
