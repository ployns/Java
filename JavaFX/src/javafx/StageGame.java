/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author P
 */
public class StageGame extends Application {
 
    
    public static void main(String[] args) {
        
        launch (args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root,Color.BLACK);
        
        Image icon = new Image("Image/icon.png"); // Floder?? can not run
        stage.getIcons().add(icon);
        
        stage.setTitle("OPPSONTEEN");
        stage.setWidth(1280);
        stage.setHeight(800);
        stage.setResizable(false);
//        stage.setX(50); //corner left top
//        stage.setY(50);

////////////////////////////////// FullScreen ////////////////////////////

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("press q to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        
        stage.setScene(scene);
        stage.show();
    }
    
}
