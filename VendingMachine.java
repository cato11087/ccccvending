import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VendingMachine {
  
  
  public static void main(String[] args) { 
    
    
    JFrame vending = new JFrame();
    
    vending.setTitle("Vending Machine");
    vending.setSize(400,800);
    vending.setLocationRelativeTo(null);
    
    JTextField itemPrice = new JTextField();
    itemPrice.setHorizontalAlignment(JTextField.RIGHT);
    
    vending.add(itemPrice, BorderLayout.NORTH);
    
    
    
    vending.setVisible(true);
  }
  
  /* ADD YOUR CODE HERE */
  
}
