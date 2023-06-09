package org.example;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.print("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter element" + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for(int j = 0; j < size; j++){
            if(array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);
    }
}
