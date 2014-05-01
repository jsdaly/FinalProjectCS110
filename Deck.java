import java.util.Random;


public class Deck 
{
   private static final int singleCard=1;
   private int a=52;
   private int suits=4;
   private int ranks=13;
  

   private ListArrayListBased deck = new ListArrayListBased();
   
   public Deck()
   {
    for(int i=1;i<=suits;i++)
    {
      for(int j=1;j<=14;j++)
      {
         Card card = new Card(i,j);
         deck.add(j,card);        
            
       }
      }
      shuffle();
      }  
   
    
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 1; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i);
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp);
      }      
   }
  public Card draw()
  {
   Card card;
   card=(Card)(deck.get(singleCard));
   deck.remove(singleCard);
   return card;
   }
   public int cardsRemaining()
   {
     return deck.size();
   }
   
 }  
   
   
   
   
  