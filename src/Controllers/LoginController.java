/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author usuario
 */
public class LoginController implements Initializable{
  @FXML
    private PasswordField passwordText;

    @FXML
    private ImageView closeBtn;

    @FXML
    private TextField usernameText;

    @FXML
    private Button entrarBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       entrarBtn.setOnMouseClicked( (MouseEvent e)->{
           if( passwordText.getText().equals("123") && usernameText.getText().equals("user")){
               try {
                   Parent root  = FXMLLoader.load(getClass().getResource("/Views/Principal.fxml"));
                   Stage stage = new Stage();
                   Scene scene = new Scene(root);
                   stage.setScene(scene);
                   stage.initStyle(StageStyle.TRANSPARENT);
                   stage.show();
                   
                   entrarBtn.getScene().getWindow().hide();
               } catch (IOException ex) {
                   Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
               }
           }else{
               Alert alert = new Alert(Alert.AlertType.ERROR);
               alert.setTitle("Erro!");
               alert.setHeaderText(null);
               alert.setContentText("A senha ou o usuário está inválida!");
               alert.show();
           }
       
       });
       
       closeBtn.setOnMouseClicked((MouseEvent e)->{
           System.exit(0);
       
       });
    }
    
}
