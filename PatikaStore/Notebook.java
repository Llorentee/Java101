package PatikaStore;

public class Notebook extends Markalar{
    private double birimFiyat;
    private int indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private int ram;
    private int depolama;
    private double ekranBoyutu;
    private static int id_increment = 1;

    public Notebook(int id, String name, double birimFiyat, int indirimOrani, int stokMiktari, String urunAdi, int ram, int depolama, double ekranBoyutu) {
        super(id, name);
        this.birimFiyat = birimFiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.ram = ram;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
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

    public static int getId_increment() {
        return id_increment;
    }

    public static void setId_increment(int id_increment) {
        Notebook.id_increment = id_increment;
    }
}
