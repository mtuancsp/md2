package p19.test;

import java.util.Arrays;

public class ReplaceAndSplit {
    public static void main(String[] args) {
        String text1 = "Hello Java World";
        boolean result1 = text1.matches("Java.*");
        System.out.println(result1); // true

        String text2 = "Hello Java World";
        String result2 = text2.replaceAll("Java", "Python");
        System.out.println(result2); // Hello Python World
        System.out.println("Java Java Java".replaceAll("v\\w", "wi")); //Jawi Jawi Jawi


        String text3 = "Hello Java World Java";
        String result3 = text3.replaceFirst("Java", "Python");
        System.out.println(result3); // Hello Python World Java

        String text4 = "apple,banana,orange";
        String[] result4 = text4.split(",");
        System.out.println(Arrays.toString(result4)); // [apple, banana, orange]

        String text = "apple banana orange apple banana orange";
        String[] result = text.split(" ", 3);
        System.out.println(Arrays.toString(result)); //[apple, banana, orange apple banana orange]


    }
}