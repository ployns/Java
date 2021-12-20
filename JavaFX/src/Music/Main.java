package Music;  
import java.io.File;  
  
import javafx.application.Application;  
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;  
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;  
import javafx.stage.Stage;  

  
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
       try {

            Parent root = FXMLLoader.load(getClass().getResource("Music.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}