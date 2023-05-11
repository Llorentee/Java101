package books;

import java.util.Comparator;

public class Book {
    private String BookName;
    private int NumberOfPages;
    private String AuthorName;
    private String ReleaseDate;

    public Book(String bookName, int numberOfPages, String authorName, String releaseDate) {
        BookName = bookName;
        NumberOfPages = numberOfPages;
        AuthorName = authorName;
        ReleaseDate = releaseDate;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

}
