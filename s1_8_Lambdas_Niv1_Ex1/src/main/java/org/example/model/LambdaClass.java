package org.example.model;

import java.util.ArrayList;
import java.util.stream.*;

public class LambdaClass {

    public LambdaClass(){}
    public void lambdaMethod(ArrayList<String> entrance){
        Stream<String> streamArray = entrance.stream().filter(str->str.contains("o"));
        ArrayList<String> filteredList = streamArray.collect(Collectors.toCollection(ArrayList::new));
        filteredList.forEach(System.out::println);

    }
}
