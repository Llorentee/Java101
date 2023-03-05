import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, vke;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        vke = kilo / (boy * boy);

        System.out.print("Vücut kitle indeksiniz: " + vke);


    }
}
