package p15;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] creatRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (var i : arr) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập vào chỉ số một phần tử bất kì của mảng: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử " + index + " là: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Không tìm thấy vị trí của phần tử " + index);
        }
    }
}
