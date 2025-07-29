package org.example;

import org.example.model.LambdaClass;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("Montgomery");
        checkList.add("Marge");
        checkList.add("Homer");
        checkList.add("El Barto");
        checkList.add("Lisa");
        checkList.add("Abraham");
        checkList.add("Pica");
        checkList.add("Pico");

        LambdaClass trial = new LambdaClass();
        trial.lambdaMethod(checkList);
    }
}