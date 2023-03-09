import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        int a, b;
        int ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        b = input.nextInt();

        int i = a;
        while (i >= 1) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
                System.out.println("a ile b nin ebobu: " + ebob);
                break;
            }
            i--;
        }
        int j = 1;
        while (j <= a * b) {
            if (j % a == 0 && j % b == 0) {
                ekok = j;
                System.out.println("a ile b nin ekoku: " + ekok);
                break;
            }
            j++;
        }
    }
}

