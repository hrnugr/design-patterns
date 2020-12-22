package com.harunugur.patterns.factory;

public class Test {
    public static void main(String[] args) {
        String file = FileCreatorFactory.createFile(FileType.EXCEL)
                .createFile("Factory Pattern");
        System.out.println(file);
    }
}
