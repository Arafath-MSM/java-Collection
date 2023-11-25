package TASK02;
// I certify the code of this lab is entirely my own work,
// but I received assistance from [bard and my friends].
// Follow this with a description of the type of assistance (https://www.w3schools.com/java/java_hashmap.asp).import java.util.*;import java.util.*;

class WordOccurrences {

    public static void main(String[] args) {
        String sentence = "This is a test sentence. This sentence is to test the word occurrences.";

        Map<String, Integer> wordCountMap = countWordOccurrences(sentence);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordOccurrences(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}
