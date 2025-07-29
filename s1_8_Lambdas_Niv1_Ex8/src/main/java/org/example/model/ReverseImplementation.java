package org.example.model;

import java.util.stream.IntStream;

public class ReverseImplementation implements Reverse {
    public ReverseImplementation(){};
    @Override
    public String reversed(String toReverse) {
        StringBuilder reverser = new StringBuilder();
        IntStream.iterate(toReverse.length() - 1, i -> i >= 0, i -> i - 1)
                .forEach(i -> reverser.append(toReverse.charAt(i)));
        return reverser.toString();
    }
}
