package miniTest2.task2;

import java.util.ArrayList;

public class MaterialManager extends ArrayList<Material> {

    public void edit(int i) {
        System.out.println("\nEdit material" + get(i));
        get(i).edit();
    }

    public double getTotalDiscountedPrice() {
        double totalDiscountedPrice = 0;

        for (Material material : this) {
            totalDiscountedPrice += material.getRealMoney();
        }

        return totalDiscountedPrice;
    }

    public double getTotalRegularPrice() {
        double totalRegularPrice = 0;

        for (Material material : this) {
            totalRegularPrice += material.getAmount();
        }

        return totalRegularPrice;
    }

    public double getDiffPrice() {
        return getTotalRegularPrice() - getTotalDiscountedPrice();
    }

}
