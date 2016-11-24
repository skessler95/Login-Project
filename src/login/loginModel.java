/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Steven
 */
public class loginModel {
    private String fName;
    private String lName;
    private String Username;
    private String Password;
    loginModel(){
        
    }
   public void setFirstName(String fName){
      this.fName = fName; 
   }
   public String getFirstName(){
       return fName;
   }
    public void setLastName(String lName){
      this.lName = lName; 
   }
    public String getLastName(){
      return lName;
   }
    public void setUserName(String Username){
      this.Username = Username; 
   }
    public String getUserName(){
       return Username;
   }
    public void setPassword(String Password){
      this.Password = Password; 
   } 
    public String getPassword(){
       return Password;
   }
    
}
