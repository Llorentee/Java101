import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int toplam = 0, sayi;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (sayi == toplam) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
            toplam = 0;
        } while (sayi != 0);
    }
}
