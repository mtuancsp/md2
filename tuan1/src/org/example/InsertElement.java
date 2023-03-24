package org.example;

import java.util.Arrays;

public class InsertElement {

    public static int[] insertElement(int[] arr, int X, int index) {
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Unable to insert element into array.");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, k = 0; i < newArr.length; i++) {
            newArr[i] = (i == index) ? X : arr[k++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int X = 5;
        int index = 2;
        System.out.println(Arrays.toString(insertElement(arr, X, index)));
    }

//    public static void insertElement(int[] arr, int X, int index) {
//
//        if (index < 0 || index >= arr.length) {
//            System.out.println("Unable to insert element into array.");
//            return;
//        }
//
//        for (int i = arr.length - 1; i > index; i--) {
//            arr[i] = arr[i - 1];
//        }
//
//        arr[index] = X;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 8, 10};
//        int X = 5;
//        int index = 2;
//        insertElement(arr, X, index);
//        System.out.println(Arrays.toString(arr));
//    }

}
