package com.harunugur.patterns.composite;

public class Test {

    public static void main(String[] args) {
        Shape tri1 = new Triangle();
        Shape tri2 = new Triangle();
        Shape cir1 = new Circle();

        Drawing drawing = new Drawing();
        drawing.addShape(tri1);
        drawing.addShape(tri2);
        drawing.addShape(cir1);

        drawing.draw("Red");

        drawing.clearShapeList();

        drawing.addShape(tri1);
        drawing.addShape(cir1);
        drawing.draw("Green");
    }
}
