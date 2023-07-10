package KitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("wdhsfw", 34, "dfsd", "2012");
        Book book2 = new Book("wdsdfw", 45, "df435sd", "2000");
        Book book3 = new Book("wdffdsw", 323, "dfs546d", "2002");
        Book book4 = new Book("wdfjjfw", 657, "df234sd", "2011");
        Book book5 = new Book("wdkdfw", 985, "dfs234d", "2019");
        Book book6 = new Book("wdhsfdfw", 312, "d654fsd", "2016");
        Book book7 = new Book("wdfgsdw", 233, "dfs523d", "2013");
        Book book8 = new Book("wdfukuw", 33, "dfs46d", "2006");
        Book book9 = new Book("wdfgdhnw", 79, "df654sd", "2008");
        Book book10 = new Book("wddfhfw", 123, "df865sd", "2007");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        //books.stream().forEach(i -> System.out.println("Kitap ismi : " + i.getBook_name() + " Kitabın yazarı : " + i.getAuthor_name()));

        Map<String, String> books_map = new HashMap<>();
        for (Book b : books) {
            books_map.put(b.getBook_name(), b.getAuthor_name());
        }
        books_map.forEach((book_name, author) -> System.out.println("Kitap ismi : " + book_name + "  Kitabın yazarı : " + author));
        System.out.println();

        // Sayfa sayısı 100 den fazla olan kitaplar
        List<Book> new_books = new ArrayList<>();
        books.stream().filter(number -> number.getPage_number() > 100).forEach(i -> new_books.add(i));
        new_books.stream().forEach(i -> System.out.println("Kitap ismi : " + i.getBook_name() + "  Kitabın yazarı : " + i.getAuthor_name() + "  Sayfa sayısı : " + i.getPage_number() + "  Yayın tarihi : " + i.getRelease_date()));



    }
}
