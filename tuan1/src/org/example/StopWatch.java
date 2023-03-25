package org.example;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
//        Sort.bubbleSort(array);
//        Sort.selectionSort(array);
//        Sort.insertionSort(array, 0, array.length - 1);

//        Arrays.sort(array);
        Sort.quickSort(array, 0, array.length - 1);
        stopwatch.stop();

        System.out.printf("Elapsed time: %d milliseconds", stopwatch.getElapsedTime());
    }

}
