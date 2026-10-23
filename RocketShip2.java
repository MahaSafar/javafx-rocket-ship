/*
 * 
 */

package com.mycompany.rocketship2;
// First step : includes packages 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

// Second Step:  inherit Application in your class 
public class RocketShip2 extends Application{
    
    // Third Step: Overrid the "start" method 
    @Override
    public void start(Stage stage){
        Rectangle body = new Rectangle(150, 100, 80, 200);
        body.setFill(Color.SILVER);
        body.setStroke(Color.BLACK);
        body.setStrokeWidth(2);
        
        Polygon top = new Polygon();
        top.getPoints().addAll(150.0, 100.0, 190.0, 40.0, 230.0, 100.0);
        top.setFill(Color.RED);
        top.setStroke(Color.BLACK);
        top.setStrokeWidth(2);
        
        
       Polygon leftwing = new Polygon();
       leftwing.getPoints().addAll(150.0, 250.0, 110.0, 300.0, 150.0, 300.0);
       leftwing.setFill(Color.BLUE );
        leftwing.setStroke(Color.BLACK);
        leftwing.setStrokeWidth(2);
        
        
        Polygon rightwing = new Polygon();
        rightwing.getPoints().addAll(230.0, 250.0, 270.0, 300.0, 230.0, 300.0);
        rightwing.setFill(Color.BLUE );
        rightwing.setStroke(Color.BLACK);
        rightwing.setStrokeWidth(2);
        
        
        Circle window = new Circle(190, 180, 20);
        window.setFill(Color.LIGHTBLUE);
        window.setStroke(Color.BLACK);
         window.setStrokeWidth(2);
         
         Rectangle flame = new Rectangle(175, 300, 30, 60);
         flame.setFill(Color.ORANGE);
         flame.setStroke(Color.BLACK);
         flame.setStrokeWidth(2);
         
         Group root = new Group();
         root.getChildren().addAll(body, top, leftwing, rightwing, window, flame);
         
         
         Scene scene = new Scene(root, 400, 400);
         stage.setTitle("Rocket Ship");
         stage.setScene(scene);
         stage.show();
         
    }

    public static void main(String[] args) {
        //Fourth Step : call the launch methods which will exe the "start" method 
        launch(args);
    }
}
