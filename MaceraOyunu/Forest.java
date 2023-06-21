package MaceraOyunu;

import java.util.Scanner;

public class Forest extends BattleLoc{

    public Scanner input = new Scanner(System.in);

    private Obstacle obstacle;
    public static boolean is_Clear_Forest = false;

    public Forest(Player player) {
        super(player, "Orman");
        this.obstacle = new Vampire();
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    @Override
    public boolean onLocation() {

        int random_obstacle = BattleLoc.random_obstacle();

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

        if (selectChoice == 1 && !(is_Clear_Forest)) {
            while (random_obstacle > 0) {
                if (this.getPlayer().getHealth() > 0) {
                    this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
                    combat(this.getObstacle());
                }
                random_obstacle--;
            }
            if (is_Win(this.getObstacle())) {
                is_Clear_Forest = true;
                System.out.println("TEBRİKLER ODUN KAZANDINIZ !!!");
                this.getPlayer().getInventory().setFirewood(this.getPlayer().getInventory().getFirewood() + 1);
            }
        } else if (selectChoice == 0) {
            System.out.println("BU ADADAN ÇOK ÇABUK VAZGEÇTİNİZ !!!!");
        } else {
            System.out.println(this.getName() + " daki " + "bütün " + this.getObstacle().getName() + "leri öldürdüğün için giriş yapamassınız !!!!");
        }
        return true;
    }
}
