package MaceraOyunu;

import java.util.Scanner;
import java.util.Random;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String charName;
    private int ch_dodge;

    public Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
        this.ch_dodge = 50;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getCh_dodge() {
        return ch_dodge;
    }

    public void setCh_dodge(int ch_dodge) {
        this.ch_dodge = ch_dodge;
    }

    public void selectChar() {
        GameChar[] chars = {new Samurai(), new Archer(), new Knight()};
        System.out.println("OYUNUMUZDAKİ KARAKTERLER");
        System.out.println("-----------------------------------------------------------------");
        for (GameChar c : chars) {
            System.out.println("ID : " + c.getId() +
                    "\tName : " + c.getName() +
                    "\tDamage : " + c.getDamage() +
                    "\tHealth : " + c.getHealth() +
                    "\tMoney : " + c.getMoney());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz: ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                new_Player(new Samurai());
                break;
            case 2:
                new_Player(new Archer());
                break;
            case 3:
                new_Player(new Knight());
                break;
            default:
                Random rand = new Random();
                int number = rand.nextInt(0,chars.length);
                System.out.println(number);
                new_Player(chars[number]);
                break;
        }
        System.out.println("Your Char : " + this.getCharName() +
                " Damage : " + this.getDamage() +
                " Health : " + this.getHealth() +
                " Money : " + this.getMoney());
    }

    public void new_Player(GameChar gameChar) {
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void print_info() {
        System.out.println("Karakter : " + this.getCharName());
        System.out.println("Hasar : " + this.getDamage());
        System.out.println("Sağlık : " + this.getHealth());
        System.out.println("Para : " + this.getMoney());
        System.out.println("Zırh : " + this.getInventory().getArmor().getName());
        System.out.println("Silah : " + this.getInventory().getWeapon().getName());
        System.out.println("Bloklama : " + this.getCh_dodge());
        System.out.println("Yemek : " + this.getInventory().getFood());
        System.out.println("Odun : " + this.getInventory().getFirewood());
        System.out.println("Su : " + this.getInventory().getWater());
    }


}
