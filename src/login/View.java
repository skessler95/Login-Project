/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Steven
 */
public class View extends JFrame{
    Model model;
    NavViewPanel nVpanel;
    
    View(Model model){
        super("login");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        nVpanel = new NavViewPanel();
        
        add(nVpanel); 
    }
    public void switchToLoginPanel(loginView l_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.addLogins(l_view);        
    }
     public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removelogins();
        nVpanel.addMain(m_view);        
    }
    public void addLoginsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.loginButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.caButton.addActionListener(al);
    }       
}
