package com.khauminhduy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Retangle retangle = new Retangle();
        List<Shape> shapes = List.of(circle, square, cube,retangle);

        IAreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

    }

}
