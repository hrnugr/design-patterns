package com.harunugur.patterns.decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String name() {
        return super.name() + " - LuxuryCar";
    }
}
