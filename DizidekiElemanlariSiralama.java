import java.util.Scanner;
import java.util.Arrays;

public class DizidekiElemanlariSiralama {

    static int[] arr(int[] arr1, int l) {
        int s = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr1[i] > arr1[j]) {
                    s = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = s;
                }
            }
        }
        return arr1;

    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = input.nextInt();
        }

        System.out.print(Arrays.toString(arr(list, n)));

        //System.out.print(Arrays.toString(list));
    }
}
