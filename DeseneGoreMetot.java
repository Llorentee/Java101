import java.util.Scanner;

public class DeseneGoreMetot {

    static int nMetotu(int a,int b) {

        if (a > 0) {
            System.out.print(a + "\t");
            a -= 5;
            if (a <= 0) {
                System.out.print(a + "\t");
                while (a != b) {
                    a += 5;
                    System.out.print(a + "\t");
                }
            } else {
                nMetotu(a,b);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n,temp;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı: ");
        n = input.nextInt();

        temp = n;
        nMetotu(n,temp);


    }
}
