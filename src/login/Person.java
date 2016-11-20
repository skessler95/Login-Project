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
public class Person {
    private String fName;
    private String lName;
    
    Person(){
        
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
}
