package miniTest;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 1, 6, 2, 9, 4, 7, 0};

        int sum = sumOfArray(arr);
        System.out.println("Sum of array elements: " + sum);

        int max = maxOfArray(arr);
        System.out.println("Maximum element in array: " + max);
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }

    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }
}
