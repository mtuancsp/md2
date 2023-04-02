package miniTest2.task2;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Material implements Discount {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material(String id, String name, String manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = LocalDate.parse(manufacturingDate);
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void edit(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new ID: ");
        String newId = input.nextLine();

        System.out.print("Enter new name: ");
        String newName = input.nextLine();

        System.out.print("Enter new manufacturing date: ");
        LocalDate newManufacturingDate = LocalDate.parse(input.nextLine());

        System.out.print("Enter new cost: ");
        int newCost = input.nextInt();

        setId(newId);
        setName(newName);
        setManufacturingDate(newManufacturingDate);
        setCost(newCost);
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public String toString() {
        return "\nMaterial " +
                "ID = '" + getId() + '\'' +
                ", name = '" + name + '\'' +
                ", manufacturing date = " + manufacturingDate +
                ", expiry date = " + getExpiryDate() +
                ", cost = " + cost;
    }
}