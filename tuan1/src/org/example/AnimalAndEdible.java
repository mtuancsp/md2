package org.example;

public class AnimalAndEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Chicken) {
                Edible edible= (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
abstract class Animal {
    public abstract void makeSound();
}
interface Edible {
    String howToEat();
}
class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Fry it";
    }
    @Override
    public void makeSound() {
        System.out.println("Chicken: cluck-cluck!");
    }
}

class Tiger extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tiger: roar!");
    }
}

abstract class Fruit implements Edible {
}
class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

