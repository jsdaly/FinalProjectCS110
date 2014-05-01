/**
Julianne Daly
CS 110
This class represents a deck and holds cards in deck
which is a ListArrayListBased
*/


import java.util.Random;
/**
@param singleCard used to draw card
@param a value holds number or cards in a deck
@param suit holds number of suits in a deck
@param rank holds number of ranks in a deck
@param deck creates a ListArrayListBased
*/

public class Deck 
{
   private static final int singleCard=1;
   private int a=52;
   private int suits=4;
   private int ranks=13;
  

   private ListArrayListBased deck = new ListArrayListBased();
   /**
   Constructor that creates the new cards and adds them to deck
   */
   public Deck()
   {
    for(int i=1;i<=suits;i++)
    {
      for(int t=1;t<=14;t++)
      {
         Card card = new Card(i,t);
         deck.add(t,card);        
            
       }
      }
      //calling on shuffle method
      shuffle();
      }  
   /**
   Shuffle method represents shuffling the deck
   @param randNum holds integer value
   @param acard holds value of card object
   */
    
   public void shuffle()
   {
      int randNum;
      Card acard;
      Random r = new Random();
      for (int i = 1; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         acard = (Card)(deck.get(i));
         deck.add(i,(Card)(deck.get(randNum)));
         deck.add(randNum,acard);
         
      }      
   }
   /**
   draw method draws a value or a card from the deck, returns and removes it
   @param card holds value of Card object 
   @return card returns value drawn
   */
  public Card draw()
  {
   Card card;
   card=(Card)(deck.get(singleCard));
   deck.remove(singleCard);
   return card;
   }
   /**
   cardsRemaining returns size of deck
   @param deck.size() is calling on size method and returns the size of deck
   */
   public int cardsRemaining()
   {
     return deck.size();
   }
   
 }  
   
   
   
   
  