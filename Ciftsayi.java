import java.util.Scanner;

public class Ciftsayi {
    public static void main(String[] args) {
        int m;
        int i = 1, k = 0;
        int toplam = 0;
        double ort;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        m = input.nextInt();

        /*
        for (i = 1; i < m; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

         */
        /*

        for (i = 0, k = 0; i < m; i++, k++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
            }
        } */

        while (i < m) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                i++;
                k++;
            }
            i++;
        }

        System.out.println("Toplam: " + toplam);
        ort = toplam / k;
        System.out.println("Ortalama: "+ ort);

    }
}
