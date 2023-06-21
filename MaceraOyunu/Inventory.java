package MaceraOyunu;

public class Inventory {

    private Armor armor;
    private Weapon weapon;
    private String food;
    private String firewood;
    private String water;

    public Inventory() {
        this.armor = new EmptyArmor();
        this.weapon = new EmptyWeapon();
        this.food = "YOK";
        this.water = "YOK";
        this.firewood = "YOK";
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFirewood() {
        return firewood;
    }

    public void setFirewood(String firewood) {
        this.firewood = firewood;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }
}