public class War
{
   private Deck deck;
   private Hand p1;
   private Hand p2;
   
   public War()
   {
      deck = new Deck();
      p1 = new Hand(deck);
      p2 = new Hand(deck);
   
   }
   
   public Card draw(int t)
   {
     if (t==0)
       return (Card)(p1.draw());
   
     else
    
      return (Card)(p2.draw()); 
   }
   
   public void add(int t, Card cardA)
   {
      if(t==0)
      {
         p1.add(p1.size()+1,cardA);
      }
      else
      {
         p2.add(p2.size()+1,cardA);
      } 
   }
   
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
   
   public int handSize(int t)
   {
      if (t==0)
         return p1.size();
      else
         return p2.size();
   }
   
   public String toString()
   {
      String string1, string2;
      
      string1 = "User: " + p1.size();
      string2 = "Computer: " + p2.size();
      
      return string1 + "\n" + string2;
   }
   
   public void numberCards(ListArrayListBased list)
   {
      System.out.println("Winning Card: ");
      for(int t=1; t<=list.size();t++)
      {
         System.out.println(list.get(t));
      }
   }
   
   public boolean noCards(int t)
   {
      if (t==0)
         return p1.isEmpty();
      else
         return p2.isEmpty();
   }
   
}   
   
   
   
   
   
   
   
   
   
   
   
   
   
   