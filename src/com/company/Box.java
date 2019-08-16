package com.company;

public class Box<T extends Number, V extends Number> {
    private T number1;
    private V number2;

    public T getNumber1() {
        return number1;
    }

    public V getNumber2() {
        return number2;
    }

    Box(T number1, V number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}