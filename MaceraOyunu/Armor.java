package MaceraOyunu;

import java.util.Scanner;

public class Armor {
    private String name;
    private int id;
    private int block;
    private int price;
    private int possible_armor;

    public static Scanner input = new Scanner(System.in);

    public Armor(String name, int id, int block, int price, int possible_armor) {
        this.name = name;
        this.id = id;
        this.block = block;
        this.price = price;
        this.possible_armor = possible_armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void print_info() {
        Armor[] armor = {new LightArmor(), new MidArmor(), new HeavyAmor()};
        System.out.println("---------------------------------");
        System.out.println("OYUNUMUZDAKİ ZIRHLAR");
        System.out.println("---------------------------------");
        for (Armor ar : armor) {
            System.out.println("ID : " + ar.getId() +
                    "\tName : " + ar.getName() +
                    "\tBlock : " + ar.getBlock() +
                    "\tMoney : " + ar.getPrice());
        }
        System.out.println("----------------------------------");
        System.out.println();
    }

    public static void buy_armor(Player player) {
        System.out.println("Güncel paranız : " + player.getMoney());
        Armor[] armor = {new LightArmor(), new MidArmor(), new HeavyAmor()};
        System.out.println("Hafif Zırh : 1, Orta Zırh : 2, Ağır Zırh : 3, Çıkış : 0");

        boolean is_Armor = true;
        while (is_Armor) {
            System.out.print("Satın almak istediğiniz zırh seçin : ");
            int selectArmor = input.nextInt();
            switch (selectArmor) {
                case 1:
                    if (player.getMoney() >= armor[0].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - armor[0].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setArmor(armor[0]);
                        player.setHealth(player.getHealth() + armor[0].getBlock());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                case 2:
                    if (player.getMoney() >= armor[1].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - armor[1].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setArmor(armor[1]);
                        player.setHealth(player.getHealth() + armor[1].getBlock());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                case 3:
                    if (player.getMoney() >= armor[2].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - armor[2].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setArmor(armor[2]);
                        player.setHealth(player.getHealth() + armor[2].getBlock());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                default:
                    System.out.println("Zırh dükkanından çıkış yaptınız !!! Yine bekleriz !!\n");
                    is_Armor = false;
                    break;
            }
        }


    }

    public static boolean possible_armor() {
        int random = (int) (Math.random() * 100);
        return random <= 15;
    }
}
