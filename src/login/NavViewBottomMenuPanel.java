/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class NavViewBottomMenuPanel extends JPanel{
    JButton loginButton;
    JButton caButton;
    public NavViewBottomMenuPanel(){
    super();
    loginButton = new JButton("Create Account");
    caButton = new JButton("Login");
    
    add(loginButton);
    add(caButton);
    }
}
