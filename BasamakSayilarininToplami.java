import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        int sayi, toplam = 0, sonbs;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        while (sayi != 0) {
            sonbs = sayi % 10;
            toplam += sonbs;
            sayi /= 10;
        }
        System.out.println("Basamak saylarının Toplamı : " + toplam);

    }
}
