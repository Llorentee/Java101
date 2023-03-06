import java.util.Scanner;

public class TekSayilarinToplaami {
    public static void main(String[] args) {
        int a = 0;
        int toplam = 0;
        boolean karar = true;
        Scanner input = new Scanner(System.in);

        while (karar) {
            System.out.print("Bir sayı giriniz: ");
            a = input.nextInt();
            if (a % 2 == 0 && a % 4 == 0) {
                toplam += a;
            } else if (a == -1) {
                System.out.println("Döngü sonlandı!!!");
                karar = false;
            }
        }
        System.out.println("Toplam: " + toplam);
        
    }
}
