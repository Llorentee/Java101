package PatikaStore;

public class CepTelefonu extends Markalar {
    private double birimFiyat;
    private int indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private int ram;
    private int depolama;
    private double ekranBoyutu;
    private int pilGucu;
    private String renk;
    private int kamera;
    private static int id_increment = 1;

    public CepTelefonu(int id, String name, double birimFiyat, int indirimOrani, int stokMiktari, String urunAdi, int ram, int depolama, double ekranBoyutu, int pilGucu, String renk, int kamera) {
        super(id, name);
        this.birimFiyat = birimFiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.renk = renk;
        this.kamera = kamera;
        id_increment++;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(int indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public static int getId_increment() {
        return id_increment;
    }

    public static void setId_increment(int id_increment) {
        CepTelefonu.id_increment = id_increment;
    }
}
