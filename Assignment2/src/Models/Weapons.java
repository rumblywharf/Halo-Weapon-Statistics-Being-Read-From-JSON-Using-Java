package Models;

import com.google.gson.annotations.SerializedName;

public class Weapons {
    @SerializedName("GameTitle")
    private String gameTitle;

    @SerializedName("Title")
    private String title;

    @SerializedName("Picture")
    private String picture;

    @SerializedName("ShieldsTTk")
    private String shieldsTTK;

    @SerializedName("HealthTTK")
    private String healthTTK;

    @SerializedName("TotalTTK")
    private String totalTTK;

    @SerializedName("Headshots")
    private String headshots;

    @SerializedName("Projectile")
    private String projectile;

    @SerializedName("RateOfFire")
    private String rateOfFire;

    @SerializedName("Bloom")
    private String bloom;

    @SerializedName("Ammo")
    private String ammo;

    @SerializedName("Overheat")
    private String overheat;

    /**
     * Constructor for my Halo Weapons
     * @param gameTitle
     * @param title
     * @param picture
     * @param shieldsTTK
     * @param healthTTK
     * @param totalTTK
     * @param headshots
     * @param projectile
     * @param rateOfFire
     * @param bloom
     * @param ammo
     * @param overheat
     */
    public Weapons(String gameTitle, String title, String picture, String shieldsTTK, String healthTTK, String totalTTK, String headshots, String projectile, String rateOfFire, String bloom, String ammo, String overheat) {
        setGameTitle(gameTitle);
        setTitle(title);
        setPicture(picture);
        setShieldsTTK(shieldsTTK);
        setHealthTTK(healthTTK);
        setTotalTTK(totalTTK);
        setHeadshots(headshots);
        setProjectile(projectile);
        setRateOfFire(rateOfFire);
        setBloom(bloom);
        setAmmo(ammo);
        setOverheat(overheat);
    }

    /**
     * All my getters and setters for each variable created
     */
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getShieldsTTK() {
        return shieldsTTK;
    }

    public void setShieldsTTK(String shieldsTTK) {
        this.shieldsTTK = shieldsTTK;
    }

    public String getHealthTTK() {
        return healthTTK;
    }

    public void setHealthTTK(String healthTTK) {
        this.healthTTK = healthTTK;
    }

    public String getTotalTTK() {
        return totalTTK;
    }

    public void setTotalTTK(String totalTTK) {
        this.totalTTK = totalTTK;
    }

    public String getHeadshots() {
        return headshots;
    }

    public void setHeadshots(String headshots) {
        this.headshots = headshots;
    }

    public String getProjectile() {
        return projectile;
    }

    public void setProjectile(String projectile) {
        this.projectile = projectile;
    }

    public String getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(String rateOfFire) {
        this.rateOfFire = rateOfFire;
    }

    public String getBloom() {
        return bloom;
    }

    public void setBloom(String bloom) {
        this.bloom = bloom;
    }

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
    }

    public String getOverheat() {
        return overheat;
    }

    public void setOverheat(String overheat) {
        this.overheat = overheat;
    }

    /**
     * Creates a to string that displays in the given format for each object in the listview
     * @return
     */
    public String toString(){
        return String.format("%s from %s", title, gameTitle);
    }
}
