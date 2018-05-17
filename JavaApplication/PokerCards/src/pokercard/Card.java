package pokercard;


public class Card {
    
    public static final String[] FACE = {"Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "J", "Q", "K"};
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] COLOR = {"RED","BLACK"};
    
    private String face;
    private String suit;
    private String color;
    public Card(String face, String suit, String color) {
        this.face = face;
        this.suit = suit;
        this.color = color;
    }
    
    public String toString(){
        return face + " " + suit + " " + color;
    }
}
