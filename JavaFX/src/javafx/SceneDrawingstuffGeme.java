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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author P
 */
public class SceneDrawingstuffGeme extends Application {
 
    
    public static void main(String[] args) {
        
        launch (args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root,1280,800,Color.SKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Ployyyyyyyyyyyyy");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Quicksand",50));
        text.setFill(Color.WHITE);
        
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(10);
        line.setStroke(Color.YELLOW);
        line.setOpacity(1);  // kwamchud 0-1
        line.setRotate(45);  // mun
        
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.DARKRED);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
                );
        triangle.setFill(Color.CHOCOLATE);
        
        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(500);
        circle.setRadius(50);
        circle.setFill(Color.BLACK);
        
        Image image = new Image("Image/icon.png"); // can not open file
        ImageView imageView = new ImageView(image);
        imageView.setX(600);
        imageView.setY(400);

        
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);


        
        stage.setScene(scene);
        stage.show();
    }
    
}
