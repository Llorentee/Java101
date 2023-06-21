package MaceraOyunu;

public class Gun extends Weapon {

    public Gun() {
        super("Tabanca", 1, 2, 25, 50);
    }

    public static boolean possible_Gun() {
        int random = (int) (Math.random() * 100);
        return random <= 50;
    }

}
