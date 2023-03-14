import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplama(int a, int b) {
        return a + b;
    }

    static int cikarma(int a, int b) {
        return a - b;
    }

    static int carpma(int a, int b) {
        return a * b;
    }

    static int bolme(int a, int b) {
        return a / b;
    }

    static int usalma(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    static int fak(int a) {
        int fakt = 1;
        for (int i = 1; i <= a; i++) {
            fakt *= i;
        }
        return fakt;
    }

    static int mod_al(int a, int b) {
        return a % b;
    }

    static void DikAlan_Cevre(int a, int b) {
        int alan = a * b;
        int cevre = (a + b) * 2;

        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        String menu = "1- Toplama işlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Faktöriyel Hesaplama\n"
                + "9- Çıkış yap\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            secim = input.nextInt();
            if (secim == 9 || secim == 0) {
                break;
            }
            System.out.print("İlk sayı: ");
            int a = input.nextInt();
            System.out.print("İkinci sayı: ");
            int b = input.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("Toplam: " + toplama(a, b));
                    break;
                case 2:
                    System.out.println("Çıkarma: " + cikarma(a, b));
                    break;
                case 3:
                    System.out.println("Çarpma: " + carpma(a, b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("İkinci sayı sıfırdan farklı olmalı");
                    } else {
                        System.out.println("Bölme: " + bolme(a, b));
                    }
                    break;
                case 5:
                    System.out.println("Üs işlemi: " + usalma(a, b));
                    break;
                case 6:
                    System.out.println("Mod hesabı: " + mod_al(a, b));
                    break;
                case 7:
                    DikAlan_Cevre(a, b);
                    break;
                case 8:
                    System.out.println("Faktöriyel hesabı: " + fak(a));
                    break;
                default:
                    System.out.println("Geçersiz işlem seçtiniz!!");
                    break;
            }
        }
        System.out.print("Güle güle");





    }
}
