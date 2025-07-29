package org.example;


import org.example.model.LambdaClass;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList("Romina", 123, "Marc", 3.14, "a", "Dani", "Ramon");

        LambdaClass sorter = new LambdaClass();
        List<String> sortedStrings = sorter.sortChainStringsReversed(mixedList);

        System.out.println("Strings sorted by length (descending):");
        sortedStrings.forEach(System.out::println);
    }
}