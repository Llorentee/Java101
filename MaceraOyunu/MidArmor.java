package MaceraOyunu;

public class MidArmor extends Armor{

    public MidArmor() {
        super("Orta Armor", 2, 3, 25, 30);
    }

    public static boolean possible_MidArmor() {
        int random = (int) (Math.random() * 100);
        return random <= 30;
    }
}
