package Utilities;

import Models.Search;
import Models.Weapons;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONReader {

    /**
     * Reads the JSON file and stores each object into an arraylist
     * @param jsonFile
     * @return
     */
    public static ArrayList<Weapons> getWeaponsList(String jsonFile){
        ArrayList<Weapons> weapons = new ArrayList<>();
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader(jsonFile); JsonReader jsonReader = new JsonReader(fileReader)){
            Search searchResult = gson.fromJson(jsonReader, Search.class);
            weapons.addAll(Arrays.asList(searchResult.getWeaponsArray()));
        }
        catch(Exception exeption){
            exeption.printStackTrace();
        }
        return weapons;
    }
}
