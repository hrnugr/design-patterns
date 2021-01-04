package com.harunugur.patterns.abstract_factory;

public class Test {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC => "+pc);
        System.out.println("AbstractFactory Laptop => "+laptop);
    }
}
