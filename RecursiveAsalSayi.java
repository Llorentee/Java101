import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean asalmi(int a, int b) {
        if (a == 2) {
            return true;
        } else if (b >= a) {
            return true;
        } else if (a > b && a % b == 0) {
            return false;
        } else {
            return asalmi(a, b + 1);
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        if (asalmi(n, 2)) {
            System.out.println(n + " Sayısı asal sayıdır.");
        } else {
            System.out.println(n + " Sayısı asal sayı değildir.");
        }

    }
}
