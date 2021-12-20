/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class SceneController  {

       @FXML
       ImageView myImageView;
       
       @FXML
       Button myButton;
       
       Image myImage = new Image(getClass().getResourceAsStream("room1_2.jpg"));
       
       
       public void displayImage(){
           myImageView.setImage(myImage);
       }
}
