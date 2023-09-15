package SigortaYonetimSistemi;

import java.util.Date;

public abstract class Insurance {

    private String sigorta_ismi;
    private int sigortanin_ucreti;
    private Date sigortanin_baslangic_tarihi;

    public Insurance(String sigorta_ismi, int sigortanin_ucreti, Date sigortanin_baslangic_tarihi) {
        this.sigorta_ismi = sigorta_ismi;
        this.sigortanin_ucreti = sigortanin_ucreti;
        this.sigortanin_baslangic_tarihi = sigortanin_baslangic_tarihi;
    }

    public String getSigorta_ismi() {
        return sigorta_ismi;
    }

    public void setSigorta_ismi(String sigorta_ismi) {
        this.sigorta_ismi = sigorta_ismi;
    }

    public int getSigortanin_ucreti() {
        return sigortanin_ucreti;
    }

    public void setSigortanin_ucreti(int sigortanin_ucreti) {
        this.sigortanin_ucreti = sigortanin_ucreti;
    }

    public Date getSigortanin_baslangic_tarihi() {
        return sigortanin_baslangic_tarihi;
    }

    public void setSigortanin_baslangic_tarihi(Date sigortanin_baslangic_tarihi) {
        this.sigortanin_baslangic_tarihi = sigortanin_baslangic_tarihi;
    }

    public abstract int calculate();
}
