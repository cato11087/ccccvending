import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class VendingMachine extends JFrame {
  
  public static void main(String[] args) {
    
    //GUI frame for vending machine
     JFrame vending = new JFrame();
    
    vending.setTitle("Vending Machine");
    vending.setSize(500,900);
    vending.setLocationRelativeTo(null);
    
    //screen prompt
    JTextField userPrompt = new JTextField("Please Make A Selection!");
    userPrompt.setPreferredSize(new Dimension(100, 24));
    userPrompt.setHorizontalAlignment(JTextField.CENTER);
    
    //button layout for user input
    JPanel buttonPanel = new JPanel();
    
    buttonPanel.setLayout(new GridLayout(5,3));
    buttonPanel.setPreferredSize(new Dimension(250, 100));
    vending.add(buttonPanel, BorderLayout.EAST);
    
        for(char i = 'A'; i <= 'K'; i++)
    {
    buttonPanel.add(new JButton(String.valueOf(i)));
    }
        for(int i = 1; i <= 10; i++) 
    {
    buttonPanel.add(new JButton(String.valueOf(i%10)));
    }
        

     
    //panel for items
    JPanel itemPanel = new JPanel();
    itemPanel.setLayout(new GridLayout(4,1));
    vending.add(itemPanel, BorderLayout.WEST);
    /*
     * **I can't seem to connect an array to a JButton and have it appear
     * on the panel. Think you could check this out?
     * 
    //buttons for items & Arrays for items
     JButton itemButtons = new JButton[5];
      
        //Array for items
  String[] items = {"Beverage1", "Snack1", "Beverage2", "Snack2",};
    
    for (int i = 0; i < items.length; i++)
    {
     itemButtons[i] = new JButton(items[i]);
    }
    
    */
    
    
    vending.add(userPrompt, BorderLayout.NORTH);
    vending.setVisible(true);
  }
  
  /* ADD YOUR CODE HERE */
  
}
