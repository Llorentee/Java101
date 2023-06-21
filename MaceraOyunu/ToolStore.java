package MaceraOyunu;

import java.util.Scanner;

public class ToolStore extends NormalLoc{

    public Scanner input = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "Eşya Dükkanı");
    }

    @Override
    public boolean onLocation() {
        System.out.println();
        System.out.println("MAĞAZAMIZA HOŞGELDİNİZ !!!");
        System.out.println();

        boolean on_Toolstore = true;
        while (on_Toolstore) {
            System.out.println("1 - Silahlar\n" +
                    "2 - Zırhlar\n" +
                    "0 - Çıkış yap");
            System.out.println();

            System.out.print("Seçiminiz nedir ? : ");
            int selectTool = input.nextInt();

            switch (selectTool) {
                case 1:
                    Weapon.print_info();
                    Weapon.buy_weapon(this.getPlayer());
                    break;
                case 2:
                    Armor.print_info();
                    Armor.buy_armor(this.getPlayer());
                    break;
                default:
                    System.out.println("Eşya dükkanından çıkış yaptınız !!!");
                    System.out.println("Bir daha bekleriz. İYİ GÜNLER!!");
                    on_Toolstore = false;
                    break;
            }
        }
        return true;
    }
}
