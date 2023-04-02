package miniTest2.task2;

import java.time.LocalDate;
import java.util.Scanner;

public class Meat extends Material {
    private double weight;

    public Meat(String id, String name, String manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void edit() {

        super.edit();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter new weight: ");
        int newWeight = input.nextInt();

        setWeight(newWeight);

        System.out.println(this);
    }

    @Override
    public double getAmount() {
        return getCost() * getWeight();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {

        double amount = weight * getCost();

        LocalDate expiryDate = getExpiryDate();
        LocalDate today = LocalDate.now();

        long daysToExpiration = today.until(expiryDate).getDays();
        double discountRate = 0.1;

        if (daysToExpiration <= 5) {
            discountRate = 0.3;
        }

        return amount * (1 - discountRate);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weight = " + getWeight();
    }

}

