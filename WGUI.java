import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** 
WGUI class is a GUI that simulates a war game 
@param buttonPanel1 panel for flip button 
@param messageLabel label for start message
@param imageLabel1 holds the image of back of card
@param imageLabel2 holds the image of the card chosen
@param button1 the button to flip
@param card1 first Card object for one player
@param card2 first Card object for second player
@param war War object for the game
@param n1 String to hold the name of the card chosen
@param n2 String to hold the name of the other card chosen
*/

public class WGUI extends JFrame
{
   
   private JPanel buttonPanel1;
   private JLabel messageLabel;  
   private JLabel imageLabel1;
   private JLabel imageLabel2;
   private JButton button1;
   private Card card1, card2; 
   private War war;
   private String n1, n2;
   /**
   Constructor that sets the title and calls on methods and adds the labels and panels to GUI
   */
   public WGUI()
   {
      setTitle("War Game");
      setSize(1000,1000);
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      messageLabel = new JLabel("Press flip to start the game of War");
      buildImageLabel();
      buildButtonPanel();
      imageLabel1.setSize(50,50);
      imageLabel2.setSize(50,50);
      buttonPanel1.setSize(50,50);
     
      add(imageLabel1, BorderLayout.WEST);
      add(imageLabel2, BorderLayout.EAST);
      add(buttonPanel1, BorderLayout.SOUTH);
    
      add(messageLabel, BorderLayout.NORTH);
      pack();
      setVisible(true);
    }
    /**
    buildImageLabel method creats a label and shows the image of the bakc of the card
    @param back1 is the image of the back of the card for one player
    @param back2 is the image of the back of the card for the other player
    */
    public void buildImageLabel()
    {
      ImageIcon back1, back2;
      imageLabel1 = new JLabel();
      imageLabel2 = new JLabel();
      back1 = new ImageIcon("cardPics/back.jpg");
      back2 = new ImageIcon("cardPics/back.jpg");
      imageLabel1.setIcon(back1);
      imageLabel2.setIcon(back2);
      
    }
     /**
     buildButtonPanel method creats the burronPanel for the flip button and calls on the ButtonListener class
     */   
     public void buildButtonPanel()
      {
         
         buttonPanel1 = new JPanel();
         button1 = new JButton("Filp");
         button1.addActionListener(new ButtonListener());
         buttonPanel1.add(button1);
         
            }
       /**
       ButtonListener class completes the action of the button
       */
      private class ButtonListener implements ActionListener
      {
      /**
      actionPerformed method complete an action when the button is pushed
      @param image1 holds the image of one card chosen
      @param image2 holds the image of one card chosen
      */
         public void actionPerformed(ActionEvent e)
         {
         //calls flip method
            flip(); 
            //adds image of card to label
            ImageIcon image1 = new ImageIcon("cardPics/"+n1+".jpg");
            imageLabel1.setIcon(image1);
            imageLabel1.setText(null);
            
            ImageIcon image2 = new ImageIcon("cardPics/"+n2+".jpg");
            imageLabel2.setIcon(image2);
            imageLabel2.setText(null);
          //tries to compare  
          Card card, cardA, cardB;
           if (card.compareTo(cardA,cardB) = -1)
            {
               war.add(2,card2);   
            }
            else if (card.compareTo(card1,card2) =1)
            {
               war.add(1,card1); 
            }
            else
            {
               
            }
            //suppose to check when hand is empty and  will close
            if(war.isEmpty)
            {
            System.exit(0);
            }             
            pack();
          
        }
       /**
       flip method draws acard and gets the string of the card name
       @param n1 name of first card
       @param n2 name of second card
       */
      public void flip()
      {
         card1=war.draw(1);
         card2=war.draw(2);
         n1=card1.toString();
         n2=card2.toString();
      }
      
     
      }
      
      
      
      
                   
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
    new WGUI();
    }
    } 