import java.util.Scanner;

public class HavaSicaklikGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Havanın sıcaklığı: ");
        sicaklik = input.nextInt();

        if (sicaklik <= 5){
            System.out.println("Bugün kayak yapabiliriz.");
        } else if (sicaklik > 5 && sicaklik < 15) {
            System.out.println("Bugün sinemaya gidebiliriz.");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Bugün pikniğe gidebiliriz.");
        } else {
            System.out.println("Bugün yüzmeye gidebiliriz hava çok güzel.");
        }

    }
}
