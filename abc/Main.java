package miniTest2.task2;

public class Main {
    public static void main(String[] args) {

        MaterialManager manager = new MaterialManager();

        // Add 5 bột, 5 thịt
        for (int i = 1; i <= 5; i++) {
            CrispyFlour crispyFlour = new CrispyFlour("F" + i, "Bột chiên giòn " + i, "2022-08-26", 8000, i);
            Meat meat = new Meat("M" + i, "Thịt " + i, "2023-04-01", 100000, 0.5 * i);
            manager.add(crispyFlour);
            manager.add(meat);
        }
        System.out.println(manager);

        // Tính chênh lệch giữa chiết khấu và không chiết khấu ngày hôm nay
        System.out.println("Tổng giá gốc: " + manager.getTotalRegularPrice());
        System.out.println("Tổng giá sau khi chiết khấu: " + manager.getTotalDiscountedPrice());
        System.out.println("Chênh lệch giữa chiết khấu và không chiết khấu: " + manager.getDiffPrice());

        //Test remove
        System.out.println("Removed: " + manager.remove(2));
        System.out.println("Tổng giá gốc: " + manager.getTotalRegularPrice());

        //Test edit
        manager.edit(0);

    }
}

