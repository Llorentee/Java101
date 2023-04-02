import java.util.Arrays;

public class DizideTekrarEdenElemanSayisi {
    static boolean isTrue(int[] l, int value) {
        for (int m = 0; m < l.length; m++) {
            if (l[m] == value) {
                return false;
            }
        }
        return true;
    }

    static void frekans(int[] l) {
        int n = 0;
        int[] new_liste = new int[l.length];

        for (int i = 0; i < l.length; i++) {
            int k = 1;
            for (int j = 0; j < l.length; j++) {
                if (i != j && l[i] == l[j]) {
                    k++;
                }
            }
            if (isTrue(new_liste, l[i])) {
                new_liste[n] = l[i];
                System.out.println(new_liste[n] + " sayısı " + k + " kere tekrar edildi.");
                n++;
            }
        }
    }
    /*
    static boolean isTrue(int[] l, int value, int i) {
        for (int m = i + 1; m < l.length; m++) {
            if (l[m] == value) {
                return true;
            }
        }
        return false;
    }

    static void frekans(int[] l) {
        int n = 0;
        int[] new_liste = new int[l.length];

        for (int i = 0; i < l.length; i++) {
            int k = 1;
            for (int j = 0; j < l.length; j++) {
                if (i != j && l[i] == l[j]) {
                    k++;
                }
            }
            if (!(isTrue(l, l[i], i))) {
                new_liste[n] = l[i];
                System.out.println(new_liste[n] + " sayısı " + k + " kere tekrar edildi.");
                n++;
            }
        }
    }
     */

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 5, 7, 7, 10, 20};

        frekans(list);
    }
}

