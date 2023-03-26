package org.example;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars = 0;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

}

class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "2.0");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Audi", "3.0");
        System.out.println(Car.numberOfCars);
    }
}
