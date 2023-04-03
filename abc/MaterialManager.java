package miniTest2.abc;

import java.util.ArrayList;

public class MaterialManager {
    private final ArrayList<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public Material get(int i) {
        return materials.get(i);
    }

    public void add(Material material) {
        materials.add(material);
    }

    public Material remove(int i) {
        var temp = materials.get(i);
        materials.remove(i);
        return temp;
    }

    public void edit(int i) {
        System.out.println("\nEdit material" + materials.get(i));
        materials.get(i).edit();
    }

    public double getTotalDiscountedPrice() {
        double totalDiscountedPrice = 0;

        for (Material material : materials) {
            totalDiscountedPrice += material.getRealMoney();
        }

        return totalDiscountedPrice;
    }

    public double getTotalRegularPrice() {
        double totalRegularPrice = 0;

        for (Material material : materials) {
            totalRegularPrice += material.getAmount();
        }

        return totalRegularPrice;
    }

    public double getDiffPrice() {
        return getTotalRegularPrice() - getTotalDiscountedPrice();
    }

    @Override
    public String toString() {
        return materials.toString();
    }

}