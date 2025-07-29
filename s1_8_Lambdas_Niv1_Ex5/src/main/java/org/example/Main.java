package org.example;

import org.example.model.PiInterface;


public class Main {
    public static void main(String[] args) {
        PiInterface pi = () -> 3.1415;
        System.out.println("The Pi number is: " + pi.getPiValue());
    }
}