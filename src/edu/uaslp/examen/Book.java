package edu.uaslp.examen;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private Short stars;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setStars(Short stars) {
        this.stars = stars;
    }

    public Short getStars() {
        return stars;
    }
}
