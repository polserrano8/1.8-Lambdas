package s1_8_Lambdas_Niv1_Ex4.src.main.java.org.example.model;

import java.util.ArrayList;

public class LambdaClass {

    public LambdaClass(){}
    public void lambdaMethod(ArrayList<String> entrance){
        entrance.forEach(System.out::println);}
}
