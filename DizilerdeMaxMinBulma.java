import java.util.Scanner;
import java.util.Arrays;

public class DizilerdeMaxMinBulma {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int a;
        int index = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayı : ");
        a = input.nextInt();
        int[] list1 = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            list1[i] = list[i];
        }
        list1[list.length] = a;
        Arrays.sort(list1);
        System.out.println(Arrays.toString(list1));

        for (int i : list1) {
            if (a == i) {
                index = Arrays.binarySearch(list1, i);
            }
        }

        for (int j = index + 1; j < list1.length; j++) {
            if (a != list1[j]) {
                System.out.println("Girelen sayıdan büyük en yakın sayı : " + list1[j]);
                break;
            }
        }
        for (int k = index - 1; k > 0; k--) {
            if (a != list1[k]) {
                System.out.println("Girelen sayıdan küçük en yakın sayı : " + list1[k]);
                break;
            }
        }



        /*
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

         */


    }
}
