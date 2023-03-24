package org.example;

public class CountElement {
    public static void countElement(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.toLowerCase().charAt(i) == c){
                count++;
                System.out.printf("Position of '%c': %d\n", c, i);
            }
        }
        System.out.printf("Have %d '%c' in the string.", count, c);
    }
    public static void main(String[] args) {
        String str = "C02 codeGym cong cong.";
        char c = 'c';
        countElement(str, c);
    }
}
