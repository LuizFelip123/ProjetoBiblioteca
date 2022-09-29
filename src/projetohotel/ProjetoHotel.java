/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohotel;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author usuario
 */
public class ProjetoHotel extends Application {
    private double x = 0 ;
    private double y = 0;
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Views/Login.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        root.setOnMousePressed((MouseEvent e)->{
             x = e.getSceneX();
             y = e.getSceneY();
        });
        root.setOnMouseDragged((MouseEvent e)->{
       
            primaryStage.setX(e.getScreenX() - x);
            primaryStage.setY(e.getScreenY() - y); 
            primaryStage.setOpacity(0.8);
            
        });
        root.setOnMouseReleased((MouseEvent e)->{
            primaryStage.setOpacity(1);
        
        });
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
