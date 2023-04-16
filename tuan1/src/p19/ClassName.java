package p19;

import java.util.Arrays;
import java.util.List;

public class ClassName {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        List<String> classNames = Arrays.asList("C1234G", "A5678H", "P9876I", "C11111K", "D1234H", "C1234J", "C#1234G");
        classNames.forEach(className -> System.out.println(className + " is valid? " + isValidClassName(className)));
    }


}
