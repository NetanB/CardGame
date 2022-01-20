import java.sql.SQLOutput;
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
    }
}
