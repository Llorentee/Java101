import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double ar = 2.14, el = 3.67, dom = 1.11, mu = 0.95, pat = 5.0,toplam = 0,kilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ?: ");
        kilo = input.nextDouble();
        toplam += (ar * kilo);
        System.out.print("Elma kaç kilo ?: ");
        kilo = input.nextDouble();
        toplam += (el * kilo);
        System.out.print("domates kaç kilo ?: ");
        kilo = input.nextDouble();
        toplam += (dom * kilo);
        System.out.print("Muz kaç kilo ?: ");
        kilo = input.nextDouble();
        toplam += (mu * kilo);
        System.out.print("Armut kaç kilo ?: ");
        kilo = input.nextDouble();
        toplam += (pat * kilo);

        System.out.println("Toplam Tutar: " + toplam);




    }
}
