package com.harunugur.patterns.decorator;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String name() {
        return super.name() + " - SportsCar";
    }
}
