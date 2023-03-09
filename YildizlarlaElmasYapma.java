import java.util.Scanner;

public class YildizlarlaElmasYapma {
    public static void main(String[] args) {

        int m;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        m = input.nextInt();
        if (m % 2 != 0) {
            for (int i = 1; i <= (m / 2) + 1; i++) {
                for (int j = 1; j <= ((m / 2) + 1) - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int l = m - 1, b = m; l >= (m / 2) + 1; l--, b -= 2) {
                for (int j = 1; j <= m - l; j++) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= b - 2; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            for (int i = 1; i <= (m / 2) + 1; i++) {
                for (int j = 1; j <= (m / 2) - i; j++) {
                    System.out.print(" ");
                }
                if (i == (m / 2) + 1) {
                    for (int x = 1; x <= m - 1; x++) {
                        System.out.print("*");
                    }
                } else {
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            for (int l = m - 1, b = m - 1; l >= (m / 2) + 1; l--, b -= 2) {
                for (int j = 1; j <= m - l; j++) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= b - 2; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    }
}



