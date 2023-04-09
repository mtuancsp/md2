package miniTest3;

import java.util.Scanner;

public class ParttimeEmployee extends Employee {
    private int hoursOfWork;
    private int hourlySalary;

    public ParttimeEmployee(String employeeCode, String fullName, int age, String phoneNumber, String email, String address) {
        super(employeeCode, fullName, age, phoneNumber, email, address);
    }

    public ParttimeEmployee(String employeeCode, String fullName, int age, String phoneNumber, String email, String address, int hoursOfWork, int hourlySalary) {
        super(employeeCode, fullName, age, phoneNumber, email, address);
        this.hoursOfWork = hoursOfWork;
        this.hourlySalary = hourlySalary;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public int getActualSalary() {
        return hoursOfWork * hourlySalary;
    }

    @Override
    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCập nhật lương thưởng");
        showSalary();
        do {
            System.out.println("1. Cập nhật số giờ làm");
            System.out.println("2. Cập nhật lương theo giờ");
            System.out.println("0. Quay lại");

            var choice = Menu.getValidIntChoice(scanner, 0, 2);

            switch (choice) {
                case 1 -> {
                    System.out.println("Nhập số giờ làm: ");
                    setHoursOfWork(Menu.getValidIntChoice(scanner, 0, 1000));
                    System.out.println("Đã cập nhật");
                    showSalary();
                }
                case 2 -> {
                    System.out.println("Nhập lương theo giờ: ");
                    setHourlySalary(Menu.getValidIntChoice(scanner, 0, 1000000));
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
        System.out.print("Số giờ làm: " + getHoursOfWork());
        System.out.println(", Lương theo giờ: " + getHourlySalary());
    }
}

