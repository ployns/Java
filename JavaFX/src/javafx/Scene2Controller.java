/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Scene2Controller  {

    @FXML
    private Label nameLabel;
    
    public void displayName(String username){
        nameLabel.setText("Hello : " + username);
    }
    
}
