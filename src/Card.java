/**
 * Created by chrisaanerud on 3/21/17.
 */
public class Card {




    public Card(boolean b) {
    }

    public Card(Rank rank, String suit) {
        Color getColor();


        {

            switch (suit)
            {

                Suit suit1 = Suit.SPADES;
                Suit suit2 = Suit.CLUBS;
                Suit suit3 = Suit.DIAMONDS;
                Suit suit4 = Suit.HEARTS;

                case SPADES: case CLUBS: return Color.black;
                case HEARTS: case DIAMONDS: return Color.red;
                default: return Color.white;
            }
        }
    }

    // public static void main(String[] args){


    public void redOrBlack() {
    }


    public void redOrBlackGiven() {

    }

    public Color getColor() {
        return Color.BLACK;
    }
//}


}
