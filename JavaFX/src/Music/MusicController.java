/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Music;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;




public class MusicController implements Initializable {
    
    @FXML
    private Button play;

            String musicFile = "C:\\Users\\P\\Documents\\NetBeansProjects\\JavaFX\\src\\Music\\Music.mp3";     
            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    public void playButton(ActionEvent event){
        mediaPlayer.play();
    }
}
