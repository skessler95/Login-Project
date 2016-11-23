/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class ViewSplash extends JPanel{
    JButton splashButton;
    JLabel titleLabel;
    
       ViewSplash(){
        
        splashButton = new JButton(new ImageIcon(""));
        add(splashButton);
    
        titleLabel = new JLabel("Login by Group 4");
        add(titleLabel);
  }
}
