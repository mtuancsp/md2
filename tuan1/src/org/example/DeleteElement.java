package org.example;

public class DeleteElement {
    public static int[] deleteElements(int[] arr, int element) {
        int count = 0;
        for (int e : arr) {
            if (e == element) {
                count++;
            }in
        }
        if (count == 0) {
            System.out.println("Element not found in array");
        }
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int e : arr) {
            if (e != element) {
                newArr[j++] = e;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 5, 10};
        int element = 5;
        for (int e : deleteElements(arr, element)) {
            System.out.print(e + " ");
        }
    }
}
