package com.company;



public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> box1 = new Box<>(2.1, 2);
        Box<Float, Float> box2 = new Box<>(3.14f, 6.1f);

        addition(box1, box2);
        multiplication(box1, box2);


    }

    public static void addition(Box<? extends Double, ? extends Integer> box1, Box<? extends Float, Float> box2) {

        Number ad = box1.getNumber1() + box1.getNumber2() + box2.getNumber2() + box2.getNumber1();
        System.out.println(ad);

    }

    public static void multiplication(Box<? extends Double,? extends Integer> box1, Box<? extends Float, Float> box2) {
        Number mu = box1.getNumber1() * box1.getNumber2() * box2.getNumber2() * box2.getNumber1();
        System.out.println(mu);


    }
}