package com.harunugur.patterns.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle : " + fillColor);
    }
}
