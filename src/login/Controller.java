/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Steven
 */
public class Controller {
    Model model;
    View view;
    
    loginModel l_model;
    loginView l_view;
    loginController l_controller;
    
    MainModel m_model;
    MainView m_view;
    MainController m_controller;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        
        l_model = new loginModel();        
        l_view = new loginView(l_model);
        l_controller = new loginController(l_model, l_view); 
        
        m_model = new MainModel();
        m_view = new MainView(m_model);
        m_controller = new MainController(m_view, m_model);
        
        view.addLoginsButtonListener (new LoginsButtonListener());
        view.addMainButtonListener(new MainButtonListener());        
    }
    class LoginsButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)
        {
         view.switchToLoginPanel(l_view);
        }
    }
    
    class MainButtonListener implements ActionListener {  
    @Override
    public void actionPerformed(ActionEvent e)
        {            
            view.switchToMainPanel(m_view);
        }
    }       
            
}
