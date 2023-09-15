package SigortaYonetimSistemi;

public class BusinessAddress implements Address{

    String ulke;
    String sehir;
    String ilce;
    String postaKodu;
    String mahalle;
    String sokak;

    public BusinessAddress(String ulke, String sehir, String ilce, String postaKodu, String mahalle, String sokak) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.ilce = ilce;
        this.postaKodu = postaKodu;
        this.mahalle = mahalle;
        this.sokak = sokak;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    @Override
    public void addressGuncelle(String ulke, String sehir, String ilce, String postaKodu, String mahalle, String sokak) {
        this.setUlke(ulke);
        this.setSehir(sehir);
        this.setIlce(ilce);
        this.setPostaKodu(postaKodu);
        this.setMahalle(mahalle);
        this.setSokak(sokak);
    }

    @Override
    public void addressBilgileriGoster() {
        System.out.println("Ülke : " + this.getUlke());
        System.out.println("Şehir : " + this.getSehir());
        System.out.println("İlçe : " + this.getIlce());
        System.out.println("Posta Kodu : " + this.getPostaKodu());
        System.out.println("Mahalle : " + this.getMahalle());
        System.out.println("Sokak : " + this.getSokak());
    }


}
