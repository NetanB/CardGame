import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> deck;

    /**
     * This is the constructor , ti will need to build 52 card objects and add
     * them to the deck
     *
     * This is a constructor , so it does not hav a return type and the name
     * mattches teh class name exactly(including the upper case first)
     */

    public DeckOfCards()
    {
        deck = new ArrayList<>();
    // Calling getValidSuits() returns
    //index 0        1          2         3
    // ["clubs", "hearts","diamonds","spades"}
    // normal for loop works this way



    // What is in each position         collection to iterate over;
        for (String suit         :      Card.getValidSuits())
        {
            for(String faceName : Card.getValidFaceName())
            {
                System.out.printf("suit: %s faceName: %s%n", suit, faceName);
                Card newCard = new Card(faceName, suit);
                deck.add(newCard);
            }
        }
    }
}
