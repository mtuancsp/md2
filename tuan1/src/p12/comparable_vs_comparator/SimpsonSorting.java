package p12.comparable_vs_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class SimpsonSorting {

    public static void main(String... sortingWithList) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.forEach(System.out::print);
    }

}