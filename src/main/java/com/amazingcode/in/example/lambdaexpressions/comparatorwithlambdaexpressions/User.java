package com.amazingcode.in.example.lambdaexpressions.comparatorwithlambdaexpressions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User {
    private long id;
    private String fName;
    private String lName;
    private double salary;
}
