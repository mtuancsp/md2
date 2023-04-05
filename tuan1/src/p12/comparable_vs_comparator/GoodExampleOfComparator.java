package p12.comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GoodExampleOfComparator {

    public static void main(String... args) {
        List<Simpson> characters = new ArrayList<>();

        Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");

        characters.add(homer);
        characters.add(moe);

        characters.sort(Comparator.comparingInt(a -> a.name.length()));

        System.out.println(characters);
    }
}
