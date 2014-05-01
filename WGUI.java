import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WGUI extends JFrame
{
   
   private JPanel buttonPanel1;
   private JPanel buttonPanel2;
   private JLabel messageLabel;  
   private JLabel imageLabel1;
   private JLabel imageLabel2;
   private JButton button1;
   private JButton button2;
   private Card card1, card2; 
   private War game;
   
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
      //buttonPanel2.setSize(50,50);
      add(imageLabel1, BorderLayout.WEST);
      add(imageLabel2, BorderLayout.EAST);
      add(buttonPanel1, BorderLayout.SOUTH);
     // add(buttonPanel2, BorderLayout.SOUTH);
      add(messageLabel, BorderLayout.NORTH);
      pack();
      setVisible(true);
    }
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
         
     public void buildButtonPanel()
      {
         
         buttonPanel1 = new JPanel();
         button1 = new JButton("Filp");
         button1.addActionListener(new ButtonListener());
         buttonPanel1.add(button1);
         
        //  buttonPanel2 = new JPanel();
//          button2 = new JButton("End Game");
//          button2.addActionListener(new ButtonListener1());
//          buttonPanel2.add(button2);
      }
      private class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
           //  flip(); 
//             
//             card1 = new ImageIcon(" ");
//             imageLabel1.setIcon(card1);
//             imageLabel1.setText(null);
//             
//             card2 = new ImageIcon(" ");
//             imageLabel2.setIcon(card2);
//             imageLabel2.setText(null);
//             
//             pack();
          }
        }
      //  private class ButtonListener1 implements ActionListener
//        {
//          public void actionPerformed(ActionEvent e)
//          {
//             System.exit(0);
//           }
//         }
         
                
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
    new WGUI();
    }
    } 