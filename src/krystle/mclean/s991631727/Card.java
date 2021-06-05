package krystle.mclean.s991631727;
import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.
 * @author dancye
 * @author Paul Bonenfant
 * @author Krystle McLean
 * @date 2021-06-03
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;    //private int value;//1-13


   public static final String [] SUITS = {"Diamonds", "Hearts", "Spades", "Clubs"};
   
  
   // made int values string values so that I could include in array plus no calculations so easier 
   //I only want to call  values 1-13 
   //null to make easier for user to not pick 0 but 1 -13 
   public static final String [] VALUES = {null, "Ace", "2", "3","4","5","6","7","8","9","10","J","Q","K"};
   
   
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }
    /**
     * 
     * @param value 
     */

    public void setValue(int value) {
        this.value = value;
    }
    
    // Method using Math.random to return a random card suit
    //type casted to int as I needed to search a whole integer number
    /**
     * 
     * @return suitValue
     */
    
    
    //Method that finds a random card value it is mulitiplied by 13
    //because 13 cards in each suit , also typecasted to int 
    /**
     * 
     * @return suitRank
     */
    public int aRandomRank()
    {
        int suitRank = (int)(Math.random()*13);
        return suitRank;
        
    }
    
    public int aRandomSuit() 
    {
        int suitValue = (int)(Math.random()* 4);
        return suitValue;
        
    }
    
   
   
    
}
