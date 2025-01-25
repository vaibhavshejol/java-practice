package com.amazingcode.in.example.apistreams.creatingstream;

import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String []args){
        
        // Creating a stream using stream() method
        List<String> strings = List.of("One", "Two", "Three");
        Stream<String> stringsStream = strings.stream();
    }
}
