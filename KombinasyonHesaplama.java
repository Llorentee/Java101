import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        /*
        int sayi, fakt = 1, i;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(i = 1; i <= sayi; i++) {
            fakt *= i;
        }
        System.out.print(sayi + " Sayısının faktöriyeli = " + fakt);

         */

        int n, r, faktn = 1, faktr = 1, faktnr = 1, Com;
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenin eleman sayısı: ");
        n = input.nextInt();
        System.out.print("n elemanlı farklı grupların sayısı: ");
        r = input.nextInt();
        int l = n - r;


        for(int i = 1; i <= n; i++) {
            faktn *= i;
        }
        for(int k = 1; k <= r; k++) {
            faktr *= k;
        }
        for(int m = 1; m <= l; m++) {
            faktnr *= m;
        }

        Com = faktn / (faktr * faktnr);
        System.out.print("n'in r li kombinasyonu C(n,r) = n! / (r! * (n-r)!) = " + Com);
    }
}
