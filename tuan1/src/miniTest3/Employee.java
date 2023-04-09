package miniTest3;

import java.util.Scanner;

public abstract class Employee {
    private String employeeCode;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;

    public Employee(String employeeCode, String fullName, int age, String phoneNumber, String email, String address) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee Code : '" + getEmployeeCode() + '\'' +
                ", Full Name : '" + getFullName() + '\'' +
                ", Age = " + getAge() +
                ", Phone Number : '" + getPhoneNumber() + '\'' +
                ", Email : '" + getEmail() + '\'' +
                ", Address : '" + getAddress() + '\'';
    }

    public abstract int getActualSalary();

    public abstract void updateSalary();

    public abstract void showSalary();
    public void updateInfo(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nCập nhật thông tin nhân viên");
            System.out.println(this);
            System.out.println("1. Sửa họ và tên");
            System.out.println("2. Sửa tuổi");
            System.out.println("3. Sửa số điện thoại");
            System.out.println("4. Sửa email");
            System.out.println("5. Sửa địa chỉ");
            System.out.println("6. Cập nhật lương thưởng/phạt");
            System.out.println("7. Sửa mã nhân viên");
            System.out.println("0. Quay lại");

            var choice = Menu.getValidIntChoice(scanner, 0, 7);

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập họ và tên: ");
                    setFullName(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("Nhập tuổi: ");
                    setAge(Menu.getValidIntChoice(scanner, 1, 100));
                }
                case 3 -> {
                    System.out.print("Nhập số điện thoại: ");
                    setPhoneNumber(scanner.nextLine());
                }
                case 4 -> {
                    System.out.print("Nhập email: ");
                    setEmail(scanner.nextLine());
                }
                case 5 -> {
                    System.out.print("Nhập địa chỉ: ");
                    setAddress(scanner.nextLine());
                }
                case 6 -> updateSalary();
                case 7 -> {
                    System.out.print("Nhập mã nhân viên: ");
                    setEmployeeCode(scanner.nextLine());
                }
                case 0 -> {return;}
            }
        } while (true);
    }

}

