package org.calc.gpt.homework.n3_10.tree;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brend = "BMW";
        car1.year = 2010;

        car2.brend = "Toyota";
        car2.year = 2020;

        car1.printInfo();
        car2.printInfo();
    }
}
