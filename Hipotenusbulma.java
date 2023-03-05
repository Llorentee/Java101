import java.util.Scanner;

public class Hipotenusbulma {
    public static void main(String[] args) {
        int a, b;
        double hipotenus;

        Scanner uzunluk = new Scanner(System.in);

        System.out.print("1.Kenar giriniz: ");
        a = uzunluk.nextInt();

        System.out.print("2.Kenar giriniz: ");
        b = uzunluk.nextInt();

        hipotenus = Math.sqrt((a * a) + (b * b)); // karakök alma
        System.out.println("Hipotenüs: " + hipotenus);
        double u = (a + b + hipotenus) / 2, cevre = 2 * u,Alan;
        Alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));
        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + Alan);


    }
}
