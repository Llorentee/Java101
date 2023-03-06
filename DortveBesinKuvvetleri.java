import java.util.Scanner;

public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int sayi;
        int i, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        /*
        i = 1;
        while (i <= sayi) {
            System.out.println(i);
            i *= 2;
        }
         */

        i = 1;
        k = 1;
        while (i <= sayi && k <= sayi) {
            System.out.println(i + "  " + k);
            i *= 4;
            k *= 5;
        }
    }
}
