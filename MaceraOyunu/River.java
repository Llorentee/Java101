package MaceraOyunu;

import java.util.Scanner;

public class River extends BattleLoc{

    public Scanner input = new Scanner(System.in);

    private Obstacle obstacle;
    public static boolean is_Clear_River = false;

    public River(Player player) {
        super(player, "Nehir");
        this.obstacle = new Bear();
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

        System.out.print(this.getName() + " de " + random_obstacle + " tane " + this.getObstacle().getName() + " var.Kaçmak mı yoksa savasmak mı istiyorsunuz (Kaç : 0 , Savaş : 1) : ");
        int selectChoice = input.nextInt();
        System.out.println();

        if (selectChoice == 1 && !(is_Clear_River)) {
            while (random_obstacle > 0) {
                if (this.getPlayer().getHealth() > 0) {
                    this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
                    combat(this.getObstacle());
                }
                random_obstacle--;
            }
            if (is_Win(this.getObstacle())) {
                is_Clear_River = true;
                System.out.println("TEBRİKLER SU KAZANDINIZ !!!");
                this.getPlayer().getInventory().setWater(this.getPlayer().getInventory().getWater() + 1);
            }
        } else if (selectChoice == 0){
            System.out.println("BU ADADAN ÇOK ÇABUK VAZGEÇTİNİZ !!!!");
        } else {
            System.out.println(this.getName() + " deki " + "bütün " + this.getObstacle().getName() + "ları öldürdüğün için giriş yapamassınız !!!!");
        }
        return true;
    }
}
