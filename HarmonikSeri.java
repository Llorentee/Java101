import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++) {
            toplam += (1/i); // double i aldık çünkü 1 int ve i int olursa 1/2 = 1 gine int döndürür.
        }
        System.out.println(toplam);


    }
}
