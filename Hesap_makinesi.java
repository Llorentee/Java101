import java.util.Scanner;

public class Hesap_makinesi {
    public static void main(String[] args) {
        /*

        int a, b, islem;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("Toplama\nÇıkarma\nÇarpma\nBölme");
        System.out.print("Bir işlem seçiniz: ");
        islem = input.nextInt();

        if (islem == 1) {
            System.out.println("Toplam = " + (a + b));
        } else if (islem == 2) {
            System.out.println("Çıkarma = " + (a - b));
        } else if (islem == 3) {
            System.out.println("Çarpma = " + (a * b));
        } else if (islem == 4) {
            if (b != 0) {
                System.out.println("Bölme = " + (a / b));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez!!");
            }
        } else {
            System.out.println("Hatalı sayı girdiniz.Lütfen tekrar deneyin!!");
        }

         */


        int a, b, islem;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("Toplama\nÇıkarma\nÇarpma\nBölme");
        System.out.print("Bir işlem seçiniz: ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam = " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma = " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma = " + (a * b));
                break;
            case 4:
                System.out.println("Bölme = " + (a / b));
                break;
            default:
                System.out.println("Hatalı sayı girdiniz.Lütfen tekrar deneyiniz!!");
        }

    }
}



