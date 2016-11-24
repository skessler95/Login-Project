/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class NavViewPanel extends JPanel {
    
    NavViewBottomMenuPanel menu;
    ViewSplash splash;
    
    loginView l_view;
    MainView m_view;
    
    public NavViewPanel(){
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new ViewSplash();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);       
    }
     public void addLogins(loginView l_view)
    {
        this.l_view = l_view; //maintain handle to this view so we can remove it
        add(l_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
      public void addMain(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
        public void addSplash(View n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
        public void removelogins()
    {
        if (this.l_view != null)
            remove(this.l_view);
    }
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }   
    
    public void removeSplash()
    {
        remove(splash);
    }

}
