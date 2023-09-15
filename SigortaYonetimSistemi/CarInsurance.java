package SigortaYonetimSistemi;

import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(String sigorta_ismi, int sigortanin_ucreti, Date sigortanin_baslangic_tarihi) {
        super(sigorta_ismi, sigortanin_ucreti, sigortanin_baslangic_tarihi);
    }

    @Override
    public int calculate() {
        return 0;
    }
}
