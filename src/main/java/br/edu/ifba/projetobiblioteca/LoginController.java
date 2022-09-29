package br.edu.ifba.projetobiblioteca;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {
    
 
    @FXML
    private Button closeBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    } 
   
    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

}
