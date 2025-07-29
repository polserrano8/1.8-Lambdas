package org.example.model;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaClass {

    public LambdaClass(){}
    public void lambdaMethod(ArrayList<String> entrance){
        Stream<String> streamArray = entrance.stream().filter(s->s.contains("o")&& s.matches("^.{5,}$"));
        ArrayList<String> filteredArray = streamArray.collect(Collectors.toCollection(ArrayList::new));
        filteredArray.forEach(System.out::println);}
}
