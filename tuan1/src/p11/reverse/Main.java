package p11.reverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Test reverseArray
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"one", "two", "three", "four", "five"};

        Integer[] reversedIntArray = Reverse.reverseArray(intArray);
        String[] reversedStrArray = Reverse.reverseArray(strArray);

        System.out.println(Arrays.toString(reversedIntArray));
        System.out.println(Arrays.toString(reversedStrArray));

        // Test reverseString
        String str = "Hello, world!";
        String reversedStr = Reverse.reverseString(str);

        System.out.println(reversedStr);

        // Test reverseString
        String[] array = {"one", "two", "three", "four", "five"};
        String[] reversedArray = Reverse.reverseArray(array);
        System.out.println(Arrays.toString(reversedArray));

        String str1 = "Hello";
        var str1Reverse = String.join("",Reverse.reverseArray(str1.split("")));
        System.out.println(str1Reverse);

    }
}

