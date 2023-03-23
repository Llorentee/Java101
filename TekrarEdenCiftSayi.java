import java.util.Arrays;

public class TekrarEdenCiftSayi {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 6, 10, 7, 3, 4, 3, 12, 2, 9, 42, 10, 21, 6, 12, 1, 33, 9, 1, 2, 4, 4, 42};
        int[] duplicate = new int[list.length];
        int startIndeks = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && list[i] == list[j]) {
                        if (!(isFind(duplicate, list[i]))) {
                            duplicate[startIndeks] = list[i];
                            startIndeks++;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }



        /*

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!(isFind(duplicate, list[i]))) {
                        duplicate[startIndeks++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }

         */
    }
}
