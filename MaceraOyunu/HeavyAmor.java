package MaceraOyunu;

public class HeavyAmor extends Armor{

    public HeavyAmor() {
        super("Ağır Armor", 3, 5, 40, 20);
    }

    public static boolean possible_HeavyArmor() {
        int random = (int) (Math.random() * 100);
        return random <= 20;
    }
}
