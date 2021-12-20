/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author P
 */
public class SceneController  {

    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePage;
    
    Stage stage;
    
    public void logout(ActionEvent e){
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!!");
        alert.setContentText("Do you want to save before exiting? : ");
        
        
        if(alert.showAndWait().get() == ButtonType.OK){
        stage = (Stage) scenePage.getScene().getWindow();
        System.out.println("You successfully logged out!");
        stage.close();
        }
    }

}
