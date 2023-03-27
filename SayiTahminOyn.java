import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyn {
    public static void main(String[] args) {
        /*
        Random rand = new Random();
        int number = rand.nextInt(100);
        0 ile 100 arasında sayı üretme
         */
        int number = (int) (Math.random() * 100);
        int right = 5;
        int number1;
        boolean isWrong = false;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            number1 = input.nextInt();

            if (number1 >= 0 && number1 <= 100) {
                if (number1 > number) {
                    right--;
                    if (right == 0) {
                        System.out.print("Hakkınız bitmiştir. Sayıyı bilemediniz. Sayı " + number + " idi.");
                        break;
                    }
                    System.out.println("Daha küçük sayı girin! Kalan hakkınız : " + right);
                }
                else if (number1 < number) {
                    right--;
                    if (right == 0) {
                        System.out.print("Hakkınız bitmiştir. Sayıyı bilemediniz. Sayı " + number + " idi.");
                        break;
                    }
                    System.out.println("Daha büyük sayı girin! Kalan hakkınız: " + right);
                } else {
                    System.out.println("Tahmininiz doğru ! Tahmin ettiğin sayi : " + number);
                    break;
                }
            } else {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (!(isWrong)) {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                } else {
                    right--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + right);
                }
                continue;
            }


        }


    }

}
