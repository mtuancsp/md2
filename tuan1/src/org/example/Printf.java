package org.example;

import java.util.Arrays;


public class Printf {
    public static void main(String[] args) {
        int a = 100;
        m(a);
        System.out.println(a);
    }

    static void m(int x) {
        x = 200;
    }
}