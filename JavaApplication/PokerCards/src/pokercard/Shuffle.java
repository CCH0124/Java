package pokercard;

public class Shuffle {
    private final String suit[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private final String face[] = { "Ace", "2", "3", "4",
                                    "5", "6", "7", "8",
                                    "9", "10", "J", "Q", "K" };
    private int deck [][] = new int [4][13];
    
    private void init(int deck [][]){
        this.deck = deck;
        for (int i = 0; i < deck.length; i++){
            for(int j = 0; j < deck[i].length; j++){
                deck[i][j] = 0;
            }
        }
    }
    
    public void shuffle(){
        init(deck);
        int row, column, card;
        for ( card = 1; card <= 52; card++ ) {
           do {
              row = (int)(Math.random()*4);
              column = (int)(Math.random()*13);
           } while( deck[row][column] != 0 );

           deck[row][column] = card;
        }       
    }
    
    public void deal(){
        int card, row, column;

        for ( card = 1; card <= 52; card++ )

           for ( row = 0; row <= 3; row++ )

              for ( column = 0; column <= 12; column++ )

                 if ( deck[ row ][ column ] == card )
                     System.out.print(face[column] + " Of " + suit[row] + (card % 2 == 0 ? '\n' : '\t') );
    }
}
