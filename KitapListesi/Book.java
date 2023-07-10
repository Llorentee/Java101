package KitapListesi;

public class Book {

    private String book_name;
    private int page_number;
    private String author_name;
    private String release_date;

    public Book(String book_name, int page_number, String author_name, String release_date) {
        this.book_name = book_name;
        this.page_number = page_number;
        this.author_name = author_name;
        this.release_date = release_date;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
