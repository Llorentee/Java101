import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int m, ilksayi = 0, ikincisayi = 1, sayi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci dizisinin eleman sayısı: ");
        m = input.nextInt();

        System.out.print(m + " Elemanlı Fibonacci serisi : " + ilksayi + "\t" + ikincisayi + "\t");

        for (int i = 1; i <= m - 2; i++) {
            sayi = ikincisayi + ilksayi;
            ilksayi = ikincisayi;
            System.out.print(sayi + "\t");
            ikincisayi = sayi;
        }
    }
}
