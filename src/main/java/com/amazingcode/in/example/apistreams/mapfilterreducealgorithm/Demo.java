package com.amazingcode.in.example.apistreams.mapfilterreducealgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Demo {
    public static void main(String []args){

        List<City> cities = new ArrayList<>();
        cities.add(new City(1L, "Pune", 10000L));
        cities.add(new City(2L, "Mumbai", 20000L));
        cities.add(new City(3L, "Bangalore", 15000L));
        cities.add(new City(4L, "Delhi", 25000L));
        cities.add(new City(5L, "Chennai", 18000L));
        cities.add(new City(6L, "Kolkata", 12000L));
        cities.add(new City(7L, "Hyderabad", 16000L));
        cities.add(new City(8L, "Ahmedabad", 13000L));
        cities.add(new City(9L, "Jaipur", 14000L));
        cities.add(new City(10L, "Lucknow", 11000L));

        // Long sum = cities.stream()
        //         .map(city -> city.getPopulation())
        //         .filter(population -> population > 18000L)
        //         .reduce(0L, Long::sum);

        Stream<City> streamOfCities         = cities.stream();
        Stream<Long> populations         = streamOfCities.map(city -> city.getPopulation());
        Stream<Long> filteredPopulations = populations.filter(population -> population > 100_000);
        Long sum = filteredPopulations.reduce(0L, Long::sum);

        System.out.println("Total population = "+sum);

        // =========================================================================================

        // Specialized interfaces

        // Create an IntStream from a range of integers
        IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4 (end is exclusive)

        // Process the IntStream: Print each value
        System.out.println("Output from IntStream:");
        intStream.forEach(System.out::println);

        // Sum of even numbers from 1 to 10
        int sum2 = IntStream.rangeClosed(1, 10) // 1 to 10 (end is inclusive)
                           .filter(n -> n % 2 == 0)
                           .sum();
        System.out.println("Output from IntStream:");
        System.out.println("Sum of even numbers from 1 to 10: " + sum2);

        //=============================

        // Create a LongStream from a range of long values
        LongStream longStream = LongStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5 (end is inclusive)

        // Process the LongStream: Calculate product of all values
        long product = longStream.reduce(1, (a, b) -> a * b);
        System.out.println("Output from LongStream:");
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Generate a stream of 5 random long values and print them
        System.out.println("Output from LongStream:");
        LongStream.generate(() -> (long) (Math.random() * 100))
                  .limit(5)
                  .forEach(System.out::println);

        //====================

        // Create a DoubleStream from an array of doubles
        double[] values = {1.1, 2.2, 3.3, 4.4};
        DoubleStream doubleStream = DoubleStream.of(values);

        // Process the DoubleStream: Calculate average
        double average = doubleStream.average().orElse(0.0);
        System.out.println("Output from DoubleStream:");
        System.out.println("Average: " + average);

        // Generate a stream of random double values between 0 and 1 and limit to 3 values
        System.out.println("Output from DoubleStream:");
        DoubleStream.generate(Math::random)
                    .limit(3)
                    .forEach(System.out::println);
    }
}
