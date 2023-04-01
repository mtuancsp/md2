package miniTest2.task2;

import java.util.ArrayList;

public class MaterialManager {
    private final ArrayList<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterial(Material material) {
        materials.remove(material);
    }

    //editInfo
    public void editMaterial(Material material) {
        material.edit();
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



}
