/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

//import java.awt.GridLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Steven
 */
public class loginView extends JPanel implements ActionListener{
  
  JLabel firstName;
  JTextField fName;
  JLabel lastName;
  JTextField lName;
  JLabel username;
  JTextField Username;
  JLabel password;
  JTextField Password;
  JButton saveButton;
  loginModel people;
  JLabel outputLabel;

   
   final private loginModel l_model;
    
    loginView(loginModel l_model){
        this.l_model = l_model;
        
        people = new loginModel();
        
       GridLayout grid = new GridLayout(5,10);
       setLayout(grid);
        
        firstName = new JLabel("First Name: ");
        add(firstName);      
        
        fName = new JTextField("          ");
        //Still trying to set the length of the textbox
        //Current command doesn't work
        //fName.setSize(new Dimension(10,3));
        add(fName);
        
        lastName = new JLabel("Last Name: ");
        add(lastName);      
        
        lName = new JTextField("          ");
        add(lName);
        
        username = new JLabel("UserName: ");
        add(username);   
        
        Username = new JTextField("          ");
        add(Username);
        
        password = new JLabel("Password: ");
        add(password);      
        
        Password = new JTextField("          ");
        add(Password);
        
        saveButton = new JButton("Submit");
        saveButton.addActionListener(this);
        add(saveButton);
        
        outputLabel = new JLabel("Please provide required information.");
        add(outputLabel);        
        
        JPanel content = new JPanel();
        content.add(firstName);
        content.add(fName);
        content.add(lastName);
        content.add(lName);
        content.add(username);
        content.add(Username);
        content.add(password);
        content.add(Password);
        content.add(saveButton);
        content.add(outputLabel);
//        this.setContentPane(content);
//        this.pack();
//        this.setTitle("Login Create Account");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
  
    public void addsaveButtonListener(ActionListener al) 
    {    
        saveButton.addActionListener(al);
    }
    public void setFirstName(String firstName)
    {
        fName.setText(firstName);
    }
    public void setLastName(String lastName){
        lName.setText(lastName);
    }
    public void setUserName(String newUsername){
        Username.setText(newUsername);
    }
    public void setPassword(String newPassword){
        Password.setText(newPassword);
    }
    public String getFirstName(){
       return fName.getText();
    }
    public String getLastName(){
       return lName.getText(); 
    }
    public String getUserName(){
        return Username.getText();
    }
    public String getPassword(){
        return Password.getText();
    }
    public JButton getsaveButton(){
        return saveButton;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
          JButton eventsource = (JButton)e.getSource();
       if(eventsource == saveButton){
       people.setFirstName(fName.getText());
       people.setLastName(lName.getText());
       people.setUserName(Username.getText());
       people.setPassword(Password.getText());
       outputLabel.setText("Account created");
       } 
       
    }
}
