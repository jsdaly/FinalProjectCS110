public class Hand extends Deck
{
   private final int HALF = 26;
   private ListArrayListBased hand;
   
   public Hand(Deck deck)
   {
      hand = new ListArrayListBased();
      
      for (int i=0; i<= HALF; i++)
      {
         Card card = deck.draw();
         hand.add(i,card);
         
      } 
   }
   
   public int size()
   {
      return hand.size();
   }
   
   public void add(int index, Card card)
   {
      hand.add(hand.size()+1,card);
   }
   
   public Card draw()
   {
      Card card;
      card = (Card)(hand.get(1));
      hand.remove(1);
      return card;
   }
   
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