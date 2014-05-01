/**
Julianne Daly
CS 110
War class creates two players and two hands for them to be able to play the game
@param deck is a Deck object 
@param p1 is a Hand object that represents one player hand
@param p2 is a Hand object the represent one players hand
*/


public class War
{
   private Deck deck;
   private Hand p1;
   private Hand p2;
   /**
   Constructor that creates a deck and two players
   */
   public War()
   {
      deck = new Deck();
      p1 = new Hand(deck);
      p2 = new Hand(deck);
   
   }
   /**
   draw method that takes in an int, draws a card for each player and  returns it
   */
   public Card draw(int t)
   {
     if (t==1)
       return p1.draw();
   
     else
    
      return p2.draw(); 
   }
   /**
   add method take an int and a Card object. It adds one to the size of a players hand.
   */
   public void add(int t, Card cardA)
   {
      if(t==1)
      {
         p1.add(p1.size()+1,cardA);
      }
      else
      {
         p2.add(p2.size()+1,cardA);
      } 
   }
   /**
   add method takes an int and two card objects. It adds one to the size of a specific Card object
   */
   public void add(int t, Card card1, Card card2)
   {
      if(t==0)
      {
         p1.add(p1.size()+1,card1);
         p1.add(p1.size()+1,card2);
      }
      else
      {
         p2.add(p2.size()+1,card1);
         p2.add(p2.size()+1,card2);
      }
   }
   /**
   handSize method returns the hand size of each player
   */
   public int handSize(int t)
   {
      if (t==1)
         return p1.size();
      else
         return p2.size();
   }
   
   /**
   noCard method calls on the isEmpty method and returns it if the hand the player has not cards
   */ 
     
   public boolean noCards(int t)
   {
      if (t==1)
         return p1.isEmpty();
      else
         return p2.isEmpty();
   }
   
}   
   
   
   
   
   
   
   
   
   
   
   
   
   
   