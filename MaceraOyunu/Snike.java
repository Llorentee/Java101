package MaceraOyunu;

import java.util.Random;

public class Snike extends Obstacle{

    public Snike() {
        super(4, "Yılan", snike_random_damage() , 12, 0);
    }

    public static int snike_random_damage() {
        Random random = new Random();
        int snike_random_damage = random.nextInt(3, 7);
        return snike_random_damage;
    }

}
