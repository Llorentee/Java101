import java.util.Scanner;

public class MaxMinBulma {
    public static void main(String[] args) {
        int sayac;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayac = input.nextInt();

        int i = 1, sayi;
        long min = 32412466453486798l, max = -4363463457687987l;
        while (i <= sayac) {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
            i++;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
