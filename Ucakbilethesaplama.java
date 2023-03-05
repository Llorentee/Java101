import java.util.Scanner;

public class Ucakbilethesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yoltipi;
        double msfbucret = 0.10, normaltutar, yasindirimi, indirimlitutar, gdbiletind, toplamtutar = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi (km cinsinden) giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınız giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi giriniz(1 = Tek yön, 2 = Gidiş - Dönüş): ");
        yoltipi = input.nextInt();


        if (mesafe > 0 && yas > 0 && (yoltipi == 1 || yoltipi == 2)) {
            normaltutar = mesafe * msfbucret;
            if (yas < 12) {
                yasindirimi = normaltutar * 0.50;
                indirimlitutar = normaltutar - yasindirimi;
                if (yoltipi == 2) {
                    gdbiletind = indirimlitutar * 0.20;
                    toplamtutar = (indirimlitutar - gdbiletind) * yoltipi;
                    System.out.print("Toplam tutar: " + toplamtutar);
                } else {
                    toplamtutar = indirimlitutar;
                    System.out.print("Toplam tutar: " + toplamtutar);
                }
            } else if (yas >= 12 && yas <= 24) {
                yasindirimi = normaltutar * 0.10;
                indirimlitutar = normaltutar - yasindirimi;
                if (yoltipi == 2) {
                    gdbiletind = indirimlitutar * 0.20;
                    toplamtutar = (indirimlitutar - gdbiletind) * yoltipi;
                    System.out.print("Toplam tutar: " + toplamtutar);
                } else {
                    toplamtutar = indirimlitutar;
                    System.out.print("Toplam tutar: " + toplamtutar);
                }
            } else if (yas > 65) {
                yasindirimi = normaltutar * 0.30;
                indirimlitutar = normaltutar - yasindirimi;
                yasindirimi = normaltutar * 0.10;
                indirimlitutar = normaltutar - yasindirimi;
                if (yoltipi == 2) {
                    gdbiletind = indirimlitutar * 0.20;
                    toplamtutar = (indirimlitutar - gdbiletind) * yoltipi;
                    System.out.print("Toplam tutar: " + toplamtutar);
                } else {
                    toplamtutar = indirimlitutar;
                    System.out.print("Toplam tutar: " + toplamtutar);
                }
            } else {
                if (yoltipi == 2) {
                    toplamtutar = normaltutar * yoltipi;
                    System.out.print("Toplam tutar: " + toplamtutar);
                } else {
                    System.out.print("Toplam tutar: " + toplamtutar);
                }
            }
        } else {
            System.out.print("Hatalı bir veri girdiniz!!");
        }


    }
}