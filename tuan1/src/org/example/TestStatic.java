package org.example;

import java.util.Arrays;

public class TestStatic {
    private static int [] arr = {0,1};
    private static int a = 1;

    public static void main(String[] args) {
        modify(arr);
        modify2(a);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }

    static void modify(int[] arr){
        arr[0] = 10;
    }
    static void modify2(int x){
        x = 10;
    }
}
