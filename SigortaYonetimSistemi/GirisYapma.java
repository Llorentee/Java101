package SigortaYonetimSistemi;

import java.util.Scanner;

public class GirisYapma {

    public static void kullaniciBilgileriAlma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email giriniz : ");
        String email = scanner.nextLine();

        System.out.println("Şifre giriniz: ");
        String sifre = scanner.nextLine();

        AccountManager manager = new AccountManager();
        manager.login(email, sifre);

    }

    public static void giris() {
        kullaniciBilgileriAlma();
    }
}
