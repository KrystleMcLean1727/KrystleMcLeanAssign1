package krystle.mclean.s991631727;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Krystle McLean
 * @date 2021-06-03

 */
public class CardTrick {
    int suitChosen;

    public static void main(String[] args) {
       
        
        Card[] magicHand = new Card[1];
        
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Pick a card any card");
        System.out.println("Choose card value: For Face eg. A=1, J=2, Q=3, K=4, 4 = 4 ");
        int userCardPicked = userInput.nextInt();
        System.out.println("Pick a card suit i.e. Hearts=2, Clubs=4, Spades=3 or Diamonds=1");
        int userSuitPicked = userInput.nextInt();
        
        System.out.println("You Card is " + userCardPicked + " of " + userSuitPicked);
        

        for (int i = 0; i < magicHand.length; i++) {
          
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            
            c.setValue(c.aRandomRank());

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.aRandomSuit()]);
            magicHand[i] = c;
        }
        for(Card magicHandobj : magicHand) {
            System.out.println("My card is: " + magicHandobj.getValue() + " of " + magicHandobj.getSuit());
        }
        

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
