package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class PrincipalController implements Initializable{
@FXML
    private TableColumn<?, ?> customers_customerNumber;

    @FXML
    private ComboBox<?> avaliable_status;

    @FXML
    private TableColumn<?, ?> customers_totalPayment;

    @FXML
    private Button avaliableRooms_checkInBtn;

    @FXML
    private TextField avaliableRooms_price;

    @FXML
    private Button avaliableRooms_clearBtn;

    @FXML
    private TextField customers_search;

    @FXML
    private TableColumn<?, ?> customers_firstName;

    @FXML
    private Button avaliableRooms_addBtn;

    @FXML
    private AnchorPane dasboard_bookToday;

    @FXML
    private TableColumn<?, ?> avaliableRooms_col_roomNumber;

    @FXML
    private ComboBox<?> avaliableRooms_roomType;

    @FXML
    private TableColumn<?, ?> avaliableRooms_col_roomType;

    @FXML
    private TableColumn<?, ?> avaliableRooms_col_price;

    @FXML
    private Button avaliableRooms_deleteBtn;

    @FXML
    private Button avaliableRooms_serachBtn;

    @FXML
    private AnchorPane dasboard_IncomeToday;

    @FXML
    private TableColumn<?, ?> avaliableRooms_col_status;

    @FXML
    private ImageView closeBtn;

    @FXML
    private TableView<?> customers_tableView;

    @FXML
    private TableView<?> avaliableRooms_tableView;

    @FXML
    private TextField avaliableRooms_search;

    @FXML
    private TableColumn<?, ?> customers_phoneNumber;

    @FXML
    private AnchorPane dasboard_incomeTotal;

    @FXML
    private Button avaliableRooms_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private TableColumn<?, ?> customers_lastName;

    @FXML
    private Button avaliableRooms_updateBtn;

    @FXML
    private AreaChart<?, ?> dasboard_areaChart;

    @FXML
    private AnchorPane dasboard_form;

    @FXML
    private Button customers_btn;

    @FXML
    private TextField avaliableRooms_roomNumber;

    @FXML
    private AnchorPane avaliableRooms_form;

    @FXML
    private Button customers_searchBtn;

    @FXML
    private AnchorPane customers_form;

    @FXML
    private Button dasboard_btn;

    @FXML
    private TableColumn<?, ?> customers_checkedin;

    @FXML
    private TableColumn<?, ?> customers_checkedout;

    @FXML
    private Label username;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dasboard_btn.setOnMouseClicked(((MouseEvent e) -> {
            dasboard_form.setVisible(true);
           avaliableRooms_form.setVisible(false);
        }));
    }
    
    
}
