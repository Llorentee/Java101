import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, mu, sayac = 0, toplam = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }
        System.out.print("Fizik notunuz: ");
        fiz = input.nextInt();
        if (fiz >= 0 && fiz <= 100) {
            toplam += fiz;
            sayac++;
        }
        System.out.print("Türkçe notunuz: ");
        turk = input.nextInt();
        if (turk >= 0 && turk <= 100) {
            toplam += turk;
            sayac++;
        }
        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();
        if (kim >= 0 && kim <= 100) {
            toplam += kim;
            sayac++;
        }
        System.out.print("Müzik notunuz: ");
        mu = input.nextInt();
        if (mu >= 0 && mu <= 100) {
            toplam += mu;
            sayac++;
        }
        ortalama = toplam / sayac;


        if (ortalama <= 55) {
            System.out.println("Sınıfta kaldınız.Seneye iyi çalışın.");
        } else {
            System.out.println("Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + ortalama);

    }
}




