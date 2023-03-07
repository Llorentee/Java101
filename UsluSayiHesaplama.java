import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        b = input.nextInt();
        /*

        int i = 1, carp = 1;
        while (i <= b) {
            carp *= a;
            i++;
        }

         */
        int carp = 1;
        for (int i = 1; i <=b; i++) {
            carp *= a;
        }
        System.out.println("a üssü b eşittir = " + carp);
    }
}
