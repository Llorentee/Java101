package ThreadlerinYarisi;

public class Main {
    public static void main(String[] args)  {

        TekCiftSayilar sayilar = new TekCiftSayilar();
        Thread t1 = new Thread(sayilar);
        Thread t2 = new Thread(sayilar);
        Thread t3 = new Thread(sayilar);
        Thread t4 = new Thread(sayilar);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tek sayıların sayısı : " + TekCiftSayilar.tek_sayilar.size());
        System.out.println("Çift sayıların sayısı : " + TekCiftSayilar.cift_sayilar.size());





    }
}
