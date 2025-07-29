package org.example.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaClass {

    public LambdaClass() {}

    public List<String> sortChainStringsReversed(List<Object> mixedList) {
        return mixedList.stream()
                .map(Object :: toString)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

}
