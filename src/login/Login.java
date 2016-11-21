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
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personModel model = new personModel();
        personView view = new personView(model);
        personController controller = new personController(model, view);
      
        view.setVisible(true);
    }
    
}
