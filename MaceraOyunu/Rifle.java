package MaceraOyunu;

public class Rifle extends Weapon {

    public Rifle() {
        super("Tüfek", 3, 7, 45, 20);
    }

    public static boolean possible_Rifle() {
        int random = (int) (Math.random() * 100);
        return random <= 20;
    }
}
