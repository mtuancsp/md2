package org.example;

public class FindMin {
    public static int findMin(int[] array){
        int index = 0;
        for(int i=0; i < array.length; i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        System.out.println("\nThe smallest element in the array is: " + arr[findMin(arr)]);
    }
}
