import java.util.Scanner;

public class daireAlanveCevreHesaplama {
    public static void main(String[] args) {
        double r, dAlan, dCevre, pi = 3.14, daireDilimAlani;
        int merkezaci;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap giriniz(cm): ");
        r = input.nextDouble();

        System.out.print("Merkez açısı ölçüsü giriniz: ");
        merkezaci = input.nextInt();

        dCevre = 2 * pi * r;
        dAlan = pi * r * r;
        daireDilimAlani = (pi * (r * r) * merkezaci) / 360;

        System.out.println("Dairenin alanı: " + dAlan);
        System.out.println("Dairenin çevresi: " + dCevre);
        System.out.println("Daire dilimin alanı: " + daireDilimAlani);







    }
}
