package org.example.model;

import java.util.ArrayList;

public class LambdaClass {

    public LambdaClass(){}
    public void lambdaMethod(ArrayList<String> entrance){
        entrance.forEach(str-> System.out.println(str));
    }
    }
