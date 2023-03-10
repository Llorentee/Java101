import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean asalmi = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;
                    break;
                }
            }
            if (asalmi == true) {
                System.out.print(i + "\t");
            }
        }
    }
}





