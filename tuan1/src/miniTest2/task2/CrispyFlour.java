package miniTest2.task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CrispyFlour extends Material {

    private int quantity;

    public CrispyFlour(String id, String name, String manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void edit() {
        super.edit();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new quantity: ");
        int newQuantity = input.nextInt();

        setQuantity(newQuantity);

        System.out.println("After edited: " + this);
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        double amount = quantity * getCost();

        LocalDate expiryDate = getExpiryDate();
        LocalDate today = LocalDate.now();

        long daysToExpiration = ChronoUnit.DAYS.between(today, expiryDate);

        double discountRate = 0.05;

        if (daysToExpiration <= 120) {
            discountRate = 0.2;
        }
        if (daysToExpiration <= 60) {
            discountRate = 0.4;
        }

        return amount * (1 - discountRate);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", quantity = " + quantity;
    }
}
