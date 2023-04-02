package miniTest2.task2;

public class Main {
    public static void main(String[] args) {

        MaterialManager manager = new MaterialManager();

        // Add 5 bột, 5 thịt
        for (int i = 1; i <= 5; i++) {
            CrispyFlour crispyFlour = new CrispyFlour("F" + i, "Bột chiên giòn " + i, "2022-08-26", 8000, i);
            Meat meat = new Meat("M" + i, "Thịt " + i, "2023-04-01", 100000, 0.5 * i);
            manager.addMaterial(crispyFlour);
            manager.addMaterial(meat);
        }

        // Tính chênh lệch giữa chiết khấu và không chiết khấu ngày hôm nay
        System.out.println("Giá gốc: " + manager.getTotalRegularPrice());
        System.out.println("Giá sau khi chiết khấu: " + manager.getTotalDiscountedPrice());
        System.out.println("Chênh lệch giữa chiết khấu và không chiết khấu: " + manager.getDiffPrice());

        //Test remove
        manager.removeMaterial(manager.getMaterials().get(2));
        System.out.println("Giá gốc: " + manager.getTotalRegularPrice());

        //Test edit
        System.out.println(manager.getMaterials().get(0));
        manager.editMaterial(manager.getMaterials().get(0));
    }
}

