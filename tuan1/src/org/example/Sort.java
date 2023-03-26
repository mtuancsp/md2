package org.example;


public class Sort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
    }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || arr.length == 0)
            return;

        if (left >= right)
            return;

        int threshold = 100;
        if (right - left + 1 < threshold) {
            insertionSort(arr, left, right);
            return;
        }

        int pivot = arr[left + (right - left) / 2];
        int i = left, j = right;

        do {
            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j)
            quickSort(arr, left, j);

        if (right > i)
            quickSort(arr, i, right);
    }

    public static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before sort:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        Sort.insertionSort(array, 0, array.length - 1);
        System.out.println("After sort:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}
