package p11.employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các bản ghi
        List<String> records = new ArrayList<>();
        records.add("Nguyen Van A,Nam,1990-01-01");
        records.add("Tran Thi B,Nu,1995-02-15");
        records.add("Pham Van C,Nam,1992-06-30");
        records.add("Le Thi D,Nu,1998-03-20");
        records.add("Do Van E,Nam,1994-12-10");

        // Gọi phương thức demerge để sắp xếp lại danh sách các bản ghi
        List<String> result = Demerging.demerge(records);

        // In danh sách kết quả ra màn hình
        for (String record : result) {
            System.out.println(record);
        }
    }
}

