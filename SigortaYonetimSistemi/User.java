package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private String isim;
    private String soyisim;
    private String email;
    private String sifre;
    private String meslek;
    private int yas;
    public static ArrayList<Address> adres_listesi;
    private Date son_giris_tarihi;

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas, Date son_giris_tarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.son_giris_tarihi = son_giris_tarihi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Date getSon_giris_tarihi() {
        return son_giris_tarihi;
    }

    public void setSon_giris_tarihi(Date son_giris_tarihi) {
        this.son_giris_tarihi = son_giris_tarihi;
    }
}
