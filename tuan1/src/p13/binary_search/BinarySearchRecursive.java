package p13.binary_search;

import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 14, 20, 40, 75, 60, 7};
        int value = 40;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = binarySearchRecursive(arr, 0, arr.length - 1, value);
        System.out.println(index);
    }

    public static int binarySearchRecursive(int[] arr, int left, int right, int value) {

        if (left > right) return -1;

        int middle = (left + right) / 2;

        if (arr[middle] == value) return middle;

        if (arr[middle] < value) return binarySearchRecursive(arr, middle + 1, right, value);

        return binarySearchRecursive(arr, left, middle - 1, value);
    }

}

