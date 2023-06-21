package MaceraOyunu;

import java.util.Random;

public abstract class BattleLoc extends Location{

    public BattleLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }

    public static int random_obstacle() {
        Random random = new Random();
        int obs_number = random.nextInt(1, 4);
        return obs_number;
    }

    public static int more_random_obstacle() {
        Random random = new Random();
        int obs_number = random.nextInt(1, 6);
        return obs_number;
    }

    public boolean is_Win = true;

    public void combat(Obstacle o) {

        System.out.println("-------------------- SAVAŞ BAŞLADI -------------------");

        System.out.println("-------------------------------------------");
        System.out.println("Sağlığın : " + this.getPlayer().getHealth());
        System.out.println("Canavarın sağlığı : " + o.getHealth());
        System.out.println("-------------------------------------------");

        if (is_First_Hit()) {
            System.out.println("İlk vuruşu " + this.getPlayer().getName() + " yaptı !!");
            o.setHealth(hit_Character(o));
            this.getPlayer().setHealth(hit_Obstacle(o));
        } else {
            System.out.println("İlk vuruşu " + o.getName() + " yaptı !!");
            this.getPlayer().setHealth(hit_Obstacle(o));
            o.setHealth(hit_Character(o));
        }

        while (true) {

            System.out.println("-------------------------------------------");
            System.out.println("Sağlığın : " + this.getPlayer().getHealth());
            System.out.println("Canavarın sağlığı : " + o.getHealth());
            System.out.println("-------------------------------------------");

            o.setHealth(hit_Character(o));
            System.out.println("-------------------------------------------");
            System.out.println("Sağlığın : " + this.getPlayer().getHealth());
            System.out.println("Canavarın sağlığı : " + o.getHealth());
            System.out.println("-------------------------------------------");
            if (o.getHealth() == 0) {
                this.getPlayer().getInventory().setArmor(new EmptyArmor());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + o.getMoney());
                System.out.println("Canavarı yendin. TEBRİKLER");
                break;
            }
            this.getPlayer().setHealth(hit_Obstacle(o));
            System.out.println("-------------------------------------------");
            System.out.println("Sağlığın : " + this.getPlayer().getHealth());
            System.out.println("Canavarın sağlığı : " + o.getHealth());
            System.out.println("-------------------------------------------");
            if (this.getPlayer().getHealth() == 0) {
                this.getPlayer().getInventory().setArmor(new EmptyArmor());
                is_Win = false;
                System.out.println("Canavarı yenemedim !!! MAALESEF!!!");
                break;
            }

        }
    }

    public int hit_Character(Obstacle o) {

        System.out.println("Canavara " + this.getPlayer().getDamage() + " hasar vurdun !!!");

        if (this.getPlayer().getDamage() > o.getHealth()) {
            return 0;
        }  if (o.getHealth() < 0) {
            return 0;
        }
        return o.getHealth() - this.getPlayer().getDamage();
    }

    public int hit_Obstacle(Obstacle o) {
        System.out.println("Canavar sana " + o.getDamage() + " hasar vurdu !!!");

        if (o.getDamage() > this.getPlayer().getHealth()) {
            return 0;
        } if (this.getPlayer().getHealth() < 0) {
            return 0;
        }
        return this.getPlayer().getHealth() - o.getDamage();
    }

    public boolean is_Win(Obstacle o) {
        if (is_Win) {
            System.out.println(this.getName() + " daki " + "Bütün " + o.getName() + " leri öldürüdün!!");
            return true;
        } else {
            System.out.println(this.getName() + " daki " + "Bütün " + o.getName() + " leri öldüremedin!!");
            return false;
        }
    }

    public boolean is_First_Hit() {
        int random_number = (int) (Math.random() * 100);
        return random_number <= this.getPlayer().getCh_dodge();
    }

}


