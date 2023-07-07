package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.List;

public class TekCiftSayilar implements Runnable {
    private final Object LOCK = new Object();

    public static List<Integer> tek_sayilar = new ArrayList<>();
    public static List<Integer> cift_sayilar = new ArrayList<>();
    public static List<Integer> numbers1;
    public static List<Integer> numbers2;
    public static List<Integer> numbers3;
    public static List<Integer> numbers4;

    public int j = 0;
    @Override
    public void run() {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        List<Integer> numbers1 = numbers.subList(0, 2500);
        List<Integer> numbers2 = numbers.subList(2500, 5000);
        List<Integer> numbers3 = numbers.subList(5000, 7500);
        List<Integer> numbers4 = numbers.subList(7500, 10000);

        List<List<Integer>> numbers_list = new ArrayList<>();
        numbers_list.add(numbers1);
        numbers_list.add(numbers2);
        numbers_list.add(numbers3);
        numbers_list.add(numbers4);


        synchronized (LOCK) {
            while (j < numbers_list.size()) {
                for (int k = 0; k < numbers_list.get(j).size(); k++) {
                    if (numbers_list.get(j).get(k) % 2 == 0) {
                        cift_sayilar.add(numbers_list.get(j).get(k));
                    } else {
                        tek_sayilar.add(numbers_list.get(j).get(k));
                    }
                }
                j++;
                break;
            }
        }

    }

}


