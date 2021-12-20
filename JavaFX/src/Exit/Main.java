/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author P
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) {

    try {

            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));// bug
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
                    });
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    
    }
    
    public void logout(Stage stage){
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!!");
        alert.setContentText("Do you want to save before exiting? : ");
        
        
        if(alert.showAndWait().get() == ButtonType.OK){
        System.out.println("You successfully logged out!");
        stage.close();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
