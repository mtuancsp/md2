package p19.test;

import org.example.StopWatch;

public class TestSpeedString {
    public static void main(String[] args) {

        final int NUMBER = 100_000;
        String str = "";
        StringBuilder strBuilder = new StringBuilder();

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        for (int i = 0; i < NUMBER; i++){
            str += "abc";
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + "ms");

        stopWatch.start();
        for (int i = 0; i < NUMBER; i++){
            strBuilder.append("abc");
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + "ms");

    }


}
