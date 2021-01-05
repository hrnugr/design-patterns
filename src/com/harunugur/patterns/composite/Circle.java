package com.harunugur.patterns.composite;

public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle : " + fillColor);
    }
}
