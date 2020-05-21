package zad1;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private Date releaseDate;

    public Book(String title, String author, Date releaseDate) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate;
    }
}
