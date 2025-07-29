package s1_8_Lambdas_Niv1_Ex4.src.main.java.org.example;
import s1_8_Lambdas_Niv1_Ex4.src.main.java.org.example.model.LambdaClass;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("January");
        checkList.add("February");
        checkList.add("March");
        checkList.add("April");
        checkList.add("May");
        checkList.add("June");
        checkList.add("July");
        checkList.add("August");
        checkList.add("September");
        checkList.add("October");
        checkList.add("November");
        checkList.add("December");

        LambdaClass trial = new LambdaClass();
        trial.lambdaMethod(checkList);
    }
}