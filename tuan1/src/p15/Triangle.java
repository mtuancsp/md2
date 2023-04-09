package p15;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int side1, side2, side3;
            System.out.print("Nhập cạnh 1: ");
            side1 = scanner.nextInt();
            System.out.print("Nhập cạnh 2: ");
            side2 = scanner.nextInt();
            System.out.print("Nhập cạnh 3: ");
            side3 = scanner.nextInt();
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IllegalTriangleException("Các cạnh phải là số dương");
            }
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
            }
            System.out.println("Tam giác hợp lệ");
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

