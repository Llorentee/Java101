import java.util.Scanner;

public class RecursiveUsAlma {
    // Us(a,b) = Us(a,b-1) * a
    // Us(2,5) = Us(2,4) * 2
    // Us(2,4) = Us(2,3) * 2
    // Us(2,3) = Us(2,2) * 2
    // Us(2,2) = Us(2,1) * 2
    // Us(2,1) = 2


    static int Us(int a, int b) {
        if (b == 1) {
            return a;
        }
        return Us(a, b-1) * a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Taban değerini giriniz: ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b = input.nextInt();
        System.out.print(Us(a, b));

    }
}
