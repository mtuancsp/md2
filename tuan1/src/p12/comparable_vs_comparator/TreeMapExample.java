package p12.comparable_vs_comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String... barney) {
        Map<Simpson, String> simpsonsCharacters = new TreeMap<>();
        simpsonsCharacters.put(new Simpson("Moe"), "shotgun");
        simpsonsCharacters.put(new Simpson("Lenny"), "Carl");
        simpsonsCharacters.put(new Simpson("Homer"), "television");
        simpsonsCharacters.put(new Simpson("Barney"), "beer");

        System.out.println(simpsonsCharacters);
    }
}
