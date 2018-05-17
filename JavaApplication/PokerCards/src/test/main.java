package test;
import pokercard.Poker;
import pokercard.Shuffle;
public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Shuffle s = new Shuffle();
//        s.shuffle();
//        s.deal();
        Poker p = new Poker();
        p.prinCard(p.shffle());
    }

}
