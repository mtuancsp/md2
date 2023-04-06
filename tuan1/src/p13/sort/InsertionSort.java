package p13.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Thuật toán: chọn một phần tử để sắp xếp, nếu nó nhỏ hơn phần tử trước nó thì di chuyển về phía trước cho đến khi nó nhỏ nhất.");
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            System.out.println("Bước " + i + " Lấy " + arr[i] + " ra để làm phần tử để sắp xếp.");
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                System.out.println("Di chuyển " + arr[j] + " tới vị trí của " + arr[j + 1]);

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            System.out.println("Đặt " + key + " vào vị trí của " + arr[j + 1]);
            arr[j + 1] = key;

            System.out.println("Mảng sau bước " + i + ": " + Arrays.toString(arr));
        }
    }
}

