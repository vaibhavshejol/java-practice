package com.amazingcode.in.example.lambdaexpressions.comparatorwithlambdaexpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Demo {
    public static void main(String []args){

        List<String> list = new ArrayList<>();
        list.add("BA");
        list.add("AB");
        list.add("B");
        list.add("C");
        list.add("ABC");
        list.add("CBADE");
        list.add("ABCD");
        
        System.out.println("Unsorted List: "+list);

        // Creating Comparator using lambda expression
        // Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        // list.sort(comparator);

        //=========================================================================================

        // Function<String, Integer> toLength = String::length;
        // Comparator<String> comparator = (s1, s2) -> Integer.compare(toLength.apply(s1), toLength.apply(s2));
        // list.sort(comparator);

        //=========================================================================================
        
        // Using a Factory Method to Create a Comparator
        Comparator<String> comparator = Comparator.comparing(String::length);
        list.sort(comparator);

        System.out.println("Sorted List: "+list);

        //=========================================================================================

        // Chaining Comparators
        Comparator<User> byFirstName = Comparator.comparing(User::getFName);
        Comparator<User> byLastName = Comparator.comparing(User::getLName);
        // Comparator<User> byFirstNameThenLastName = byFirstName.thenComparing(byLastName);
        Comparator<User> byFirstNameThenLastName = Comparator.comparing(User::getFName).thenComparing(User::getLName);

        List<User> users = new ArrayList<>();
        User user1 = new User(1, "John", "Doe", 50000.00);
        User user2 = new User(2, "Alice", "Smith", 60000.00);
        User user3 = new User(3, "John", "Smith", 55000.00);
        User user4 = new User(4, "Alice", "Brown", 45000.00);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println("Unsorted:");
        System.out.println(users);

        System.out.println("Sorted by FirstName:");
        users.sort(byFirstName);
        System.out.println(users);

        System.out.println("Sorted by LastName:");
        users.sort(byLastName);
        System.out.println(users);

        System.out.println("Sorted by FirstName and LastName:");
        users.sort(byFirstNameThenLastName);
        System.out.println(users);

        //=====================================================================================
        
        // Comparing Comparable Objects Using Their Natural Order
        Comparator<String> byLengthThenAlphabetically = Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder());
        list.sort(byLengthThenAlphabetically);
        System.out.println("Sorted by length and natural order:");
        System.out.println(list);

        list.sort(byLengthThenAlphabetically.reversed());
        System.out.println("Sorted by length and natural order then reversed:");
        System.out.println(list);
    }
}
