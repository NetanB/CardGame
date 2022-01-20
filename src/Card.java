import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Card {
    private String suit, faceName;

    /**
     *This is the constructor, it takes the face name and the suit
     * of the card
     */

    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method will ensure that the argument is club, heart , diamond, spades
     * suit  - a string that represents the suit
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        if(getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was not in the valid list: " + getValidSuits());
    }

    /**
     * This method will return a list of valid suits
     * @return "clubs", "hearts","diamonds","spades"
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("clubs", "hearts","diamonds","spades");
    }


    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if(getValidFaceName().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " was not in " + getValidFaceName());
    }

    /**
     * This method will return a list of valid face Names
     * @return ""2","3", "4", "5", "6", "7", "8","9", "10","jack", "queen", "king", "ace"
     */
    public static List<String> getValidFaceName()
    {
        return Arrays.asList("2","3", "4", "5", "6", "7", "8","9", "10","jack", "queen", "king", "ace");
    }
}
