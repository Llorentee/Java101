package SigortaYonetimSistemi;

import java.util.TreeSet;

public class AccountManager {

    public static TreeSet<Account> hesaplar;

    public Account login(String email, String sifre) {

        for (Account account : hesaplar) {
            try {
                boolean isLogin = account.login(email, sifre);
                if (isLogin) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}

