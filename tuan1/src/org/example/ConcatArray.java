package org.example;

import java.util.Arrays;

public class ConcatArray {
//    public static int[] concat(int[] arr1, int[] arr2){
//        int[] newArr = new int[arr1.length + arr2.length];
//        int i = 0;
//        for(int e : arr1){
//            newArr[i++] = e;
//        }
//        for(int e : arr2){
//            newArr[i++] = e;
//        }
//        return newArr;
//    }
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }
}
