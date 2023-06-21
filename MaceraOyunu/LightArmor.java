package MaceraOyunu;

public class LightArmor extends Armor{

    public LightArmor() {
        super("Hafif Armor", 1, 1, 15, 50);
    }

    public static boolean possible_LightArmor() {
        int random = (int) (Math.random() * 100);
        return random <= 50;
    }
}
