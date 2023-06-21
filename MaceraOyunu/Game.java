package MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    public Game(Player player, Location location) {
        this.player = player;
        this.location  = location;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static Scanner input = new Scanner(System.in);

    public static void start() {
        System.out.println("MACERA OYUNUMUZA HOŞGELDİNİZ");
        System.out.print("Lütfen isminizi giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("YENİ OYUNCUMUZ " + player.getName() + " KARANLIK VE SİSLİ ADAMIZA HOŞGELDİNİZ");
        System.out.println();
        player.selectChar();

        Location location = null;

        boolean isGame = true;

        while (isGame) {
            System.out.println();
            System.out.println("################# Bölgeler ###############");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur!");
            System.out.println("2 - Eşya Dükkanı --> Silah veya Zırh satın alabilirsiniz!");
            System.out.println("3 -  Mağara --> Ödül <Yemek> , dikkatli ol karşına zombi çıkabilir!");
            System.out.println("4 -  Ormana git --> Ödül <Odun> , dikkatli ol karşına vampir çıkabilir!");
            System.out.println("5 -  Nehire git --> Ödül <Su> , dikkatli ol karşına ayı çıkabilir!");
            System.out.println("6 -  Madene git --> Ödül <Yok> , dikkatli ol karşına yılan çıkabilir!");
            System.out.println("0 - Çıkış yap --> Oyunu sonlandır !");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLocation = input.nextInt();

            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    location.onLocation();
                    break;
                case 2:
                    location = new ToolStore(player);
                    location.onLocation();
                    break;
                case 3:
                    location = new Cave(player);
                    location.onLocation();
                    break;
                case 4:
                    location = new Forest(player);
                    location.onLocation();
                    break;
                case 5:
                    location = new River(player);
                    location.onLocation();
                    break;
                case 6:
                    location = new Coal(player);
                    location.onLocation();
                    break;
                default:
                    location = new SafeHouse(player);
                    location.onLocation();
                    break;
            }

            if (player.getHealth() > 0 && Cave.is_Clear_Cave == true && Forest.is_Clear_Forest == true && River.is_Clear_River == true && Coal.is_Clear_Coal == true) {
                System.out.println();
                System.out.println("TÜM BÖLGELERDEKİ CANAVARLARI YENDİNİZ. OYUNU KAZANDINIZ !!!!!!");
                System.out.println("ARTIK GÜVENLİ EVE DÖNEBİLİRSİNİZ !!!!");
                isGame = false;
                break;
            }

            System.out.println();
            System.out.print("Oyundan çıkmak istiyor musunuz ? (Evet : 1 Hayır : 0) : " );
            int answer = input.nextInt();
            System.out.println();

            if (answer == 1) {
                System.out.println("OYUNDAN ÇIKIŞ YAPTINIZ !!!!!");
                isGame = false;
            }

        }
    }
}
