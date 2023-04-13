package p18.racing_car.update;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Car> cars = new ArrayList<>();
        Race race = new Race(100, 5, cars);
        cars.add(new Car("A", race));
        cars.add(new Car("B", race));
        cars.add(new Car("C", race));
        cars.add(new Car("D", race));
        race.start();
    }
}
