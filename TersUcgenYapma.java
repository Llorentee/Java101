import java.util.Scanner;

public class TersUcgenYapma {
    public static void main(String[] args) {
        int bsmkSayisi;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısı: ");
        bsmkSayisi = input.nextInt();


        for (int k = bsmkSayisi, b = (bsmkSayisi * 2) - 1; k >= 1; k--, b -= 2) {
            for (int j = 0; j < bsmkSayisi - k; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= b; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

