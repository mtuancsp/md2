package p11.word_count;

import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "  This is a   sample   .string with several words , and some! of the words are repeated several times  .";
        String[] words = str.trim().split("[\\s,.'\"()]+");

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            wordCount.merge(word.toLowerCase(), 1, Integer::sum);
        }

        System.out.println("Word Count:");
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }

}
