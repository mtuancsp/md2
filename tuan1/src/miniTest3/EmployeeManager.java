package miniTest3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManager extends ArrayList<Employee> {

    public void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThêm nhân viên mới");
        System.out.println("1. Thêm nhân viên part-time");
        System.out.println("2. Thêm nhân viên full-time");
        System.out.println("0. Quay lại");
        int i = Menu.getValidIntChoice(scanner, 0, 2);
        if (i == 0) return;

        System.out.println("\nNhập thông tin nhân viên mới: ");
        System.out.print("Mã nhân viên: ");
        var code = scanner.nextLine();
        System.out.print("Họ và tên: ");
        var name = scanner.nextLine();
        System.out.print("Tuổi: ");
        var age = Menu.getValidIntChoice(scanner, 1, 100);
        System.out.print("Số điện thoại: ");
        var phone = scanner.nextLine();
        System.out.print("Email: ");
        var email = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        var address = scanner.nextLine();

        if (i == 1) add(new ParttimeEmployee(code, name, age, phone, email, address));
        if (i == 2) add(new FulltimeEmployee(code, name, age, phone, email, address));

        System.out.println("Thêm nhân viên thành công!");
        System.out.println(this.get(this.size() - 1));
    }

    public void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        String code;
        Employee deletedEmployee;
        do {
            System.out.print("Nhập mã nhân viên cần xóa hoặc '0' để quay lại: ");
            code = scanner.nextLine();
            if (code.equals("0")) {
                return;
            }
            final String finalCode = code;
            deletedEmployee = stream()
                    .filter(e -> e.getEmployeeCode().equals(finalCode))
                    .findFirst()
                    .orElse(null);
            if (deletedEmployee != null) {
                removeIf(e -> e.getEmployeeCode().equals(finalCode));
                System.out.println("Xóa nhân viên thành công!");
                System.out.println("Thông tin nhân viên đã xóa:");
                System.out.println(deletedEmployee);
            } else {
                System.out.println("Mã nhân viên không tồn tại, vui lòng nhập lại!");
            }
        } while (deletedEmployee == null);

        Menu.returnOrExit();
    }

    private void updateEmployeeInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần update thông tin hoặc '0' để quay lại: ");
        var code = scanner.nextLine();

        if (code.equals("0")) return;

        for (var employee : this) {
            if (employee.getEmployeeCode().equals(code)) {
                employee.updateInfo();
                return;
            }
        }

        System.out.println("Mã nhân viên không tồn tại, vui lòng nhập lại!");
        updateEmployeeInfo();
    }

    public void displayAllEmployee() {
        System.out.println("\nDanh sách tất cả nhân viên");
        this.forEach(System.out::println);
        System.out.println("Tổng số nhân viên là: " + this.size() + "\n");
    }

    public int calculateAverageSalary() {
        int totalSalary = 0;
        int numberOfEmployees = this.size();
        for (var employee : this) {
            totalSalary += employee.getActualSalary();
        }
        return totalSalary / numberOfEmployees;
    }

    public void listOfPoorBitch() {
        System.out.println("\nList of poor bitch");
        int count = 0;
        for (Employee employee : this) {
            if (employee instanceof FulltimeEmployee && employee.getActualSalary() < calculateAverageSalary()) {
                System.out.println(employee);
                count++;
            }
        }
        System.out.println("Trong công ty có " + count + " con đỗ nghèo khỉ\n");
    }

    public int calculateTotalPartTimeSalary() {
        int totalPartTimeSalary = 0;
        for (Employee employee : this) {
            if (employee instanceof ParttimeEmployee) {
                totalPartTimeSalary += employee.getActualSalary();
            }
        }
        return totalPartTimeSalary;
    }

    public void sortFullTimeBySalary() {
        System.out.println("\nList of full-time employees by ascending salary");
        this.stream().filter(e -> e instanceof FulltimeEmployee)
                .sorted(Comparator.comparingInt(Employee::getActualSalary))
                .forEach(System.out::println);
        System.out.println();
    }

    //-------Menu------------------------------------------------
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n=== Quản lý nhân viên ===");
            System.out.println("1. Danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xóa nhân viên");
            System.out.println("5. Tính lương nhân viên");
            System.out.println("0. Thoát");

            var choice = Menu.getValidIntChoice(scanner, 0, 5);

            switch (choice) {
                case 1 -> listEmployee();
                case 2 -> addNewEmployee();
                case 3 -> updateEmployeeInfo();
                case 4 -> deleteEmployee();
                case 5 -> calculateSalary();
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }

    private void calculateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLương nhân viên");
        do {
            System.out.println("1. Tính lương theo mã nhân viên");
            System.out.println("2. Tính tổng lương của nhân viên part-time");
            System.out.println("3. Tính lương trung bình của công ty");
            System.out.println("0. Quay lại");

            var choice = Menu.getValidIntChoice(scanner, 0, 3);

            switch (choice) {
                case 1 -> getSalaryByCode();
                case 2 ->
                        System.out.println("Tổng lương nhân viên part-time: " + calculateTotalPartTimeSalary() + "\n");
                case 3 -> System.out.println("Lương trung bình của công ty: " + calculateAverageSalary() + "\n");
                case 0 -> {
                    return;
                }
            }
            Menu.returnOrExit();
        } while (true);

    }

    private void getSalaryByCode() {
        Scanner scanner = new Scanner(System.in);
        String code;
        Employee employee;
        do {
            System.out.print("Nhập mã nhân viên cần tính lương hoặc '0' để quay lại: ");
            code = scanner.nextLine();
            if (code.equals("0")) {
                return;
            }
            final String finalCode = code;
            employee = stream()
                    .filter(e -> e.getEmployeeCode().equals(finalCode))
                    .findFirst()
                    .orElse(null);
            if (employee != null) {
                System.out.println("Nhân viên\n" + employee);
                System.out.println("Lương tháng này: " + employee.getActualSalary());
            } else {
                System.out.println("Mã nhân viên không tồn tại, vui lòng nhập lại!");
            }
            Menu.returnOrExit();
        } while (employee == null);
    }


    public void listEmployee() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Danh sách toàn bộ nhân viên");
            System.out.println("2. Danh sách những con đỗ nghèo khỉ");
            System.out.println("3. Danh sách nhân viên toàn thời gian sắp xếp theo lương tăng dần");
            System.out.println("0. Quay lại");

            var choice = Menu.getValidIntChoice(scanner, 0, 3);

            switch (choice) {
                case 1 -> displayAllEmployee();
                case 2 -> listOfPoorBitch();
                case 3 -> sortFullTimeBySalary();
                case 0 -> {
                    return;
                }
            }

            Menu.returnOrExit();
        } while (true);
    }


}



