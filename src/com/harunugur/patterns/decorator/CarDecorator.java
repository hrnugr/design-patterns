package com.harunugur.patterns.decorator;

public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }
    @Override
    public String name() {
        return this.car.name();
    }
}
