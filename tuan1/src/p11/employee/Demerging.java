package p11.employee;

import java.util.*;

public class Demerging {
    public static List<String> demerge(List<String> records) {
        // Tạo 2 queue NU và NAM
        Queue<String> NU = new LinkedList<>();
        Queue<String> NAM = new LinkedList<>();

        // Đưa các bản ghi vào queue tương ứng
        for (String record : records) {
            String[] fields = record.split(",");
            if (fields[1].equals("Nu")) {
                NU.add(record);
            } else {
                NAM.add(record);
            }
        }

        // Tạo danh sách kết quả
        List<String> result = new ArrayList<>();

        // Ghép các bản ghi từ queue NU và NAM vào danh sách kết quả
        while (!NU.isEmpty()) {
            result.add(NU.remove());
        }
        while (!NAM.isEmpty()) {
            result.add(NAM.remove());
        }

        return result;
    }
}
