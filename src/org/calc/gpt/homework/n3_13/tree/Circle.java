package org.calc.gpt.homework.n3_13.tree;

public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        double square = Math.PI * radius*radius;
        System.out.println("Площадь круга равна: " + square);
        System.out.println("Округлённое значение: " + Math.round(square * 100.0) / 100.0);
    }
}
