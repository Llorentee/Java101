package PatikaStore;

import java.util.Comparator;

public class MarkaComparator implements Comparator<Markalar> {
    @Override
    public int compare(Markalar m1, Markalar m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
