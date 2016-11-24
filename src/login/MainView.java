/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Steven
 */
public class MainView extends JPanel{
    private JLabel MenuLabel;
    
    private MainModel m_model;
    private loginModel l_model;
    private JTextField username;
    private JTextField password;
    private JButton loginButton;
    
    MainView(MainModel m_model){
      this.m_model = m_model;
      
      MenuLabel = new JLabel("Welcome to the login screen");
      username = new JTextField("username");
      password = new JTextField("password");
      loginButton = new JButton("login");
      
      add(MenuLabel);
      add(username);
      add(password);
      add(loginButton);
      
    }
      public JButton geloginButton() {
            return loginButton;
        }

    
        public void setNextTurnButton(){
            this.loginButton = loginButton;
        }
          public JTextField getUsername() {
            return username;
        }

    
        public void setUsername(){
            this.username = username;
        }
         public JTextField getPassword() {
            return password;
        }

    
        public void setPassword(){
            this.password = password;
        }
        
}
