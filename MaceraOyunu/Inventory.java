package MaceraOyunu;

public class Inventory {

    private Armor armor;
    private Weapon weapon;
    private int food;
    private int firewood;
    private int water;

    public Inventory() {
        this.armor = new EmptyArmor();
        this.weapon = new EmptyWeapon();
        this.food = 0;
        this.water = 0;
        this.firewood = 0;
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

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFirewood() {
        return firewood;
    }

    public void setFirewood(int firewood) {
        this.firewood = firewood;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}