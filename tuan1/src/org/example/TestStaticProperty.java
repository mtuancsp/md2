package org.example;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "2.0");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Audi", "3.0");
        System.out.println(Car.numberOfCars);
    }
}
