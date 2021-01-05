package com.harunugur.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    public void addShape(Shape shape){
        this.shapes.add(shape);
    }

    public void removeShape(Shape shape){
        this.shapes.remove(shape);
    }

    public void clearShapeList() {
        this.shapes.clear();
    }
}
