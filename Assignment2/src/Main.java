import Models.Weapons;
import Utilities.JSONReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    /**
     * Prepares the stage to be presented
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Views/HaloWeapoons.fxml"));
        primaryStage.setTitle("Halo Weapons Locker");
        primaryStage.getIcons().add(new Image("./Images/icon.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Reads the JSON file and adds each object to an array list
     * This also launches the program
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Weapons> weapons = new ArrayList<>();
        try{
            weapons.addAll(JSONReader.getWeaponsList("./src/weapons.json"));
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        System.out.println(weapons);
        launch(args);
    }
}
