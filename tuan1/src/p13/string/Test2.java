package p13.string;

import java.util.Arrays;

public class Test2 {
    public static int[] maxIncreasingSub(int[] arr) {
        int n = arr.length;
        int[] storage = new int[n]; // storage[i] lưu độ dài của dãy con kết thúc tại i
        int[] prev = new int[n]; // prev[i] lưu index của phần tử trước đó trong dãy con kết thúc tại i

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
        for (int i = maxLength - 1; i >= 0; i--) {
            result[i] = arr[endIndex];
            endIndex = prev[endIndex];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 8, 7, 2, 4, 3, 5 };
        int[] result = maxIncreasingSub(nums);
        System.out.println(Arrays.toString(result));
    }
}


