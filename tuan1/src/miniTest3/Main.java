package miniTest3;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.add(new ParttimeEmployee("P001", "Nguyen Van A", 25, "0999999999", "a@gmail.com", "Hà Nội", 20, 100000));
        manager.add(new FulltimeEmployee("F002", "Nguyen Van B", 26, "0988888888", "b@gmail.com", "Thái Bình", 100000, 50000, 1000000));
        manager.add(new ParttimeEmployee("P003", "Nguyen Van C", 25, "0977777777", "c@gmail.com", "Cao Bằng", 30, 120000));
        manager.add(new FulltimeEmployee("F004", "Nguyen Van D", 25, "0966666666", "d@gmail.com", "Hải Phòng", 200000, 100000, 200000));
        manager.add(new ParttimeEmployee("P005", "Nguyen Van E", 25, "0955555555", "e@gmail.com", "Sơn La", 40, 140000));
        manager.add(new FulltimeEmployee("F006", "Nguyen Van F", 25, "0944444444", "f@gmail.com", "Bắc Giang", 500000, 200000, 5000000));

        manager.mainMenu();
    }
}
