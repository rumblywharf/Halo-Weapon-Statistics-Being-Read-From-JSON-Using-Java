package Controllers;

import Models.Weapons;
import Utilities.JSONReader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HaloWeaponsController implements Initializable {
@FXML
    private Button getWeaponsButton;
@FXML
    private TextField titleTextfield;
@FXML
    private ListView<Weapons> weaponListview;
@FXML
    private Label rowsreturnedLabel;

    /**
     * Makes the rows returned label updated
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rowsreturnedLabel.setText("Rows Returned: " + weaponListview.getItems().size());
    }

    /**
     * When the button is pressed clear the items in the listview, update the rows returned label with the amount of
     * items in the array and populate the listview with objects from the JSON
     */
    @FXML
    private void buttonPressed(){
        weaponListview.getItems().clear();
        try{
            weaponListview.getItems().addAll(JSONReader.getWeaponsList("./src/weapons.json"));
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        rowsreturnedLabel.setText("Rows Returned: " + weaponListview.getItems().size());

    }
}
