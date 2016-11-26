/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Steven
 */
public class loginController {
    private loginModel l_model;
    private loginView l_view;
    private MainView m_view;
    loginController(loginModel l_model, loginView l_view) {
        this.l_model = l_model;
        this.l_view = l_view;
        this.m_view = m_view;        
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e){
                
                JButton clickSource = (JButton)e.getSource();
                
                if(clickSource == l_view.getsaveButton()){
                l_model.setFirstName(l_view.getFirstName());
                l_model.setLastName(l_view.getLastName());
                l_model.setUserName(l_view.getUserName());
                l_model.setPassword(l_view.getPassword());
                }
            }
        }
        
        l_view.addsaveButtonListener(new ButtonListener());  
        
    } 
}
