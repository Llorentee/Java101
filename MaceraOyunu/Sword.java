package MaceraOyunu;

public class Sword extends Weapon {

    public Sword() {
        super("Kılıç", 2, 3, 35, 30);
    }

    public static boolean possible_Sword() {
        int random = (int) (Math.random() * 100);
        return random <= 30;
    }
}
