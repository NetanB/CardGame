import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // instantiateed  a scanneer object
        // new Scanner(System.in) is calling the "constructor" and passes in an argument
        // System.in(Which is the input stream)
//        Scanner in  = new Scanner(System.in);
//
//        System.out.println("Enter your name");
//        String name  = in.nextLine();
//        System.out.printf("Hello %s%n", name);
        Card aceOfSpades = new Card("ace", "spades");
        Card jdubCrazyCard = new Card("6", "hearts");

        System.out.println(aceOfSpades.getSuit());
        aceOfSpades.setSuit("hearts");
        System.out.println(aceOfSpades.getSuit());
        aceOfSpades.setFaceName("5");
        System.out.println(aceOfSpades.getFaceName());

        try {
            // Lets put an Invalid suit in here... Armani
            aceOfSpades.setSuit("armani");
            System.out.println(aceOfSpades.getSuit());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        DeckOfCards deck = new DeckOfCards();

        //look at the cards in teh deck by dealing them
        for (int i = 1; i<=52; i++)
        {
            System.out.println(deck.dealTopCard());
        }

        System.out.println("~~~~~~~~~Shuffling the cards~~~~~~~~~~");
        DeckOfCards deck2 = new DeckOfCards();
        deck2.Shuffle();
        for (int i = 1; i<=52; i++)
        {
            System.out.println(deck2.dealTopCard());
        }

        //sumulate dealing 4 hands of cards
        DeckOfCards deck3 = new DeckOfCards();
        deck.Shuffle();
        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();
        ArrayList<Card> hand3 = new ArrayList<>();
        ArrayList<Card> hand4 = new ArrayList<>();

        for(int i = 1 ; i<=5; i++)
        {
            hand1.add(deck.dealTopCard());
            hand2.add(deck.dealTopCard());
            hand3.add(deck.dealTopCard());
            hand4.add(deck.dealTopCard());

        }

        System.out.println("~~~~~~Showing the hands of cards~~~~~~~~~~~~");
        for (Card card : hand1)
            System.out.println("Hand 1 card: " + card);
        for (Card card : hand1)
            System.out.println("Hand 2 card: " + card);
        for (Card card : hand1)
            System.out.println("Hand 3 card: " + card);
        for (Card card : hand1)
            System.out.println("Hand 4 card: " + card);

    }
}
