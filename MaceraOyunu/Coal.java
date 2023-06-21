package MaceraOyunu;

import java.util.Random;
import java.util.Scanner;

public class Coal extends BattleLoc{

    public Scanner input = new Scanner(System.in);

    private Obstacle obstacle;
    public static boolean is_Clear_Coal = false;

    public Coal(Player player) {
        super(player, "Maden");
        this.obstacle = new Snike();
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {

        int random_obstacle = BattleLoc.more_random_obstacle();

        System.out.println();
        System.out.println("------------Güncel Bilgileriniz-----------");
        this.getPlayer().print_info();
        System.out.println();

        System.out.println("-------------- CANAVARLAR -----------------");
        Obstacle.print_obstacle();
        System.out.println();

        System.out.print(this.getName() + " da " + random_obstacle + " tane " + this.getObstacle().getName() + " var.Kaçmak mı yoksa savasmak mı istiyorsunuz (Kaç : 0 , Savaş : 1) : ");
        int selectChoice = input.nextInt();
        System.out.println();

        if (selectChoice == 1 && !(is_Clear_Coal)) {
            while (random_obstacle > 0) {
                if (this.getPlayer().getHealth() > 0) {
                    this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
                    combat(this.getObstacle());
                } if (this.getPlayer().getHealth() > this.getObstacle().getHealth()) {
                    Weapon[] weapon = {new Gun(), new Sword(), new Rifle()};
                    Armor[] armor = {new LightArmor(), new MidArmor(), new HeavyAmor()};
                    if (Weapon.possible_weapon()) {
                        if (Rifle.possible_Rifle()) {
                            System.out.println("Canavardan " + weapon[2].getName() + " düştü !!!");
                            this.getPlayer().setDamage(this.getPlayer().getDamage() + weapon[2].getDamage());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + weapon[2].getPrice());
                            this.getPlayer().getInventory().setWeapon(weapon[2]);
                        } else if (Sword.possible_Sword()) {
                            System.out.println("Canavardan " + weapon[1].getName() + " düştü !!!");
                            this.getPlayer().setDamage(this.getPlayer().getDamage() + weapon[1].getDamage());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + weapon[1].getPrice());
                            this.getPlayer().getInventory().setWeapon(weapon[1]);
                        } else if (Gun.possible_Gun()) {
                            System.out.println("Canavardan " + weapon[0].getName() + " düştü !!!");
                            this.getPlayer().setDamage(this.getPlayer().getDamage() + weapon[0].getDamage());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + weapon[0].getPrice());
                            this.getPlayer().getInventory().setWeapon(weapon[0]);
                        }
                    } else if (Armor.possible_armor()) {
                        if (HeavyAmor.possible_HeavyArmor()) {
                            System.out.println("Canavardan " + armor[2].getName() + " düştü !!!");
                            this.getPlayer().setHealth(this.getPlayer().getHealth() + armor[2].getBlock());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - armor[2].getPrice());
                            this.getPlayer().getInventory().setArmor(armor[2]);
                        } else if (MidArmor.possible_MidArmor()) {
                            System.out.println("Canavardan " + armor[1].getName() + " düştü !!!");
                            this.getPlayer().setHealth(this.getPlayer().getHealth() + armor[1].getBlock());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - armor[1].getPrice());
                            this.getPlayer().getInventory().setArmor(armor[1]);
                        } else if (LightArmor.possible_LightArmor()) {
                            System.out.println("Canavardan " + armor[0].getName() + " düştü !!!");
                            this.getPlayer().setHealth(this.getPlayer().getHealth() + armor[0].getBlock());
                            this.getPlayer().setMoney(this.getPlayer().getMoney() - armor[0].getPrice());
                            this.getPlayer().getInventory().setArmor(armor[0]);
                        }
                    } else if (possible_money()) {
                        if (possible_10money()) {
                            System.out.println("Canavardan 10 para düştü !!!");
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                        } else if (possible_5money()) {
                            System.out.println("Canavardan 5 para düştü !!!");
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                        } else if (possible_1money()) {
                            System.out.println("Canavardan 1 para düştü !!!");
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                        }
                    } else if (possible_not()) {
                        System.out.println("Canavardan hiçbir şey düşmedi !!!");
                    }
                }
                random_obstacle--;
            }
            if (is_Win(this.getObstacle())) {
                is_Clear_Coal = true;
            }
        } else if (selectChoice == 0) {
            System.out.println("BU ADADAN ÇOK ÇABUK VAZGEÇTİNİZ !!!!");
        } else {
            System.out.println(this.getName() + " daki " + "bütün " + this.getObstacle().getName() + "ları öldürdüğün için giriş yapamassınız !!!!");
        }
        return true;
    }

    public static boolean possible_money() {
        int random = (int) (Math.random() * 100);
        return random <= 25;
    }

    public static boolean possible_10money() {
        int random = (int) (Math.random() * 100);
        return random <= 20;
    }

    public static boolean possible_5money() {
        int random = (int) (Math.random() * 100);
        return random <= 30;
    }

    public static boolean possible_1money() {
        int random = (int) (Math.random() * 100);
        return random <= 50;
    }

    public static boolean possible_not() {
        int random = (int) (Math.random() * 100);
        return random <= 45;
    }
}
