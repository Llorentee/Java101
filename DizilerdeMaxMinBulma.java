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

        Arrays.fill(list, list.length - 1, list.length, a);
        Arrays.sort(list);
        //System.out.println(Arrays.toString(list));

        for (int i : list) {
            if (a == i) {
                index = Arrays.binarySearch(list, i);
            }
        }

        System.out.println("Girelen sayıdan küçük en yakın sayı : " + list[index - 1]);
        System.out.println("Girelen sayıdan büyük en yakın sayı : " + list[index  + 1]);


    }
}
