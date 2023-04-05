package p12.comparable_vs_comparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String... barney) {
        Set<Simpson> simpsonsCharacters = new TreeSet<>();
        simpsonsCharacters.add(new Simpson("Moe"));
        simpsonsCharacters.add(new Simpson("Lenny"));
        simpsonsCharacters.add(new Simpson("Homer"));
        simpsonsCharacters.add(new Simpson("Barney"));

        System.out.println(simpsonsCharacters);
    }
}
