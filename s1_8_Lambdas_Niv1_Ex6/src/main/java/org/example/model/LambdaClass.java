package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaClass {
    private ArrayList<Object> list;
    public LambdaClass() {}

    public List<String> sortChainStrings(List<Object> mixedList) {
        return mixedList.stream()
                .map(Object :: toString)
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
    }

}
