/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Steven
 */
public class personView extends JFrame implements ActionListener{
  JLabel firstName;
  JTextField fName;
  JLabel lastName;
  JTextField lName;
  JLabel username;
  JTextField Username;
  JLabel password;
  JTextField Password;
  JButton saveButton;
  personModel people;
  JLabel outputLabel;

   
   final private personModel model;
    
    personView(personModel model){
        this.model = model;
        
        people = new personModel();
        
       //GridLayout grid = new GridLayout(5,10);
       //setLayout(grid);
        firstName = new JLabel("First Name: ");
        add(firstName);
        
        fName = new JTextField(" ");
        add(fName);
        
        lastName = new JLabel("Last Name: ");
        add(lastName);
        
        lName = new JTextField(" ");
        add(lName);
        
        username = new JLabel("Username: ");
        add(username);
        
        Username = new JTextField(" ");
        add(Username);
        
        password = new JLabel("Password: ");
        add(password);
        
        Password = new JTextField(" ");
        add(Password);
        
        saveButton = new JButton("Submit");
        saveButton.addActionListener(this);
        add(saveButton);
        
        outputLabel = new JLabel("Please provide required information.");
        add(outputLabel);        
        
        JPanel content = new JPanel();
        content.add(fName);
        content.add(lName);
        content.add(saveButton);
        content.add(outputLabel);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Login");
        setSize(700,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
  
    public void addsaveButtonListener(ActionListener al) 
    {    
        saveButton.addActionListener(al);
    }
    public void setFirstName(String newfirstName)
    {
        fName.setText(newfirstName);
    }
    public void setLastName(String newlastName){
        lName.setText(newlastName); 
    }
    public void setUserName(String newUserName){
        Username.setText(newUserName);
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
    public JButton getsaveButton(){
        return saveButton;
    }
    public String getUserName(){
        return Username.getText();
    }
    public String getPassword(){
        return Password.getText();
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
