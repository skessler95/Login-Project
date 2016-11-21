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
public class personController {
    final private personModel model;
    final private personView view;

    personController(personModel model, personView view) {
        this.model = model;
        this.view = view;
                
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == view.getsaveButton()){
                model.setFirstName(view.getFirstName());
                model.setLastName(view.getLastName());
                model.setUserName(view.getUserName());
                model.setPassword(view.getPassword());
                }
            }
        }
        
        view.addsaveButtonListener(new ButtonListener());  
        
    } 
}
