package BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int fighter_start;

    Fighter(String name, int damage, int health, int weight, int dodge , int fighter_start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.fighter_start = fighter_start;


        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokaladı!");
            System.out.println("---------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }



    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean is_fighter_start() {
        double random_number = Math.random() * 100;
        return random_number <= this.fighter_start;
    }

}
