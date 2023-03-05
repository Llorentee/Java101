import java.util.Scanner;

public class KDVtutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvtutar, kdvlitutar;

        Scanner para = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar = para.nextDouble();
        double kdvoran = tutar <= 1000 ? 0.18 : 0.8;

        kdvtutar = tutar * kdvoran;
        kdvlitutar = tutar + kdvtutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvoran);
        System.out.println("KDV tutarı: " + kdvtutar);
        System.out.println("KDV'li tutar: " + kdvlitutar);








    }
}
