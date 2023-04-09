package miniTest3;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();
        manager.add(new ParttimeEmployee("P001", "Nguyen Van A", 25, "0987654321", "a@gmail.com", "Ha Noi", 20, 100000));
        manager.add(new FulltimeEmployee("F002", "Nguyen Van B", 26, "0987654321", "b@gmail.com", "Ha Noi", 100000, 50000, 1000000));

        manager.mainMenu();
    }
}
