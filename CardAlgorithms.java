package TASK02;
// I certify the code of this lab is entirely my own work,
// but I received assistance from [bard and my friends].
// Follow this with a description of the type of assistance (https://www.w3schools.com/java/java_arraylist.asp).import java.util.*;import java.util.*;

class CardAlgorithms {

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(Arrays.asList(
                "ClubsA", "SpadeK", "HeartsQ", "DiamondJ", "Clubs10", "Spade9",
                "Hearts8", "Diamond7", "Clubs6", "Spade5", "Hearts4", "Diamond3"
        ));

        System.out.println("Original order: " + cards);

        sortCards(cards);
        System.out.println("Sorted cards: " + cards);

        shuffleCards(cards);
        System.out.println("Shuffled cards: " + cards);

        reverseCards(cards);
        System.out.println("Reversed cards: " + cards);

        shuffleCards(cards);
        System.out.println("Shuffled cards again: " + cards);
    }

    public static void sortCards(List<String> cards) {
        Collections.sort(cards);
    }

    public static void shuffleCards(List<String> cards) {
        Collections.shuffle(cards);
    }

    public static void reverseCards(List<String> cards) {
        Collections.reverse(cards);
    }
}
