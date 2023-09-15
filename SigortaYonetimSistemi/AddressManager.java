package SigortaYonetimSistemi;

public class AddressManager {

    public static void adres_ekleme(Address address) {
        User.adres_listesi.add(address);
    }

    public static void adres_cikarma(Address address) {
        User.adres_listesi.remove(address);
    }
}
