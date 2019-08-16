package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box<Double,Integer>(22.1, 50);
        Box box2 = new Box<Float, Float>(11.5f, 36.6f);


    }

    public void addition(List<? extends Number> list) {
        Double s = 22.1;
        Integer a = 50;
            s + a = ;
        return result;
    }
    List<Integer> li = Arrays.asList(1, 2, 3);

    public void multiplication(List<? extends Number> list) {
        float s = 11.5f;
        float a = 36.6f;
        for (Number n : list)
            s + a = n.doubleValue();
        return s,a;
    }
    List<Integer> ls = Arrays.asList(1, 2, 3);
}
