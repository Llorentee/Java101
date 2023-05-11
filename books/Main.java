package books;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new BookNameComparator());
        TreeSet<Book> books1 = new TreeSet<>(new BookPagesComparator());

        books.add(new Book("Peter Pan", 250, "Ömer", "2005"));
        books.add(new Book("Karayip Korsanlar", 270, "Emir", "2009"));
        books.add(new Book("Pinokyo", 170, "Mehmet", "2002"));
        books.add(new Book("Geceler", 210, "Zeynep", "1999"));
        books.add(new Book("Daire", 230, "Hasan", "2017"));

        books1.add(new Book("Peter Pan", 250, "Ömer", "2005"));
        books1.add(new Book("Karayip Korsanlar", 270, "Emir", "2009"));
        books1.add(new Book("Pinokyo", 170, "Mehmet", "2002"));
        books1.add(new Book("Geceler", 210, "Zeynep", "1999"));
        books1.add(new Book("Daire", 230, "Hasan", "2017"));

        for (Book b : books) {
            System.out.println(b.getBookName());
        }

        System.out.println();

        for (Book b : books1) {
            System.out.println(b.getNumberOfPages());
        }

    }
}
