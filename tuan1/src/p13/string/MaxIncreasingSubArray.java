package p13.string;

import java.util.Arrays;

public class MaxIncreasingSubArray {
    public static int[] maxIncreasingSub(int[] arr) {
        int n = arr.length;
        int[] storage = new int[n]; // storage[i] lưu độ dài của dãy con kết thúc tại i
        int[] prev = new int[n]; // prev[i] lưu index của phần tử trước phần tử i trong dãy con kết thúc tại i

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            storage[i] = 1;
            prev[i] = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i] && storage[j] + 1 > storage[i]) {
                    storage[i] = storage[j] + 1;
                    prev[i] = j;
                }
            }
            if (storage[i] > maxLength) {
                maxLength = storage[i];
                endIndex = i;
            }
        }

        int[] result = new int[maxLength];
        System.out.println(Arrays.toString(storage));
        System.out.println(Arrays.toString(prev));

        for (int i = maxLength - 1; i >= 0; i--) {
            result[i] = arr[endIndex];
            endIndex = prev[endIndex];
        }

        return result;
    }

    public static String maxIncreasingSubString(String str) {

        char[] charArr = str.toCharArray();
        int n = charArr.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = charArr[i];
        }

        int[] resultArr = maxIncreasingSub(arr);
        char[] resultCharArr = new char[resultArr.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultCharArr[i] = (char) resultArr[i];
        }
        return String.valueOf(resultCharArr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 7, 2, 4, 3, 5};
        int[] result = maxIncreasingSub(arr);
        System.out.println(Arrays.toString(result) + "\n");

        String str = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println(maxIncreasingSubString(str));
    }

}


