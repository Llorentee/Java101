package MaceraOyunu;

import java.util.Scanner;

public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;
    private int possible_weapon;

    public static Scanner input = new Scanner(System.in);

    public Weapon(String name, int id, int damage, int price, int possible_weapon) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.possible_weapon = possible_weapon;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPossible_weapon() {
        return possible_weapon;
    }

    public void setPossible_weapon(int possible_weapon) {
        this.possible_weapon = possible_weapon;
    }

    public static void print_info() {
        Weapon[] weapon = {new Gun(), new Sword(), new Rifle()};
        System.out.println("---------------------------------");
        System.out.println("OYUNUMUZDAKİ SİLAHLAR");
        System.out.println("---------------------------------");
        for (Weapon w : weapon) {
            System.out.println("ID : " + w.getId() +
                    "\tName : " + w.getName() +
                    "\tDamage : " + w.getDamage() +
                    "\tMoney : " + w.getPrice());
        }
        System.out.println("----------------------------------");
        System.out.println();
    }

    public static void buy_weapon(Player player) {
        System.out.println("Güncel paranız : " + player.getMoney());
        Weapon[] weapon = {new Gun(), new Sword(), new Rifle()};
        System.out.println("Tabanca : 1, Kılıç : 2, Tüfek : 3, Çıkış : 0");

        boolean is_Weapon = true;
        while (is_Weapon) {
            System.out.print("Satın almak istediğiniz silahı seçin : ");
            int selectArmor = input.nextInt();
            switch (selectArmor) {
                case 1:
                    if (player.getMoney() >= weapon[0].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - weapon[0].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setWeapon(weapon[0]);
                        player.setDamage(player.getDamage() + weapon[0].getDamage());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                case 2:
                    if (player.getMoney() >= weapon[1].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - weapon[1].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setWeapon(weapon[1]);
                        player.setDamage(player.getDamage() + weapon[1].getDamage());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                case 3:
                    if (player.getMoney() >= weapon[2].getPrice()) {
                        System.out.println("Satın alma işlemi başarılı !!\n");
                        player.setMoney(player.getMoney() - weapon[2].getPrice());
                        System.out.println("Kalan paranız : " + player.getMoney());
                        player.getInventory().setWeapon(weapon[2]);
                        player.setDamage(player.getDamage() + weapon[2].getDamage());
                    } else {
                        System.out.println("Yeterli paranız yok !! Yine bekleriz !!\n");
                    }
                    break;
                default:
                    System.out.println("Silah dükkanından çıkış yaptınız !!! Yine bekleriz !!\n");
                    is_Weapon = false;
                    break;
            }
        }
    }

    public static boolean possible_weapon() {
        int random = (int) (Math.random() * 100);
        return random <= 15;
    }
}
