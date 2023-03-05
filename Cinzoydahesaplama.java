import java.util.Scanner;

public class Cinzoydahesaplama {
    public static void main(String[] args) {
        int Dogumtarihi;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        Dogumtarihi = input.nextInt();

        if (Dogumtarihi % 12 == 0) {
            System.out.print("Çin zodyağı burcunuz: Maymun");
        } else if (Dogumtarihi % 12 == 1) {
            System.out.print("Çin zodyağı burcunuz: Horoz");
        } else if (Dogumtarihi % 12 == 2) {
            System.out.print("Çin zodyağı burcunuz: Köpek");
        } else if (Dogumtarihi % 12 == 3) {
            System.out.print("Çin zodyağı burcunuz: Domuz");
        } else if (Dogumtarihi % 12 == 4) {
            System.out.print("Çin zodyağı burcunuz: Fare");
        } else if (Dogumtarihi % 12 == 5) {
            System.out.print("Çin zodyağı burcunuz: Öküz");
        } else if (Dogumtarihi % 12 == 6) {
            System.out.print("Çin zodyağı burcunuz: Kaplan");
        } else if (Dogumtarihi % 12 == 7) {
            System.out.print("Çin zodyağı burcunuz: Tavşan");
        } else if (Dogumtarihi % 12 == 8) {
            System.out.print("Çin zodyağı burcunuz: Ejderha");
        } else if (Dogumtarihi % 12 == 9) {
            System.out.print("Çin zodyağı burcunuz: Yılan");
        } else if (Dogumtarihi % 12 == 10) {
            System.out.print("Çin zodyağı burcunuz: At");
        } else if (Dogumtarihi % 12 == 11) {
            System.out.print("Çin zodyağı burcunuz: Koyun");
        } else {
            System.out.print("Yeniden deniyiniz!!");
        }
    }
}
