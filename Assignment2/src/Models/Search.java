package Models;

import com.google.gson.annotations.SerializedName;

public class Search {
    @SerializedName("Search")
    private Weapons[] weaponsArray;

    /**
     * Constructor
     * @param weaponsArray
     */
    public Search(Weapons[] weaponsArray) {
        setWeaponsArray(weaponsArray);
    }

    /**
     * get weapons method
     * @return
     */
    public Weapons[] getWeaponsArray() {
        return weaponsArray;
    }

    /**
     * set weapons method
     * @param weaponsArray
     */
    public void setWeaponsArray(Weapons[] weaponsArray) {
        this.weaponsArray = weaponsArray;
    }
}
