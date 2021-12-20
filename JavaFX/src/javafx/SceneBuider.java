  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author P
 */
public class SceneBuider extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       try {
            Parent root = FXMLLoader.load(getClass().getResource("SceneBuider.fxml")); // bug
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("scenebuider.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();

//            Parent root = FXMLLoader.load(getClass().getResource("SceneBuider.fxml"));// bug
//            primaryStage.setTitle("fewsfewfwee");
//            primaryStage.setScene(new Scene(root));
//            primaryStage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }

         
        
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
