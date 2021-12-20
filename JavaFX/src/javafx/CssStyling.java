  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
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
public class CssStyling extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
       try {
            Parent root = FXMLLoader.load(getClass().getResource("CssStyling.fxml")); // bug
            Scene scene = new Scene(root);
      //      scene.getStylesheets().add(getClass().getResource("cssstyling.css").toExternalForm());
            String css = this.getClass().getResource("cssstyling.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.show();

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
