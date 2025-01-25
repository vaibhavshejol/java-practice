package com.amazingcode.in.example.apistreams.mapfilterreducealgorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class City {
    private Long id;
    private String cityName;
    private Long population;
}
