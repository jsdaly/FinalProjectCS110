/**
Julianne Daly
CS 110 
Hand class that draws cards from Deck and adds them to a hand
@param HALF is a constant 
@param hand is a ListArrayListBased that holds the cards being added
*/


public class Hand extends Deck
{
   private final int HALF = 26;
   private ListArrayListBased hand;
   
   /** 
   Constructor takes in a Deck object and draws cards to add to hand
   @param hand creating a new ListArrayListBased
   */
   public Hand(Deck deck)
   {
      hand = new ListArrayListBased();
      
      for (int i=0; i<= HALF; i++)
      {
         Card card = deck.draw();
         hand.add(i,card);
         
      } 
   }
   /** 
   size method returns the size of the hand
   @return hand.size() calling on size method and returns the integer
   */
   public int size()
   {
      return hand.size();
   }
   /**
   add method takes an integer and card object and adds 
   one to tthe hand that is connected to the card object
   */
   public void add(int ind, Card card)
   {
      hand.add(hand.size()+1,card);
   }
   /**
   draw method gets the value of first card returns and removes it
   @param card is a Card object that holds the card value
   @return card returns the card value
   */
   public Card draw()
   {
      Card card;
      card = (Card)(hand.get(1));
      hand.remove(1);
      return card;
   }
   /**
   isEmpty method returns whether the hand is empty
   @return true or false
   */
   public boolean isEmpty()
   {
      if (hand.isEmpty())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}