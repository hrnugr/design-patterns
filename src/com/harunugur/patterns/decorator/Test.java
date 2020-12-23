package com.harunugur.patterns.decorator;

public class Test {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar(new BasicCar());
        System.out.println(sportsCar.name());

        LuxuryCar luxuryCar = new LuxuryCar(new BasicCar());
        System.out.println(luxuryCar.name());
    }
}
