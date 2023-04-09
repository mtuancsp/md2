package miniTest3;

import java.util.Scanner;

public class FulltimeEmployee extends Employee {
    private int bonusAmount;
    private int penaltyAmount;
    private int baseSalary;

    public FulltimeEmployee(String employeeCode, String fullName, int age, String phoneNumber, String email, String address) {
        super(employeeCode, fullName, age, phoneNumber, email, address);
    }

    public FulltimeEmployee(String employeeCode, String fullName, int age, String phoneNumber, String email, String address, int bonusAmount, int penaltyAmount, int baseSalary) {
        super(employeeCode, fullName, age, phoneNumber, email, address);
        this.bonusAmount = bonusAmount;
        this.penaltyAmount = penaltyAmount;
        this.baseSalary = baseSalary;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(int bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public int getActualSalary() {
        return baseSalary + ( bonusAmount - penaltyAmount );
    }

    @Override
    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCập nhật lương thưởng");
        showSalary();
        do {
            System.out.println("1. Cập nhật lương cứng");
            System.out.println("2. Cập nhật tiền thưởng");
            System.out.println("3. Cập nhật tiền phạt");
            System.out.println("0. Quay lại");

            var choice = Menu.getValidIntChoice(scanner, 0, 3);

            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập lương cứng mới:");
                    setBaseSalary(Menu.getValidIntChoice(scanner, 0, 2000000000));
                    System.out.println("Đã cập nhật");
                    showSalary();
                }
                case 2 -> {
                    System.out.println("Nhập tiền thưởng mới:");
                    setBonusAmount(Menu.getValidIntChoice(scanner, 0, 2000000000));
                    System.out.println("Đã cập nhật");
                    showSalary();
                }
                case 3 -> {
                    System.out.println("Nhập tiền phạt mới:");
                    setPenaltyAmount(Menu.getValidIntChoice(scanner, 0, 2000000000));
                    System.out.println("Đã cập nhật");
                    showSalary();
                }
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }

    @Override
    public void showSalary() {
        System.out.print("\nMã nhân viên: " + getEmployeeCode());
        System.out.println(", Tên nhân viên: " + getFullName());
        System.out.print("Lương cứng: " + getBaseSalary());
        System.out.print(", Tiền thưởng: " + getBonusAmount());
        System.out.println(", Tiền phạt: " + getPenaltyAmount());
    }


}

