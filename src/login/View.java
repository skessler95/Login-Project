/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Steven
 */
public class View extends JFrame implements ActionListener{
    JLabel firstName;
    JTextField userfirstName;
    JLabel lastName;
    JTextField userlastName;
    JLabel username;
    JTextField userName;
    JLabel password;
    JTextField Password;
    
    final private Model model;
    
    View(Model model){
        
        
    } 
}
