package pokercard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    private static List<Card> cards = new ArrayList<>(52);
    static {
        for(int i = 0; i < 52; i++) {
            cards.add(new Card(Card.FACE[i%13], Card.SUITS[i/13],Card.COLOR[i/26]));
        }
    }
    public static Card [] shffle(){
        for(int i = 0; i < cards.size(); i++) {
            Collections.swap(cards, i, (int) (Math.random() * cards.size() - 1));
        }
        return cards.toArray(new Card[52]);
    }
    public void prinCard(Card [] cards){
        for (int i = 0; i < cards.length; i++){
            System.out.println(cards[i]);
        }
    }
}
